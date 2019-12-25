package com.example.matchthecards.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0002H\u0002J\b\u0010\u0013\u001a\u00020\u0010H\u0002J\b\u0010\u0014\u001a\u00020\u0007H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0002H\u0002J\u0018\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0007H\u0016J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0007H\u0016J\u0018\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0002H\u0002J\u000e\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u0007J\u0014\u0010\u001f\u001a\u00020\u00102\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0!J\u000e\u0010\"\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/example/matchthecards/adapter/CardRecycleViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/matchthecards/adapter/CardRecycleViewAdapter$ViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "difficultyLevel", "", "listener", "Lcom/example/matchthecards/utils/Matcher;", "matchList", "", "Lcom/example/matchthecards/model/MatchedCard;", "productList", "Lcom/example/matchthecards/model/Products;", "checkForSimilarity", "", "position", "holder", "closeCards", "getItemCount", "isSimilar", "", "onBindViewHolder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "openCard", "setDifficulty", "level", "setUpList", "list", "", "startListeningForMatches", "ViewHolder", "app_debug"})
public final class CardRecycleViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.matchthecards.adapter.CardRecycleViewAdapter.ViewHolder> {
    private java.util.List<com.example.matchthecards.model.Products> productList;
    private java.util.List<com.example.matchthecards.model.MatchedCard> matchList;
    private com.example.matchthecards.utils.Matcher listener;
    private int difficultyLevel;
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.matchthecards.adapter.CardRecycleViewAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.matchthecards.adapter.CardRecycleViewAdapter.ViewHolder holder, int position) {
    }
    
    public final void startListeningForMatches(@org.jetbrains.annotations.NotNull()
    com.example.matchthecards.utils.Matcher listener) {
    }
    
    public final void setUpList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.matchthecards.model.Products> list) {
    }
    
    public final void setDifficulty(int level) {
    }
    
    /**
     * Check if the cards are similar.
     * If they are similar then trigger an interface function which will remove the cards from the list
     * If they are not similar then close the cards back and empty the matchList
     */
    private final void checkForSimilarity(int position, com.example.matchthecards.adapter.CardRecycleViewAdapter.ViewHolder holder) {
    }
    
    /**
     * Check if a picked card is similar to all the previous picked cards
     */
    private final boolean isSimilar(int position, com.example.matchthecards.adapter.CardRecycleViewAdapter.ViewHolder holder) {
        return false;
    }
    
    /**
     * Close the cards and empty the list if a card is different
     */
    private final void closeCards() {
    }
    
    /**
     * Open the card if the picked cards are similar
     */
    private final void openCard(int position, com.example.matchthecards.adapter.CardRecycleViewAdapter.ViewHolder holder) {
    }
    
    public CardRecycleViewAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\f\u00a8\u0006\u000f"}, d2 = {"Lcom/example/matchthecards/adapter/CardRecycleViewAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "productCard", "Landroidx/cardview/widget/CardView;", "getProductCard", "()Landroidx/cardview/widget/CardView;", "productImage", "Landroid/widget/ImageView;", "getProductImage", "()Landroid/widget/ImageView;", "questionMark", "getQuestionMark", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getProductImage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getQuestionMark() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.cardview.widget.CardView getProductCard() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}