package com.example.sirmaconsult.tasks;

import java.lang.System;

/**
 * Display a grid of [Task]s. User can choose to view all, active or completed tasks.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0012\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001b\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020\u00142\u0006\u0010\'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020\u0014H\u0002J\b\u0010*\u001a\u00020\u0014H\u0002J\b\u0010+\u001a\u00020\u0014H\u0002J\b\u0010,\u001a\u00020\u0014H\u0002J\b\u0010-\u001a\u00020\u0014H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006."}, d2 = {"Lcom/example/sirmaconsult/tasks/TasksFragment;", "Landroidx/fragment/app/Fragment;", "()V", "args", "Lcom/example/sirmaconsult/tasks/TasksFragmentArgs;", "getArgs", "()Lcom/example/sirmaconsult/tasks/TasksFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "listAdapter", "Lcom/example/sirmaconsult/tasks/TasksAdapter;", "viewDataBinding", "Lcom/example/sirmaconsult/databinding/TasksFragBinding;", "viewModel", "Lcom/example/sirmaconsult/tasks/TasksViewModel;", "getViewModel", "()Lcom/example/sirmaconsult/tasks/TasksViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "navigateToAddNewTask", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "openTaskDetails", "taskId", "", "setupFab", "setupListAdapter", "setupNavigation", "setupSnackbar", "showFilteringPopUpMenu", "sirmaconsult_debug"})
public final class TasksFragment extends androidx.fragment.app.Fragment {
    private final kotlin.Lazy viewModel$delegate = null;
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private com.example.sirmaconsult.databinding.TasksFragBinding viewDataBinding;
    private com.example.sirmaconsult.tasks.TasksAdapter listAdapter;
    private java.util.HashMap _$_findViewCache;
    
    private final com.example.sirmaconsult.tasks.TasksViewModel getViewModel() {
        return null;
    }
    
    private final com.example.sirmaconsult.tasks.TasksFragmentArgs getArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupNavigation() {
    }
    
    private final void setupSnackbar() {
    }
    
    private final void showFilteringPopUpMenu() {
    }
    
    private final void setupFab() {
    }
    
    private final void navigateToAddNewTask() {
    }
    
    private final void openTaskDetails(java.lang.String taskId) {
    }
    
    private final void setupListAdapter() {
    }
    
    public TasksFragment() {
        super();
    }
}