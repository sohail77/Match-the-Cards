package com.example.matchthecards.utils;

import java.lang.System;

/**
 * This interface is used to trigger events when there is a match
 * and when there is no match
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&\u00a8\u0006\b"}, d2 = {"Lcom/example/matchthecards/utils/Matcher;", "", "matched", "", "list", "", "Lcom/example/matchthecards/model/MatchedCard;", "notMatched", "app_debug"})
public abstract interface Matcher {
    
    public abstract void matched(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.matchthecards.model.MatchedCard> list);
    
    public abstract void notMatched();
}