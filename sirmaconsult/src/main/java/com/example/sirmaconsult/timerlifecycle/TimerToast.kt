package com.example.sirmaconsult.timerlifecycle

import android.app.Application
import android.content.IntentSender
import android.os.CountDownTimer
import android.widget.Toast
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.OnLifecycleEvent

class TimerToast(application: Application, lifecycleOwner: LifecycleOwner):LifecycleObserver {
    private  var started = false

    private  var  lifecycle = lifecycleOwner.lifecycle

    init {
        lifecycle.addObserver(this)
    }
    private  val timer = object : CountDownTimer(60000,3000){
        override fun onFinish() {
//            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            if (lifecycle.currentState.isAtLeast(Lifecycle.State.STARTED))
                Toast.makeText(application,"Finish", Toast.LENGTH_SHORT).show()
        }

        override fun onTick(milliUntilFinished: Long) {
//            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            if (lifecycle.currentState.isAtLeast(Lifecycle.State.STARTED)){
                Toast.makeText(application,"milliUntilFinished", Toast.LENGTH_SHORT).show()
            }

        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun start(){
        if(!started)
            started = true
            timer.start()
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun stop(){
        timer.cancel()
    }
}