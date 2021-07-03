package com.example.sirmaconsult.timerlifecycle;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\u000eH\u0007R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/sirmaconsult/timerlifecycle/TimerToast;", "Landroidx/lifecycle/LifecycleObserver;", "application", "Landroid/app/Application;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "(Landroid/app/Application;Landroidx/lifecycle/LifecycleOwner;)V", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "started", "", "timer", "Landroid/os/CountDownTimer;", "start", "", "stop", "sirmaconsult_debug"})
public final class TimerToast implements androidx.lifecycle.LifecycleObserver {
    private boolean started = false;
    private androidx.lifecycle.Lifecycle lifecycle;
    private final android.os.CountDownTimer timer = null;
    
    @androidx.lifecycle.OnLifecycleEvent(value = androidx.lifecycle.Lifecycle.Event.ON_START)
    public final void start() {
    }
    
    @androidx.lifecycle.OnLifecycleEvent(value = androidx.lifecycle.Lifecycle.Event.ON_DESTROY)
    public final void stop() {
    }
    
    public TimerToast(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super();
    }
}