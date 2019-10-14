package com.example.sirmaapp.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatSpinner;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sirmaapp.R;
import com.example.sirmaapp.model.InputField;
import com.example.sirmaapp.util.AppUtils;
import com.example.sirmaapp.util.TimeStampConverter;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class AddDetailActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    private EditText fieldName;
    private EditText displayName;
    private EditText etAddress;
    private EditText etPassportId;
    private EditText etPassportIssue;
    private EditText etPassportExpire;
    
    private Button btnSubmit;
    private TextView toolbarTitle,textTime,birthDate,btnDone;
    private DatePickerDialog picker;
    private AppCompatSpinner spinner;

    private ImageView btnDelete;
    private InputField inputField;

    final Calendar cldr = GregorianCalendar.getInstance();
    int day = cldr.get(Calendar.DAY_OF_MONTH);
    int month = cldr.get(Calendar.MONTH);
    int year = cldr.get(Calendar.YEAR);
    String arr[]={"A+","B+","O+","AB+","A-","B-","O-","AB-"};
    String getBloodGrp = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_detail);

        initView();
        inputField = (InputField) getIntent().getSerializableExtra("intent-detail");
        if(inputField == null) {
            toolbarTitle.setText(getString(R.string.add_title));
            btnDelete.setImageResource(R.drawable.btn_done);
            btnDelete.setTag(R.drawable.btn_done);
            textTime.setText(AppUtils.getFormattedDateString(AppUtils.getCurrentDateTime()));

        }
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,arr);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(this);
        birthDate.setOnClickListener(this);
        etPassportIssue.setOnClickListener(this);
        etPassportExpire.setOnClickListener(this);
        btnSubmit.setOnClickListener(this);
    }

    private void initView() {
        fieldName = findViewById(R.id.etFieldName);
        displayName = findViewById(R.id.etDisplayName);
        birthDate = findViewById(R.id.etBirthDate);
        etAddress = findViewById(R.id.etAddress);
        etPassportId = findViewById(R.id.etPassportId);
        etPassportIssue = findViewById(R.id.etPassportIssue);
        etPassportExpire = findViewById(R.id.etPassportExpire);
        btnSubmit =  findViewById(R.id.btnSubmit);
        btnDone = findViewById(R.id.btn_done);
        btnDelete = findViewById(R.id.btn_close);
        toolbarTitle = findViewById(R.id.title);
        textTime = findViewById(R.id.text_time);
        spinner = findViewById(R.id.action_bar_spinner);
    }

    @Override
    public void onClick(View v) {
        if(v == btnSubmit){
            Intent intent = getIntent();

            if(inputField != null){
                inputField.setFieldName(fieldName.getText().toString());
                inputField.setDisplayName(displayName.getText().toString());
                inputField.setAddress(etAddress.getText().toString());
                inputField.setPassportId(etPassportId.getText().toString());
                inputField.setPassportIssued((Date) etPassportIssue.getText());
                inputField.setPassportExpired((Date) etPassportExpire.getText());
                intent.putExtra("intent-detail",inputField);
            }else{
                intent.putExtra("intent-title", fieldName.getText().toString().trim());
                intent.putExtra("intent-desc", displayName.getText().toString().trim());
                intent.putExtra("intent-format",etAddress.getText().toString().trim());
                intent.putExtra("intent-bldgrp",getBloodGrp);
                intent.putExtra("intent-min",etPassportId.getText().toString().trim());
                intent.putExtra("intent-max",etPassportIssue.getText().toString().trim());
                intent.putExtra("intent-exp", etPassportExpire.getText().toString().trim());
                intent.putExtra("intent-birth",birthDate.getText().toString().trim());
            }
            setResult(Activity.RESULT_OK,intent);
            Log.d("Data filled", String.valueOf(intent));
            Toast.makeText(AddDetailActivity.this,"Data has saved",Toast.LENGTH_LONG).show();
            finish();
            overridePendingTransition(R.anim.stay, R.anim.slide_down);
        }else if(v == btnDelete){
            if((Integer)btnDelete.getTag() == R.drawable.btn_done) {
                setResult(Activity.RESULT_CANCELED);

            } else {
                Intent intent = getIntent();
                intent.putExtra("intent-delete", true);
                intent.putExtra("intent-task", inputField);
                setResult(Activity.RESULT_OK, intent);
            }

            finish();
            overridePendingTransition(R.anim.stay, R.anim.slide_down);

        }else if(v == birthDate){

            // date picker dialog
            picker = new DatePickerDialog(AddDetailActivity.this,
                    new DatePickerDialog.OnDateSetListener() {
                        @Override
                        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                            birthDate.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                        }
                    }, year, month, day);
            picker.show();
        }else if(v == etPassportExpire){
            picker = new DatePickerDialog(AddDetailActivity.this,
                    new DatePickerDialog.OnDateSetListener() {
                        @Override
                        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                            etPassportExpire.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                        }
                    }, year, month, day);
            picker.show();
        }else if(v == etPassportIssue){
            picker = new DatePickerDialog(AddDetailActivity.this,
                    new DatePickerDialog.OnDateSetListener() {
                        @Override
                        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                            etPassportIssue.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                        }
                    }, year, month, day);
            picker.show();
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        getBloodGrp = parent.getItemAtPosition(position).toString();
        parent.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
