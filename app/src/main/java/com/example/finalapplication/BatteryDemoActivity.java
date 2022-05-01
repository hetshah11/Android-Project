package com.example.finalapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.TextView;

public class BatteryDemoActivity extends AppCompatActivity {

    TextView tv;
    BatteryReceiver battryrec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battery_demo);

        setTitle("Battery Info");
        tv = (TextView) findViewById(R.id.battry);
        battryrec = new BatteryReceiver(tv);
        registerReceiver(battryrec, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
    }

    protected void onStop()
    {
        super.onStop();
        unregisterReceiver(battryrec);
    }
    }
