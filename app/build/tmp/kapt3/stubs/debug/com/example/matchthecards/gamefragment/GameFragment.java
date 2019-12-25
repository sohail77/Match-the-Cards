package com.example.matchthecards.gamefragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\fH\u0016J\b\u0010\u0016\u001a\u00020\fH\u0016J\b\u0010\u0017\u001a\u00020\fH\u0002J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0003R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/example/matchthecards/gamefragment/GameFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/example/matchthecards/databinding/FragmentGameBinding;", "detector", "Lcom/example/android/diceroller/ShakeDetector;", "createDialog", "Landroid/app/AlertDialog;", "determineDifficultyLevel", "", "finsihGame", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "setRecyclerViewProperties", "showTheWinner", "winner", "", "app_debug"})
public final class GameFragment extends androidx.fragment.app.Fragment {
    private com.example.matchthecards.databinding.FragmentGameBinding binding;
    private com.example.android.diceroller.ShakeDetector detector;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    /**
     * Set the recycler views properties
     */
    private final void setRecyclerViewProperties() {
    }
    
    /**
     * We only want to listen for shake events when the fragment is visible
     */
    @java.lang.Override()
    public void onResume() {
    }
    
    /**
     * Stop listening for shake events when the fragment is not visible
     */
    @java.lang.Override()
    public void onPause() {
    }
    
    private final int determineDifficultyLevel() {
        return 0;
    }
    
    /**
     * Hide the cards and Show the Winner UI
     */
    @android.annotation.SuppressLint(value = {"RestrictedApi"})
    private final void showTheWinner(java.lang.String winner) {
    }
    
    private final void finsihGame() {
    }
    
    /**
     * Create a dialog to show the user, how to shuffle cards.
     */
    private final android.app.AlertDialog createDialog() {
        return null;
    }
    
    public GameFragment() {
        super();
    }
}