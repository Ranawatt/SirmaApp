package com.example.sirmaconsult.taskdetail;

import java.lang.System;

/**
 * ViewModel for the Details screen.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010!\u001a\u0004\u0018\u00010\u00102\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100#H\u0002J\u0006\u0010$\u001a\u00020%J\u0006\u0010&\u001a\u00020\nJ\u0006\u0010\'\u001a\u00020\nJ\u000e\u0010(\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u0007J\u0012\u0010)\u001a\u00020\n2\b\b\u0001\u0010*\u001a\u00020\rH\u0002J\u0010\u0010+\u001a\u00020\n2\b\u0010,\u001a\u0004\u0018\u00010\u0012R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u001d\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u001d\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u001d\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0019\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/example/sirmaconsult/taskdetail/TaskDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "tasksRepository", "Lcom/example/sirmaconsult/data/source/TasksRepository;", "(Lcom/example/sirmaconsult/data/source/TasksRepository;)V", "_dataLoading", "Landroidx/lifecycle/MutableLiveData;", "", "_deleteTaskEvent", "Lcom/example/sirmaconsult/Event;", "", "_editTaskEvent", "_snackbarText", "", "_task", "Landroidx/lifecycle/LiveData;", "Lcom/example/sirmaconsult/data/Task;", "_taskId", "", "completed", "getCompleted", "()Landroidx/lifecycle/LiveData;", "dataLoading", "getDataLoading", "deleteTaskEvent", "getDeleteTaskEvent", "editTaskEvent", "getEditTaskEvent", "isDataAvailable", "snackbarText", "getSnackbarText", "task", "getTask", "computeResult", "taskResult", "Lcom/example/sirmaconsult/data/Result;", "deleteTask", "Lkotlinx/coroutines/Job;", "editTask", "refresh", "setCompleted", "showSnackbarMessage", "message", "start", "taskId", "sirmaconsult_debug"})
public final class TaskDetailViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _taskId = null;
    private final androidx.lifecycle.LiveData<com.example.sirmaconsult.data.Task> _task = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.sirmaconsult.data.Task> task = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isDataAvailable = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _dataLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> dataLoading = null;
    private final androidx.lifecycle.MutableLiveData<com.example.sirmaconsult.Event<kotlin.Unit>> _editTaskEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.sirmaconsult.Event<kotlin.Unit>> editTaskEvent = null;
    private final androidx.lifecycle.MutableLiveData<com.example.sirmaconsult.Event<kotlin.Unit>> _deleteTaskEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.sirmaconsult.Event<kotlin.Unit>> deleteTaskEvent = null;
    private final androidx.lifecycle.MutableLiveData<com.example.sirmaconsult.Event<java.lang.Integer>> _snackbarText = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.sirmaconsult.Event<java.lang.Integer>> snackbarText = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> completed = null;
    private final com.example.sirmaconsult.data.source.TasksRepository tasksRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.sirmaconsult.data.Task> getTask() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isDataAvailable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getDataLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.sirmaconsult.Event<kotlin.Unit>> getEditTaskEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.sirmaconsult.Event<kotlin.Unit>> getDeleteTaskEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.sirmaconsult.Event<java.lang.Integer>> getSnackbarText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getCompleted() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteTask() {
        return null;
    }
    
    public final void editTask() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job setCompleted(boolean completed) {
        return null;
    }
    
    public final void start(@org.jetbrains.annotations.Nullable()
    java.lang.String taskId) {
    }
    
    private final com.example.sirmaconsult.data.Task computeResult(com.example.sirmaconsult.data.Result<com.example.sirmaconsult.data.Task> taskResult) {
        return null;
    }
    
    public final void refresh() {
    }
    
    private final void showSnackbarMessage(@androidx.annotation.StringRes()
    int message) {
    }
    
    public TaskDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.example.sirmaconsult.data.source.TasksRepository tasksRepository) {
        super();
    }
}