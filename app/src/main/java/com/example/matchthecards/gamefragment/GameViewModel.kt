package com.example.matchthecards.gamefragment

import android.app.Application
import android.content.Context
import android.widget.Toast
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.matchthecards.adapter.CardRecycleViewAdapter
import com.example.matchthecards.api.ProductApi
import com.example.matchthecards.model.MatchedCard
import com.example.matchthecards.model.Products
import com.example.matchthecards.model.ProductsObject
import com.example.matchthecards.utils.Matcher
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class GameViewModel(application: Application) : AndroidViewModel(application) {

    val context: Context = application.applicationContext
    private var adapter: CardRecycleViewAdapter
    val productList = MutableLiveData<List<Products>>()
    val player1Score = MutableLiveData<Int>()
    val player2Score = MutableLiveData<Int>()
    val winner = MutableLiveData<String>()
    var products = mutableListOf<Products>()
    var isPlayer2 = MutableLiveData<Boolean>()

    /**
     * Initialize the adapter and scores when the fragment is created
     */
    init {
        adapter = CardRecycleViewAdapter(context)
        player1Score.value = 0
        player2Score.value = 0
        getProductsFromApi()
        isPlayer2.value = false
        eventListener()
    }

    fun getProductsAdapter() = adapter

    fun setProductsAdapter(list: List<Products>) {
        adapter.setUpList(list)
        adapter.notifyDataSetChanged()
    }

    fun setDifficultyLevel(difficulty: Int) = adapter.setDifficulty(difficulty)

    /**
     * Gets called when the cards match or not.
     * This function is used to update the score and change the player if there was no match
     */
    private fun eventListener() {
        adapter.startListeningForMatches(object : Matcher {
            override fun matched(list: List<MatchedCard>) {
                for (element in list) products.removeAt(element.position)
                Toast.makeText(context,"Yay! you found a match :)",Toast.LENGTH_SHORT).show()
                setProductsAdapter(products)
                updateScore()
            }

            override fun notMatched() {
                isPlayer2.value = isPlayer2.value != true
                Toast.makeText(context,"Cards Don't match :(",Toast.LENGTH_SHORT).show()
            }
        })
    }

    /**
     * Update the score
     * Check if any of the player has won?
     */
    fun updateScore() {
        if (isPlayer2.value == false) player1Score.value = player1Score.value?.inc()
        else player2Score.value = player2Score.value?.inc()

        when {
            player1Score.value == 10 -> winner.value = "Player 1 wins!"
            player2Score.value == 10 -> winner.value = "Player 2 wins!"
        }
    }

    /**
     * Get the products from the API provided
     */
    private fun getProductsFromApi() {
        ProductApi.retrofitService.getProducts()
            .enqueue(object : Callback<ProductsObject> {

                override fun onResponse(
                    call: Call<ProductsObject>,
                    response: Response<ProductsObject>
                ) {
                    val list = response.body()
                    list?.let { modifyProductList(it) }

                }

                override fun onFailure(call: Call<ProductsObject>, t: Throwable) {
                    Toast.makeText(context, "Check your Internet", Toast.LENGTH_LONG).show()
                }
            })
    }

    /**
     * Modify the products so that a match of 2,3,4 of the same product is possible
     * Takes the first 10 products and replicates and shuffles them to create the final list.
     */
    fun modifyProductList(list: ProductsObject) {
        products = mutableListOf()
        val subList = list.products.subList(0, 10)
        for (i in 0 until 5) {
            products.let { list1 -> subList.let(list1::addAll) }
        }
        products.shuffle()
        productList.value = products
    }

    /**
     * Shuffle the cards when the user shakes the device
     */
    fun shuffleCards() {
        products.shuffle()
        setProductsAdapter(products)
        Toast.makeText(context, "Cards shuffled", Toast.LENGTH_LONG).show()
    }

}