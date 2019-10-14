package com.example.sirmaapp.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.sirmaapp.model.InputField;

import java.util.List;

@Dao
public interface DaoAccess {

    @Insert
    Long insertTask(InputField inputField);

    @Query("SELECT * FROM InputField ORDER BY created_at desc")
    LiveData<List<InputField>> fetchAllTasks();

    @Query(value = "SELECT * FROM InputField WHERE id =:taskId")
    LiveData<InputField> getTask(int taskId);

    @Update
    void updateTask(InputField inputField);

    @Delete
    void deleteTask(InputField inputField);

}
