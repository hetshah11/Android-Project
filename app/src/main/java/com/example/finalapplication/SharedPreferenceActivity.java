package com.example.finalapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

public class SharedPreferenceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preference);

        setTitle("Shared Pref");
        SharedPreferences settings = getSharedPreferences("settings", 0);
        boolean dialogShown = settings.getBoolean("dialogShown", false);
        if(!dialogShown)
        {
            Toast.makeText(getApplicationContext(), "first time", Toast.LENGTH_LONG).show();
            SharedPreferences.Editor editor = settings.edit();
            editor.putBoolean("dialogShown", true);
            editor.commit();
        }
    }
}