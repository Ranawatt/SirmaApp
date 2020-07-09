package com.example.sirmaconsult.data.source.remote;

import java.lang.System;

/**
 * Implementation of the data source that adds a latency simulating network.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0007H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007H\u0002J\u0011\u0010\u0016\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0019\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0007H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0011\u0010\u0019\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0007H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\u0006\u0010\u0011\u001a\u00020\u0007H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u001d\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u001c\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000b0\u001e2\u0006\u0010\u0011\u001a\u00020\u0007H\u0016J\u001a\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000b0\u001eH\u0016J\u0019\u0010 \u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0007H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0011\u0010!\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0019\u0010\"\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006#"}, d2 = {"Lcom/example/sirmaconsult/data/source/remote/TasksRemoteDataSource;", "Lcom/example/sirmaconsult/data/source/TasksDataSource;", "()V", "SERVICE_LATENCY_IN_MILLIS", "", "TASKS_SERVICE_DATA", "Ljava/util/LinkedHashMap;", "", "Lcom/example/sirmaconsult/data/Task;", "observableTasks", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/sirmaconsult/data/Result;", "", "activateTask", "", "task", "(Lcom/example/sirmaconsult/data/Task;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "taskId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addTask", "title", "description", "clearCompletedTasks", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "completeTask", "deleteAllTasks", "deleteTask", "getTask", "getTasks", "observeTask", "Landroidx/lifecycle/LiveData;", "observeTasks", "refreshTask", "refreshTasks", "saveTask", "sirmaconsult_debug"})
public final class TasksRemoteDataSource implements com.example.sirmaconsult.data.source.TasksDataSource {
    private static final long SERVICE_LATENCY_IN_MILLIS = 2000L;
    private static java.util.LinkedHashMap<java.lang.String, com.example.sirmaconsult.data.Task> TASKS_SERVICE_DATA;
    private static final androidx.lifecycle.MutableLiveData<com.example.sirmaconsult.data.Result<java.util.List<com.example.sirmaconsult.data.Task>>> observableTasks = null;
    public static final com.example.sirmaconsult.data.source.remote.TasksRemoteDataSource INSTANCE = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object refreshTasks(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
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
    public androidx.lifecycle.LiveData<com.example.sirmaconsult.data.Result<java.util.List<com.example.sirmaconsult.data.Task>>> observeTasks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.example.sirmaconsult.data.Result<com.example.sirmaconsult.data.Task>> observeTask(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getTasks(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.sirmaconsult.data.Result<? extends java.util.List<com.example.sirmaconsult.data.Task>>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getTask(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.sirmaconsult.data.Result<com.example.sirmaconsult.data.Task>> p1) {
        return null;
    }
    
    private final void addTask(java.lang.String title, java.lang.String description) {
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
    
    private TasksRemoteDataSource() {
        super();
    }
}