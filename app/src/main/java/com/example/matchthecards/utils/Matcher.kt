package com.example.matchthecards.utils

import com.example.matchthecards.model.MatchedCard

interface Matcher {
    fun matched(list: List<MatchedCard>)
}