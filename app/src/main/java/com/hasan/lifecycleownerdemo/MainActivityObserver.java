package com.hasan.lifecycleownerdemo;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

public class MainActivityObserver implements LifecycleObserver {

    private static final String TAG = "MainActivityObserver";

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreateEvent(){
        Log.d(TAG, "onCreateEvent: started");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStartEvent(){
        Log.d(TAG, "onStartEvent: started");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPauseEvent(){
        Log.d(TAG, "onPauseEvent: started");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResumeEvent(){
        Log.d(TAG, "onResumeEvent: started");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroyEvent(){
        Log.d(TAG, "onDestroyEvent: started");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStopEvent(){
        Log.d(TAG, "onStopEvent: started");
    }


}
