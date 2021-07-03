package com.example.sirmaconsult.data.source.local;

import java.lang.System;

/**
 * The Room Database that contains the Task table.
 * Note that exportSchema should be true in production databases.
 */
@androidx.room.Database(entities = {com.example.sirmaconsult.data.Task.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/example/sirmaconsult/data/source/local/ToDoDatabase;", "Landroidx/room/RoomDatabase;", "()V", "taskDao", "Lcom/example/sirmaconsult/data/source/local/TasksDao;", "sirmaconsult_debug"})
public abstract class ToDoDatabase extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.sirmaconsult.data.source.local.TasksDao taskDao();
    
    public ToDoDatabase() {
        super();
    }
}