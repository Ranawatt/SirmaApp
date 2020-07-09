package com.example.sirmaconsult;

import java.lang.System;

/**
 * An application that lazily provides a repository. Note that this Service Locator pattern is
 * used to simplify the sample. Consider a Dependency Injection framework.
 *
 * Also, sets up Timber in the DEBUG BuildConfig. Read Timber's documentation for production setups.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/example/sirmaconsult/TodoApplication;", "Landroid/app/Application;", "()V", "tasksRepository", "Lcom/example/sirmaconsult/data/source/TasksRepository;", "getTasksRepository", "()Lcom/example/sirmaconsult/data/source/TasksRepository;", "onCreate", "", "sirmaconsult_debug"})
public final class TodoApplication extends android.app.Application {
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.sirmaconsult.data.source.TasksRepository getTasksRepository() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public TodoApplication() {
        super();
    }
}