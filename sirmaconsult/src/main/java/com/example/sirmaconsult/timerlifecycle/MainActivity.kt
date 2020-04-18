package com.example.sirmaconsult.timerlifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.sirmaconsult.R

class MainActivity : AppCompatActivity() {

//    private lateinit var timerToast: TimerToast
    private lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        timerToast = TimerToast(application,this)

//        timerToast.start()
        viewModel = ViewModelProviders.of(this).get(MainViewModel ::class.java)
        viewModel.timerData.observe(this, Observer {
            Toast.makeText(applicationContext,it,Toast.LENGTH_SHORT).show()
        })
        viewModel.start()
    }

//    override fun onDestroy() {
//        super.onDestroy()
//        timerToast.stop()
//    }

}
