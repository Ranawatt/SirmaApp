package com.example.sirmaconsult.addedittask;

import java.lang.System;

/**
 * ViewModel for the Add/Edit screen.
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020\fH\u0002J\u0010\u0010&\u001a\u00020\f2\u0006\u0010\'\u001a\u00020$H\u0002J\u0006\u0010(\u001a\u00020\fJ\u0010\u0010)\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0012J\u0010\u0010*\u001a\u00020\f2\u0006\u0010\'\u001a\u00020$H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u000e\u0010\u0019\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0010R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014\u00a8\u0006+"}, d2 = {"Lcom/example/sirmaconsult/addedittask/AddEditTaskViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_dataLoading", "Landroidx/lifecycle/MutableLiveData;", "", "_snackbarText", "Lcom/example/sirmaconsult/Event;", "", "_taskUpdatedEvent", "", "dataLoading", "Landroidx/lifecycle/LiveData;", "getDataLoading", "()Landroidx/lifecycle/LiveData;", "description", "", "getDescription", "()Landroidx/lifecycle/MutableLiveData;", "isDataLoaded", "isNewTask", "snackbarText", "getSnackbarText", "taskCompleted", "taskId", "taskUpdatedEvent", "getTaskUpdatedEvent", "tasksRepository", "Lcom/example/sirmaconsult/data/source/TasksRepository;", "title", "getTitle", "createTask", "Lkotlinx/coroutines/Job;", "newTask", "Lcom/example/sirmaconsult/data/Task;", "onDataNotAvailable", "onTaskLoaded", "task", "saveTask", "start", "updateTask", "sirmaconsult_debug"})
public final class AddEditTaskViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.example.sirmaconsult.data.source.TasksRepository tasksRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> title = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> description = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _dataLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> dataLoading = null;
    private final androidx.lifecycle.MutableLiveData<com.example.sirmaconsult.Event<java.lang.Integer>> _snackbarText = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.sirmaconsult.Event<java.lang.Integer>> snackbarText = null;
    private final androidx.lifecycle.MutableLiveData<com.example.sirmaconsult.Event<kotlin.Unit>> _taskUpdatedEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.sirmaconsult.Event<kotlin.Unit>> taskUpdatedEvent = null;
    private java.lang.String taskId;
    private boolean isNewTask = false;
    private boolean isDataLoaded = false;
    private boolean taskCompleted = false;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getDataLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.sirmaconsult.Event<java.lang.Integer>> getSnackbarText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.sirmaconsult.Event<kotlin.Unit>> getTaskUpdatedEvent() {
        return null;
    }
    
    public final void start(@org.jetbrains.annotations.Nullable()
    java.lang.String taskId) {
    }
    
    private final void onTaskLoaded(com.example.sirmaconsult.data.Task task) {
    }
    
    private final void onDataNotAvailable() {
    }
    
    public final void saveTask() {
    }
    
    private final kotlinx.coroutines.Job createTask(com.example.sirmaconsult.data.Task newTask) {
        return null;
    }
    
    private final void updateTask(com.example.sirmaconsult.data.Task task) {
    }
    
    public AddEditTaskViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}