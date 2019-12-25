package com.example.matchthecards.utils

import com.example.matchthecards.model.MatchedCard

/**
 * This interface is used to trigger events when there is a match
 * and when there is no match
 */
interface Matcher {
    fun matched(list: List<MatchedCard>)
    fun notMatched()
}