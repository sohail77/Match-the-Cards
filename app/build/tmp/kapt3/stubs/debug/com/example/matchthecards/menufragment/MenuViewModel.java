package com.example.matchthecards.menufragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000e\u001a\u00020\fJ\u0006\u0010\u000f\u001a\u00020\fR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007\u00a8\u0006\u0010"}, d2 = {"Lcom/example/matchthecards/menufragment/MenuViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "columnSize", "Landroidx/lifecycle/MutableLiveData;", "", "getColumnSize", "()Landroidx/lifecycle/MutableLiveData;", "difficultyLevel", "", "getDifficultyLevel", "columnSizeDecrementor", "", "columnSizeIncrementor", "diffDecrementor", "diffIncrementor", "app_debug"})
public final class MenuViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> difficultyLevel = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> columnSize = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getDifficultyLevel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getColumnSize() {
        return null;
    }
    
    /**
     * These 4 functions are triggered when the + and - buttons are clicked in the UI.
     */
    public final void diffIncrementor() {
    }
    
    public final void diffDecrementor() {
    }
    
    public final void columnSizeIncrementor() {
    }
    
    public final void columnSizeDecrementor() {
    }
    
    public MenuViewModel() {
        super();
    }
}