package com.example.sirmaapp.repository;

import android.content.Context;
import android.os.AsyncTask;
import androidx.lifecycle.LiveData;
import androidx.room.Room;
import com.example.sirmaapp.db.PersonalDatabase;
import com.example.sirmaapp.model.InputField;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class PersonalRepository {
    private String DB_NAME = "db_personalised";

    public PersonalDatabase personalDatabase;

    public PersonalRepository(Context context) {

        personalDatabase = Room.databaseBuilder(context,PersonalDatabase.class,DB_NAME).build();
    }

    public void insertTask(String fieldName, String displayName, String address,
                           String passportId, String passportIssue, String passportExpire,String bloodgroup,String birthdate){

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date passportIssued = null;
        Date passportExpired = null;
        Date birthDate = null;
        try {
            passportIssued = dateFormat.parse(passportIssue);
            passportExpired = dateFormat.parse(passportExpire);
            birthDate = dateFormat.parse(birthdate);
        } catch (ParseException e) {
            e.printStackTrace();
        }


        insertTask(fieldName, displayName, address,  passportId,passportIssued , passportExpired, bloodgroup,birthDate);
    }

    public void insertTask(String fieldName, String displayName, String address, String passportId,
                           Date passPortIssued, Date passportExpired, String bldGrp, Date birthDate) {

        InputField inputField = new InputField();
        inputField.setFieldName(fieldName);
        inputField.setDisplayName(displayName);
        inputField.setAddress(address);
        inputField.setBloodgroup(bldGrp);
        inputField.setPassportId(passportId);
        inputField.setPassportIssued(passPortIssued);
        inputField.setPassportExpired(passportExpired);
        inputField.setBirthDate(birthDate);
        insertTask(inputField);
    }

    public void insertTask(final InputField inputField) {
        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... voids) {
                personalDatabase.daoAccess().insertTask(inputField);
                return null;
            }
        }.execute();
    }

    public void updateTask(final InputField inputField) {
//        note.setModifiedAt(AppUtils.getCurrentDateTime());

        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... voids) {
                personalDatabase.daoAccess().updateTask(inputField);
                return null;
            }
        }.execute();
    }

//    public void deleteTask(final int id) {
//        final LiveData<InputField> task = getTask(id);
//        if(task != null) {
//            new AsyncTask<Void, Void, Void>() {
//                @Override
//                protected Void doInBackground(Void... voids) {
//                    personalDatabase.daoAccess().deleteTask(task.getValue());
//                    return null;
//                }
//            }.execute();
//        }
//    }

    public void deleteTask(final InputField inputField) {
        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... voids) {
                personalDatabase.daoAccess().deleteTask(inputField);
                return null;
            }
        }.execute();
    }

    public LiveData<InputField> getTask(int id) {
        return personalDatabase.daoAccess().getTask(id);
    }

    public LiveData<List<InputField>> getTasks() {
        return personalDatabase.daoAccess().fetchAllTasks();
    }
}
