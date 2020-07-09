package com.example.sirmaconsult.tasks;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0007\u001a\u0018\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007\u00a8\u0006\f"}, d2 = {"setItems", "", "listView", "Landroidx/recyclerview/widget/RecyclerView;", "items", "", "Lcom/example/sirmaconsult/data/Task;", "setStyle", "textView", "Landroid/widget/TextView;", "enabled", "", "sirmaconsult_debug"})
public final class TasksListBindingKt {
    
    /**
     * [BindingAdapter]s for the [Task]s list.
     */
    @androidx.databinding.BindingAdapter(value = {"app:items"})
    public static final void setItems(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView listView, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.sirmaconsult.data.Task> items) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"app:completedTask"})
    public static final void setStyle(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, boolean enabled) {
    }
}