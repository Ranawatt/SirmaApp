package com.example.sirmaconsult.data;

import java.lang.System;

/**
 * Immutable model class for a Task. In order to compile with Room, we can't use @JvmOverloads to
 * generate multiple constructors.
 *
 * @param title       title of the task
 * @param description description of the task
 * @param isCompleted whether or not this task is completed
 * @param id          id of the task
 */
@androidx.room.Entity(tableName = "tasks")
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\t\u0010!\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0010R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\fR\u0011\u0010\u0016\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\n\u00a8\u0006\""}, d2 = {"Lcom/example/sirmaconsult/data/Task;", "", "title", "", "description", "isCompleted", "", "id", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "getId", "setId", "isActive", "()Z", "setCompleted", "(Z)V", "isEmpty", "getTitle", "setTitle", "titleForList", "getTitleForList", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "sirmaconsult_debug"})
public final class Task {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "title")
    private java.lang.String title;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "description")
    private java.lang.String description;
    @androidx.room.ColumnInfo(name = "completed")
    private boolean isCompleted;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "entryid")
    @androidx.room.PrimaryKey()
    private java.lang.String id;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitleForList() {
        return null;
    }
    
    public final boolean isActive() {
        return false;
    }
    
    public final boolean isEmpty() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean isCompleted() {
        return false;
    }
    
    public final void setCompleted(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public Task(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String description, boolean isCompleted, @org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        super();
    }
    
    public Task(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String description, boolean isCompleted) {
        super();
    }
    
    public Task(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String description) {
        super();
    }
    
    public Task(@org.jetbrains.annotations.NotNull()
    java.lang.String title) {
        super();
    }
    
    public Task() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    public final boolean component3() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    /**
     * Immutable model class for a Task. In order to compile with Room, we can't use @JvmOverloads to
     * generate multiple constructors.
     *
     * @param title       title of the task
     * @param description description of the task
     * @param isCompleted whether or not this task is completed
     * @param id          id of the task
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.sirmaconsult.data.Task copy(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String description, boolean isCompleted, @org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    /**
     * Immutable model class for a Task. In order to compile with Room, we can't use @JvmOverloads to
     * generate multiple constructors.
     *
     * @param title       title of the task
     * @param description description of the task
     * @param isCompleted whether or not this task is completed
     * @param id          id of the task
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * Immutable model class for a Task. In order to compile with Room, we can't use @JvmOverloads to
     * generate multiple constructors.
     *
     * @param title       title of the task
     * @param description description of the task
     * @param isCompleted whether or not this task is completed
     * @param id          id of the task
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Immutable model class for a Task. In order to compile with Room, we can't use @JvmOverloads to
     * generate multiple constructors.
     *
     * @param title       title of the task
     * @param description description of the task
     * @param isCompleted whether or not this task is completed
     * @param id          id of the task
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}