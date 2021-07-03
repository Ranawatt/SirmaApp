package com.example.sirmaconsult.data.source.local;

import java.lang.System;

/**
 * Data Access Object for the tasks table.
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0011\u0010\t\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u001b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00132\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000e0\u0013H\'J!\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0017H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/example/sirmaconsult/data/source/local/TasksDao;", "", "deleteCompletedTasks", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTaskById", "taskId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTasks", "", "getTaskById", "Lcom/example/sirmaconsult/data/Task;", "getTasks", "", "insertTask", "task", "(Lcom/example/sirmaconsult/data/Task;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "observeTaskById", "Landroidx/lifecycle/LiveData;", "observeTasks", "updateCompleted", "completed", "", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateTask", "sirmaconsult_debug"})
public abstract interface TasksDao {
    
    /**
     * Observes list of tasks.
     * @return all tasks.
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Tasks")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.sirmaconsult.data.Task>> observeTasks();
    
    /**
     * Observes a single task.
     * @param taskId the task id.
     * @return the task with taskId.
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Tasks WHERE entryid = :taskId")
    public abstract androidx.lifecycle.LiveData<com.example.sirmaconsult.data.Task> observeTaskById(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId);
    
    /**
     * Select all tasks from the tasks table.
     * @return all tasks.
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM Tasks")
    public abstract java.lang.Object getTasks(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.sirmaconsult.data.Task>> p0);
    
    /**
     * Select a task by id.
     * @param taskId the task id.
     * @return the task with taskId.
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM Tasks WHERE entryid = :taskId")
    public abstract java.lang.Object getTaskById(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.sirmaconsult.data.Task> p1);
    
    /**
     * Insert a task in the database. If the task already exists, replace it.
     * @param task the task to be inserted.
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertTask(@org.jetbrains.annotations.NotNull()
    com.example.sirmaconsult.data.Task task, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    /**
     * Update a task.
     * @param task task to be updated
     * @return the number of tasks updated. This should always be 1.
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Update()
    public abstract java.lang.Object updateTask(@org.jetbrains.annotations.NotNull()
    com.example.sirmaconsult.data.Task task, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p1);
    
    /**
     * Update the complete status of a task
     * @param taskId    id of the task
     * @param completed status to be updated
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "UPDATE tasks SET completed = :completed WHERE entryid = :taskId")
    public abstract java.lang.Object updateCompleted(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, boolean completed, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2);
    
    /**
     * Delete a task by id.
     * @return the number of tasks deleted. This should always be 1.
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM Tasks WHERE entryid = :taskId")
    public abstract java.lang.Object deleteTaskById(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p1);
    
    /**
     * Delete all tasks.
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM Tasks")
    public abstract java.lang.Object deleteTasks(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0);
    
    /**
     * Delete all completed tasks from the table.
     * @return the number of tasks deleted.
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM Tasks WHERE completed = 1")
    public abstract java.lang.Object deleteCompletedTasks(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p0);
}