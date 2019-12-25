package com.example.matchthecards.model;

import java.lang.System;

/**
 * This is the model class for every card that is picked by the user.
 * Viewholder of the item is also saved to later turn back the cards when there is a no match.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001e"}, d2 = {"Lcom/example/matchthecards/model/MatchedCard;", "", "position", "", "title", "", "holder", "Lcom/example/matchthecards/adapter/CardRecycleViewAdapter$ViewHolder;", "(ILjava/lang/String;Lcom/example/matchthecards/adapter/CardRecycleViewAdapter$ViewHolder;)V", "getHolder", "()Lcom/example/matchthecards/adapter/CardRecycleViewAdapter$ViewHolder;", "setHolder", "(Lcom/example/matchthecards/adapter/CardRecycleViewAdapter$ViewHolder;)V", "getPosition", "()I", "setPosition", "(I)V", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class MatchedCard {
    private int position;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String title;
    @org.jetbrains.annotations.NotNull()
    private com.example.matchthecards.adapter.CardRecycleViewAdapter.ViewHolder holder;
    
    public final int getPosition() {
        return 0;
    }
    
    public final void setPosition(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.matchthecards.adapter.CardRecycleViewAdapter.ViewHolder getHolder() {
        return null;
    }
    
    public final void setHolder(@org.jetbrains.annotations.NotNull()
    com.example.matchthecards.adapter.CardRecycleViewAdapter.ViewHolder p0) {
    }
    
    public MatchedCard(int position, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    com.example.matchthecards.adapter.CardRecycleViewAdapter.ViewHolder holder) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.matchthecards.adapter.CardRecycleViewAdapter.ViewHolder component3() {
        return null;
    }
    
    /**
     * This is the model class for every card that is picked by the user.
     * Viewholder of the item is also saved to later turn back the cards when there is a no match.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.matchthecards.model.MatchedCard copy(int position, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    com.example.matchthecards.adapter.CardRecycleViewAdapter.ViewHolder holder) {
        return null;
    }
    
    /**
     * This is the model class for every card that is picked by the user.
     * Viewholder of the item is also saved to later turn back the cards when there is a no match.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * This is the model class for every card that is picked by the user.
     * Viewholder of the item is also saved to later turn back the cards when there is a no match.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * This is the model class for every card that is picked by the user.
     * Viewholder of the item is also saved to later turn back the cards when there is a no match.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}