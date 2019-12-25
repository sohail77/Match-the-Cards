package com.example.matchthecards.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"BASE_URL", "", "COLUMN_SIZE", "DIFFICULTY_LEVEL", "TRANSITION_TO_GAME", "URL_EXTRAS", "app_debug"})
public final class ConstantsKt {
    
    /**
     * Used for making API Calls
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_URL = "https://shopicruit.myshopify.com/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String URL_EXTRAS = "admin/products.json?page=1&access_token=c32313df0d0ef512ca64d5b336a0d7c6";
    
    /**
     * Used to send data from MenuFragment to GameFragment
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COLUMN_SIZE = "size";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DIFFICULTY_LEVEL = "difficulty";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TRANSITION_TO_GAME = "gameTransition";
}