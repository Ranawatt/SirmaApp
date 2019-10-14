package com.example.sirmaapp.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.example.sirmaapp.dao.DaoAccess;
import com.example.sirmaapp.model.InputField;
import com.example.sirmaapp.util.TimeStampConverter;

@Database(entities = {InputField.class},version = 1,exportSchema = false)
@TypeConverters({TimeStampConverter.class})
public abstract class PersonalDatabase extends RoomDatabase {

    public abstract DaoAccess daoAccess();
}
