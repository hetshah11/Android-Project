package com.example.finalapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class AccelerometerSensorActivity extends AppCompatActivity implements SensorEventListener {

    TextView textview2;
    ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accelerometer_sensor);
        setTitle("Accelerometer");


        SensorManager sensorManager =(SensorManager)getSystemService(SENSOR_SERVICE);
        constraintLayout = (ConstraintLayout)findViewById(R.id.constraint);
        textview2=(TextView) findViewById(R.id.textview22);

        if(sensorManager != null)
        {
            Sensor accelorometer = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
            if(accelorometer != null)
            {
                sensorManager.registerListener(this, accelorometer, SensorManager.SENSOR_DELAY_NORMAL);
            }
        }
        else
        {
            Snackbar snackbar = Snackbar.make(constraintLayout, "Sensor nathi", Snackbar.LENGTH_LONG);
            snackbar.show();
        }
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {

        if(sensorEvent.sensor.getType()==Sensor.TYPE_LIGHT){
            textview2.setText("Accelerometer : "+sensorEvent.values[0]+sensorEvent.values[1]+sensorEvent.values[2]);
        }
        if(sensorEvent.values[0]>0){
//            Toast.makeText(this, "Low", Toast.LENGTH_SHORT).show();
            WindowManager.LayoutParams params = getWindow().getAttributes();
            params.screenBrightness = 1;
            getWindow().setAttributes(params);
        }
        else {
//            Toast.makeText(this, "High", Toast.LENGTH_SHORT).show();
            WindowManager.LayoutParams params = getWindow().getAttributes();
            params.screenBrightness = -1;
            getWindow().setAttributes(params);
        }

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}