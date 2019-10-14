package com.example.sirmaapp.model;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import java.io.Serializable;

import java.util.Date;


import com.example.sirmaapp.util.TimeStampConverter;


@Entity
public class InputField implements Serializable {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "created_at")
    @TypeConverters({TimeStampConverter.class})
    private Date createdAt;
    @ColumnInfo(name = "field_name")
    private String fieldName;
    @ColumnInfo(name = "display_name")
    private String displayName;
    private String address;
    private String passportId;
    private String bloodgroup;

    private Date passportIssued;
    private Date passportExpired;
    private Date birthDate;

    public String getBloodgroup() {
        return bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }

    public Date getPassportIssued() {
        return passportIssued;
    }

    public void setPassportIssued(Date passportIssued) {
        this.passportIssued = passportIssued;
    }

    public Date getPassportExpired() {
        return passportExpired;
    }

    public void setPassportExpired(Date passportExpired) {
        this.passportExpired = passportExpired;
    }


}

