package com.example.sirmaconsult.tasks;

import java.lang.System;

/**
 * Adapter for the task list. Has a reference to the [TasksViewModel] to send actions back to it.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/sirmaconsult/tasks/TasksAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/sirmaconsult/data/Task;", "Lcom/example/sirmaconsult/tasks/TasksAdapter$ViewHolder;", "viewModel", "Lcom/example/sirmaconsult/tasks/TasksViewModel;", "(Lcom/example/sirmaconsult/tasks/TasksViewModel;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "sirmaconsult_debug"})
public final class TasksAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.sirmaconsult.data.Task, com.example.sirmaconsult.tasks.TasksAdapter.ViewHolder> {
    private final com.example.sirmaconsult.tasks.TasksViewModel viewModel = null;
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.sirmaconsult.tasks.TasksAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.sirmaconsult.tasks.TasksAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    public TasksAdapter(@org.jetbrains.annotations.NotNull()
    com.example.sirmaconsult.tasks.TasksViewModel viewModel) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lcom/example/sirmaconsult/tasks/TasksAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/sirmaconsult/databinding/TaskItemBinding;", "(Lcom/example/sirmaconsult/databinding/TaskItemBinding;)V", "getBinding", "()Lcom/example/sirmaconsult/databinding/TaskItemBinding;", "bind", "", "viewModel", "Lcom/example/sirmaconsult/tasks/TasksViewModel;", "item", "Lcom/example/sirmaconsult/data/Task;", "Companion", "sirmaconsult_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.sirmaconsult.databinding.TaskItemBinding binding = null;
        public static final com.example.sirmaconsult.tasks.TasksAdapter.ViewHolder.Companion Companion = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.sirmaconsult.tasks.TasksViewModel viewModel, @org.jetbrains.annotations.NotNull()
        com.example.sirmaconsult.data.Task item) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.sirmaconsult.databinding.TaskItemBinding getBinding() {
            return null;
        }
        
        private ViewHolder(com.example.sirmaconsult.databinding.TaskItemBinding binding) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/sirmaconsult/tasks/TasksAdapter$ViewHolder$Companion;", "", "()V", "from", "Lcom/example/sirmaconsult/tasks/TasksAdapter$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "sirmaconsult_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.sirmaconsult.tasks.TasksAdapter.ViewHolder from(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
}