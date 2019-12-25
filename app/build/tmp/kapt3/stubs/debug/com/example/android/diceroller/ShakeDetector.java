package com.example.android.diceroller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001aB\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0015\u001a\u00020\nJ\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fJ\u0006\u0010\u0019\u001a\u00020\u0017R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/example/android/diceroller/ShakeDetector;", "", "context", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;)V", "getContext", "()Landroidx/fragment/app/FragmentActivity;", "interval", "", "isListening", "", "listener", "Lcom/example/android/diceroller/ShakeDetector$ShakeListener;", "sensorEventListener", "Landroid/hardware/SensorEventListener;", "sensorManager", "Landroid/hardware/SensorManager;", "supported", "Ljava/lang/Boolean;", "threshold", "", "isSupported", "startListening", "", "shakeListener", "stopListening", "ShakeListener", "app_debug"})
public final class ShakeDetector {
    
    /**
     * Accuracy configuration
     */
    private float threshold;
    private int interval;
    private android.hardware.SensorManager sensorManager;
    private com.example.android.diceroller.ShakeDetector.ShakeListener listener;
    
    /**
     * indicates whether or not Accelerometer Sensor is supported
     */
    private java.lang.Boolean supported;
    
    /**
     * Returns true if the manager is listening to orientation changes
     */
    private boolean isListening;
    private final android.hardware.SensorEventListener sensorEventListener = null;
    @org.jetbrains.annotations.Nullable()
    private final androidx.fragment.app.FragmentActivity context = null;
    
    /**
     * Returns true if at least one Accelerometer sensor is available
     */
    public final boolean isSupported() {
        return false;
    }
    
    /**
     * Registers a listener and start listening
     *
     * @param shakeListener callback for shake events
     */
    public final void startListening(@org.jetbrains.annotations.NotNull()
    com.example.android.diceroller.ShakeDetector.ShakeListener shakeListener) {
    }
    
    /**
     * Unregisters listeners
     */
    public final void stopListening() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.fragment.app.FragmentActivity getContext() {
        return null;
    }
    
    public ShakeDetector(@org.jetbrains.annotations.Nullable()
    androidx.fragment.app.FragmentActivity context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/android/diceroller/ShakeDetector$ShakeListener;", "", "onShake", "", "force", "", "(F)Lkotlin/Unit;", "app_debug"})
    public static abstract interface ShakeListener {
        
        @org.jetbrains.annotations.Nullable()
        public abstract kotlin.Unit onShake(float force);
    }
}