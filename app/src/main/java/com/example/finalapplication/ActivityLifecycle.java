package com.example.finalapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class ActivityLifecycle extends AppCompatActivity {

    private static final String HOME_ACTIVITY_TAG = "ActivityLifeCycle";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);
        setTitle("Activty Lifecycle");
    }

    private void showLog(String text){
        Log.d(HOME_ACTIVITY_TAG, text);}


    @Override
    protected void onResume() {
        super.onResume();

        showLog("Activity resumed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        showLog("Activity Destroyed");
    }

    @Override
    protected void onStart() {
        super.onStart();

        showLog("Activity started");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        showLog("Activity restarted");
    }

    @Override
    protected void onStop() {
        super.onStop();

        showLog("Activity Stopped");
    }

    @Override
    protected void onPause() {
        super.onPause();

        showLog("Activity Paused");
    }
}