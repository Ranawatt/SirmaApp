package com.example.sirmaconsult;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u000e\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0014\u001a\u00020\u0015H\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007@GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0016"}, d2 = {"Lcom/example/sirmaconsult/ServiceLocator;", "", "()V", "database", "Lcom/example/sirmaconsult/data/source/local/ToDoDatabase;", "lock", "<set-?>", "Lcom/example/sirmaconsult/data/source/TasksRepository;", "tasksRepository", "getTasksRepository", "()Lcom/example/sirmaconsult/data/source/TasksRepository;", "setTasksRepository", "(Lcom/example/sirmaconsult/data/source/TasksRepository;)V", "createDataBase", "context", "Landroid/content/Context;", "createTaskLocalDataSource", "Lcom/example/sirmaconsult/data/source/TasksDataSource;", "createTasksRepository", "provideTasksRepository", "resetRepository", "", "sirmaconsult_debug"})
public final class ServiceLocator {
    private static com.example.sirmaconsult.data.source.local.ToDoDatabase database;
    @org.jetbrains.annotations.Nullable()
    private static volatile com.example.sirmaconsult.data.source.TasksRepository tasksRepository;
    private static final java.lang.Object lock = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.sirmaconsult.ServiceLocator INSTANCE = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.sirmaconsult.data.source.TasksRepository getTasksRepository() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    public final void setTasksRepository(@org.jetbrains.annotations.Nullable()
    com.example.sirmaconsult.data.source.TasksRepository p0) {
    }
    
    @androidx.annotation.VisibleForTesting()
    public final void resetRepository() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.sirmaconsult.data.source.TasksRepository provideTasksRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    private final com.example.sirmaconsult.data.source.TasksRepository createTasksRepository(android.content.Context context) {
        return null;
    }
    
    private final com.example.sirmaconsult.data.source.TasksDataSource createTaskLocalDataSource(android.content.Context context) {
        return null;
    }
    
    private final com.example.sirmaconsult.data.source.local.ToDoDatabase createDataBase(android.content.Context context) {
        return null;
    }
    
    private ServiceLocator() {
        super();
    }
}