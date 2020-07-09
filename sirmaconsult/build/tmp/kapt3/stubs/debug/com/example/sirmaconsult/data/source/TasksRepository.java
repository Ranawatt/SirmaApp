package com.example.sirmaconsult.data.source;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0011\u0010\n\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0011\u0010\r\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00102\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\'\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00150\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u001c\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00100\u00182\u0006\u0010\u0007\u001a\u00020\bH&J\u001a\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00150\u00100\u0018H&J\u0019\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0011\u0010\u001b\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Lcom/example/sirmaconsult/data/source/TasksRepository;", "", "activateTask", "", "task", "Lcom/example/sirmaconsult/data/Task;", "(Lcom/example/sirmaconsult/data/Task;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "taskId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearCompletedTasks", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "completeTask", "deleteAllTasks", "deleteTask", "getTask", "Lcom/example/sirmaconsult/data/Result;", "forceUpdate", "", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTasks", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "observeTask", "Landroidx/lifecycle/LiveData;", "observeTasks", "refreshTask", "refreshTasks", "saveTask", "sirmaconsult_debug"})
public abstract interface TasksRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTasks(boolean forceUpdate, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.sirmaconsult.data.Result<? extends java.util.List<com.example.sirmaconsult.data.Task>>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object refreshTasks(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<com.example.sirmaconsult.data.Result<java.util.List<com.example.sirmaconsult.data.Task>>> observeTasks();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object refreshTask(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<com.example.sirmaconsult.data.Result<com.example.sirmaconsult.data.Task>> observeTask(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId);
    
    /**
     * Relies on [getTasks] to fetch data and picks the task with the same ID.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTask(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, boolean forceUpdate, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.sirmaconsult.data.Result<com.example.sirmaconsult.data.Task>> p2);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object saveTask(@org.jetbrains.annotations.NotNull()
    com.example.sirmaconsult.data.Task task, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object completeTask(@org.jetbrains.annotations.NotNull()
    com.example.sirmaconsult.data.Task task, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object completeTask(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object activateTask(@org.jetbrains.annotations.NotNull()
    com.example.sirmaconsult.data.Task task, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object activateTask(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object clearCompletedTasks(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteAllTasks(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteTask(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}