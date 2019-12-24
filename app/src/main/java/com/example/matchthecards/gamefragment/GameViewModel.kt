package com.example.matchthecards.gamefragment

import android.app.Application
import android.os.CountDownTimer
import android.util.Log
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

class GameViewModel (application: Application) : AndroidViewModel(application) {

    val context = application.applicationContext
    private var adapter : CardRecycleViewAdapter
    val productList = MutableLiveData<List<Products>>()
    val player1Score = MutableLiveData<Int>()
    val player2Score = MutableLiveData<Int>()
    var products = mutableListOf<Products>()
    var isPlayer2 = MutableLiveData<Boolean>()

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


    fun eventListener() {
        adapter.startListeningForMatches(object : Matcher {
            override fun matched(list: List<MatchedCard>) {
                for (i in 0 until list.size) products.removeAt(list[i].position)
                setProductsAdapter(products)
                updateScore()
            }
            override fun notMatched() {
                isPlayer2.value = isPlayer2.value != true
            }
        })
    }

    fun updateScore() {
        if (isPlayer2.value == false) {
            player1Score.value = player1Score.value?.inc()
        } else {
            player2Score.value = player2Score.value?.inc()
        }
    }

    fun getProductsFromApi() {
        ProductApi.retrofitService.getProducts()
            .enqueue(object : Callback<ProductsObject> {

                override fun onResponse(
                    call: Call<ProductsObject>,
                    response: Response<ProductsObject>
                ) {
                    val list = response.body()
                    list?.let { modifyProductList(it) }
                    Log.e("Hello",list.toString())

                }

                override fun onFailure(call: Call<ProductsObject>, t: Throwable) {
                    Toast.makeText(context,"Check your Internet", Toast.LENGTH_LONG).show()
                }
            })
    }

    fun modifyProductList(list: ProductsObject) {
        products = mutableListOf()
        val subList = list.products.subList(0,10)
        for (i in 0 until 5) {
            products.let { list1 -> subList.let(list1::addAll) }
        }
        products.shuffle()
        productList.value = products
    }


}