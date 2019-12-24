package com.example.matchthecards.adapter

import android.content.Context
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.matchthecards.R
import com.example.matchthecards.model.MatchedCard
import com.example.matchthecards.model.Products
import com.example.matchthecards.utils.Matcher
import kotlinx.android.synthetic.main.card_item.view.*

class CardRecycleViewAdapter (context: Context) : RecyclerView.Adapter<CardRecycleViewAdapter.ViewHolder> () {

    private var productList = mutableListOf<Products>()
    private var matchList = mutableListOf<MatchedCard>()
    private var listener: Matcher? = null
    val context = context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.card_item, parent, false))
    }

    override fun getItemCount() = productList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


        holder.productCard.setOnClickListener { checkForSimilarity(position, holder) }
    }

    fun startListeningForMatches(listener: Matcher) {
        this.listener = listener
    }

    fun setUpList(list: List<Products>) {
        productList = list as MutableList<Products>
    }

    private fun checkForSimilarity(position: Int, holder: ViewHolder) {
        if (matchList.size > 0) {
            if (isSimilar(position,holder)) {
                openCard(position, holder)
                Handler().postDelayed({
                    listener?.matched(matchList)
                    matchList = mutableListOf()
                }, 2000)
            } else{
                openCard(position, holder)
                Handler().postDelayed({
                    closeCards()
                    listener?.notMatched()
                }, 2000)
            }
        } else {
            matchList.add(MatchedCard(position,productList[position].title,holder))
            openCard(position, holder)
        }
    }

    private fun isSimilar(position: Int, holder: ViewHolder) : Boolean {
        matchList.add(MatchedCard(position,productList[position].title,holder))
        for (name in 0 until matchList.size) if (!productList[position].title.equals(matchList[name].title)) {
            return false
        }
        return true
    }

    private fun closeCards() {
        for (i in 0 until matchList.size) {
            matchList[i].holder.questionMark.visibility = View.VISIBLE
            matchList[i].holder.productImage.visibility = View.GONE
        }
        matchList = mutableListOf()
    }

    private fun openCard(position: Int, holder: ViewHolder) {
        Glide.with(context).load(productList[position].image.url).into(holder.productImage)
        holder.questionMark.visibility = View.GONE
        holder.productImage.visibility = View.VISIBLE
    }


    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        val productImage: ImageView
            get() = itemView.card_img

        val questionMark: ImageView
            get() = itemView.question_mark

        val productCard: CardView
            get() = itemView.product_card
    }

}