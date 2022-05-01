package com.example.finalapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.List;

public class SensorActivity extends AppCompatActivity {

    TextView textView;
    private SensorManager sensorManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor);

        textView=(TextView) findViewById(R.id.textview11);

        textView.setVisibility(View.GONE);



        sensorManager=(SensorManager)getSystemService(SENSOR_SERVICE);
        List<Sensor> mList=sensorManager.getSensorList(Sensor.TYPE_ALL);

        for(int i=1;i<mList.size();i++)
        {
            textView.setVisibility(View.VISIBLE);
            textView.append("\n"+ mList.get(i).getName());
        }
    }
}