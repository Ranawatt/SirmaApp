package com.example.sirmaapp.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.sirmaapp.R;
import com.example.sirmaapp.model.InputField;
import com.example.sirmaapp.repository.PersonalRepository;
import com.example.sirmaapp.ui.adapter.InputFieldAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private FloatingActionButton fab;
    private RecyclerView recyclerView;
    private InputFieldAdapter adapter;

    private PersonalRepository personalRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        personalRepository = new PersonalRepository(getApplicationContext());

        fab.setOnClickListener(this);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2 , StaggeredGridLayoutManager.VERTICAL));
//        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, this));

        updateInputFieldsList();
    }

    private void initView() {
        fab = findViewById(R.id.fab);
        recyclerView = findViewById(R.id.recycler_info);
    }

    private void updateInputFieldsList() {
        personalRepository.getTasks().observe(this, new Observer<List<InputField>>() {
            @Override
            public void onChanged(List<InputField> inputFields) {
                if (inputFields.size() > 0) {
                    if (adapter == null) {
                        adapter = new InputFieldAdapter(inputFields);
                        recyclerView.setAdapter(adapter);
                    } else adapter.addTasks(inputFields);
                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 200 && resultCode == Activity.RESULT_OK) {

            if (data.hasExtra("intent_task")) {
                if (data.hasExtra("intent_delete")) {
                    personalRepository.deleteTask((InputField) data.getSerializableExtra("intent_task"));
                } else {
                    personalRepository.updateTask((InputField) data.getSerializableExtra("intent_task"));
                }
            } else {
                String fieldName = data.getStringExtra("intent-title");
                String displayName = data.getStringExtra("intent-desc");
                String address = data.getStringExtra("intent-format");
                String bloodGrp = data.getStringExtra("intent-bldgrp");
                String passportId = data.getStringExtra("intent-min");
                String passportIssued = data.getStringExtra("intent-max");
                String passportExpired = data.getStringExtra("intent-exp");
                String birthDay = data.getStringExtra("intent-birth");

                personalRepository.insertTask(fieldName,displayName,address,passportId,passportIssued,passportExpired,bloodGrp,birthDay);
            }
            updateInputFieldsList();
        }
    }
    @Override
    public void onClick(View v) {
        if(v == fab){
            Intent intent = new Intent(MainActivity.this, AddDetailActivity.class);
            startActivityForResult(intent, 200);
        }
    }
}
