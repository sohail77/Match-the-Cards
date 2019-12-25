package com.example.matchthecards.model

import com.example.matchthecards.adapter.CardRecycleViewAdapter

/**
 * This is the model class for every card that is picked by the user.
 * Viewholder of the item is also saved to later turn back the cards when there is a no match.
 */
data class MatchedCard(
    var position: Int,
    var title: String,
    var holder: CardRecycleViewAdapter.ViewHolder
)