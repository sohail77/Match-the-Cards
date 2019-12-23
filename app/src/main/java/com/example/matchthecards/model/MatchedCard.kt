package com.example.matchthecards.model

import com.example.matchthecards.adapter.CardRecycleViewAdapter

data class MatchedCard(
    var position: Int,
    var title: String,
    var holder: CardRecycleViewAdapter.ViewHolder
)