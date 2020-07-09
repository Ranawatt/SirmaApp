package com.example.sirmaconsult.timerlifecycle

import android.os.CountDownTimer
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel(){

    val timerData = MutableLiveData<String>()

    private val timer = object : CountDownTimer(60000,3000){
        override fun onFinish() {
//            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            timerData.postValue("Finished")
        }

        override fun onTick(milliUntillFinished: Long) {
//            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            timerData.postValue("$milliUntillFinished")
        }

    }

    fun start(){
        timer.start()
    }

    override fun onCleared(){
        timer.cancel()
    }
}