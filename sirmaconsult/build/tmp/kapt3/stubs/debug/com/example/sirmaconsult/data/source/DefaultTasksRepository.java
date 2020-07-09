package com.example.sirmaconsult.data.source;

import java.lang.System;

/**
 * Concrete implementation to load tasks from the data sources into a cache.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0011\u0010\u0010\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\u0012\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0011\u0010\u0013\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\'\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00162\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00162\u0006\u0010\u001b\u001a\u00020\u000eH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ%\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001d0\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u001c\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00160 2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001a\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001d0\u00160 H\u0016J\u0019\u0010\"\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0011\u0010#\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010$\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010%\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0011\u0010&\u001a\u00020\tH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\'"}, d2 = {"Lcom/example/sirmaconsult/data/source/DefaultTasksRepository;", "Lcom/example/sirmaconsult/data/source/TasksRepository;", "tasksRemoteDataSource", "Lcom/example/sirmaconsult/data/source/TasksDataSource;", "tasksLocalDataSource", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/example/sirmaconsult/data/source/TasksDataSource;Lcom/example/sirmaconsult/data/source/TasksDataSource;Lkotlinx/coroutines/CoroutineDispatcher;)V", "activateTask", "", "task", "Lcom/example/sirmaconsult/data/Task;", "(Lcom/example/sirmaconsult/data/Task;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "taskId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearCompletedTasks", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "completeTask", "deleteAllTasks", "deleteTask", "getTask", "Lcom/example/sirmaconsult/data/Result;", "forceUpdate", "", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTaskWithId", "id", "getTasks", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "observeTask", "Landroidx/lifecycle/LiveData;", "observeTasks", "refreshTask", "refreshTasks", "saveTask", "updateTaskFromRemoteDataSource", "updateTasksFromRemoteDataSource", "sirmaconsult_debug"})
public final class DefaultTasksRepository implements com.example.sirmaconsult.data.source.TasksRepository {
    private final com.example.sirmaconsult.data.source.TasksDataSource tasksRemoteDataSource = null;
    private final com.example.sirmaconsult.data.source.TasksDataSource tasksLocalDataSource = null;
    private final kotlinx.coroutines.CoroutineDispatcher ioDispatcher = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getTasks(boolean forceUpdate, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.sirmaconsult.data.Result<? extends java.util.List<com.example.sirmaconsult.data.Task>>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object refreshTasks(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.example.sirmaconsult.data.Result<java.util.List<com.example.sirmaconsult.data.Task>>> observeTasks() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object refreshTask(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.example.sirmaconsult.data.Result<com.example.sirmaconsult.data.Task>> observeTask(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId) {
        return null;
    }
    
    /**
     * Relies on [getTasks] to fetch data and picks the task with the same ID.
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getTask(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, boolean forceUpdate, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.sirmaconsult.data.Result<com.example.sirmaconsult.data.Task>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object saveTask(@org.jetbrains.annotations.NotNull()
    com.example.sirmaconsult.data.Task task, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object completeTask(@org.jetbrains.annotations.NotNull()
    com.example.sirmaconsult.data.Task task, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object completeTask(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object activateTask(@org.jetbrains.annotations.NotNull()
    com.example.sirmaconsult.data.Task task, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object activateTask(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object clearCompletedTasks(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteAllTasks(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteTask(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    public DefaultTasksRepository(@org.jetbrains.annotations.NotNull()
    com.example.sirmaconsult.data.source.TasksDataSource tasksRemoteDataSource, @org.jetbrains.annotations.NotNull()
    com.example.sirmaconsult.data.source.TasksDataSource tasksLocalDataSource, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher ioDispatcher) {
        super();
    }
}