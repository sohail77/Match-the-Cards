package com.example.matchthecards.gamefragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010#\u001a\u00020$H\u0002J\u0006\u0010%\u001a\u00020\u0006J\b\u0010&\u001a\u00020$H\u0002J\u000e\u0010\'\u001a\u00020$2\u0006\u0010(\u001a\u00020)J\u000e\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020\u0012J\u0014\u0010,\u001a\u00020$2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017J\u0006\u0010-\u001a\u00020$J\u0006\u0010.\u001a\u00020$R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000eR \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u000e\u00a8\u0006/"}, d2 = {"Lcom/example/matchthecards/gamefragment/GameViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "adapter", "Lcom/example/matchthecards/adapter/CardRecycleViewAdapter;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "isPlayer2", "Landroidx/lifecycle/MutableLiveData;", "", "()Landroidx/lifecycle/MutableLiveData;", "setPlayer2", "(Landroidx/lifecycle/MutableLiveData;)V", "player1Score", "", "getPlayer1Score", "player2Score", "getPlayer2Score", "productList", "", "Lcom/example/matchthecards/model/Products;", "getProductList", "products", "", "getProducts", "()Ljava/util/List;", "setProducts", "(Ljava/util/List;)V", "winner", "", "getWinner", "eventListener", "", "getProductsAdapter", "getProductsFromApi", "modifyProductList", "list", "Lcom/example/matchthecards/model/ProductsObject;", "setDifficultyLevel", "difficulty", "setProductsAdapter", "shuffleCards", "updateScore", "app_debug"})
public final class GameViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private com.example.matchthecards.adapter.CardRecycleViewAdapter adapter;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.matchthecards.model.Products>> productList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> player1Score = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> player2Score = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> winner = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.matchthecards.model.Products> products;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isPlayer2;
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.matchthecards.model.Products>> getProductList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getPlayer1Score() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getPlayer2Score() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getWinner() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.matchthecards.model.Products> getProducts() {
        return null;
    }
    
    public final void setProducts(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.matchthecards.model.Products> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isPlayer2() {
        return null;
    }
    
    public final void setPlayer2(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.matchthecards.adapter.CardRecycleViewAdapter getProductsAdapter() {
        return null;
    }
    
    public final void setProductsAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.matchthecards.model.Products> list) {
    }
    
    public final void setDifficultyLevel(int difficulty) {
    }
    
    /**
     * Gets called when the cards match or not.
     * This function is used to update the score and change the player if there was no match
     */
    private final void eventListener() {
    }
    
    /**
     * Update the score
     * Check if any of the player has won?
     */
    public final void updateScore() {
    }
    
    /**
     * Get the products from the API provided
     */
    private final void getProductsFromApi() {
    }
    
    /**
     * Modify the products so that a match of 2,3,4 of the same product is possible
     * Takes the first 10 products and replicates and shuffles them to create the final list.
     */
    public final void modifyProductList(@org.jetbrains.annotations.NotNull()
    com.example.matchthecards.model.ProductsObject list) {
    }
    
    /**
     * Shuffle the cards when the user shakes the device
     */
    public final void shuffleCards() {
    }
    
    public GameViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}