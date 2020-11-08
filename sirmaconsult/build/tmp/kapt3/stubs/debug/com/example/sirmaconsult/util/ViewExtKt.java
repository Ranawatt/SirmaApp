package com.example.sirmaconsult.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 2, d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u001a.\u0010\u0007\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0006\u0010\u000e\u001a\u00020\r\u001a\u001a\u0010\u000f\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r\u00a8\u0006\u0012"}, d2 = {"setupRefreshLayout", "", "Landroidx/fragment/app/Fragment;", "refreshLayout", "Lcom/example/sirmaconsult/ScrollChildSwipeRefreshLayout;", "scrollUpChild", "Landroid/view/View;", "setupSnackbar", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "snackbarEvent", "Landroidx/lifecycle/LiveData;", "Lcom/example/sirmaconsult/Event;", "", "timeLength", "showSnackbar", "snackbarText", "", "sirmaconsult_debug"})
public final class ViewExtKt {
    
    /**
     * Transforms static java function Snackbar.make() to an extension function on View.
     */
    public static final void showSnackbar(@org.jetbrains.annotations.NotNull()
    android.view.View $this$showSnackbar, @org.jetbrains.annotations.NotNull()
    java.lang.String snackbarText, int timeLength) {
    }
    
    /**
     * Triggers a snackbar message when the value contained by snackbarTaskMessageLiveEvent is modified.
     */
    public static final void setupSnackbar(@org.jetbrains.annotations.NotNull()
    android.view.View $this$setupSnackbar, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.example.sirmaconsult.Event<java.lang.Integer>> snackbarEvent, int timeLength) {
    }
    
    public static final void setupRefreshLayout(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$setupRefreshLayout, @org.jetbrains.annotations.NotNull()
    com.example.sirmaconsult.ScrollChildSwipeRefreshLayout refreshLayout, @org.jetbrains.annotations.Nullable()
    android.view.View scrollUpChild) {
    }
}