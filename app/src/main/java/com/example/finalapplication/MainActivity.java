package com.example.finalapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button alc,log,ii,fa,lla,rla,sensors,as,ls,ps,ma,nd,ta,sa,cl,lva,rva,bma,brcvr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Main Activity");

        alc=(Button) findViewById(R.id.alc);
        log=(Button) findViewById(R.id.log);
        ii=(Button) findViewById(R.id.ii);
        fa=(Button) findViewById(R.id.fa);
        lla=(Button) findViewById(R.id.lla);
        rla=(Button) findViewById(R.id.rla);
        sensors=(Button) findViewById(R.id.sensors);
        ps=(Button) findViewById(R.id.ps);
        as=(Button) findViewById(R.id.as);
        ls=(Button) findViewById(R.id.ls);
        ma=(Button) findViewById(R.id.ma);
        nd=(Button) findViewById(R.id.nd);
        ta=(Button) findViewById(R.id.ta);
        sa=(Button) findViewById(R.id.sa);
        cl=(Button) findViewById(R.id.cl);
        lva=(Button)findViewById(R.id.lva);
        rva=(Button)findViewById(R.id.rva);
        bma=(Button)findViewById(R.id.bms);
        brcvr=(Button)findViewById(R.id.brcvr);




        alc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ActivityLifecycle.class);
                startActivity(intent);
            }
        });


        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,LogActivity.class);
                startActivity(intent);
            }
        });

        ii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ImplicitIntentActivity.class);
                startActivity(intent);
            }
        });

        fa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,FragmentActivity.class);
                startActivity(intent);
            }
        });

        lla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,LinearLayoutActivity.class);
                startActivity(intent);
            }
        });

        rla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,RelativeLayoutActivity.class);
                startActivity(intent);
            }
        });

        sensors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SensorActivity.class);
                startActivity(intent);
            }
        });

        ps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ProximitySensorActivity.class);
                startActivity(intent);
            }
        });

        ls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,LightSensorActivity.class);
                startActivity(intent);
            }
        });

        as.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,AccelerometerSensorActivity.class);
                startActivity(intent);
            }
        });

        ma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MapsActivity.class);
                startActivity(intent);
            }
        });

        nd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,NavigationdDrawerActivity.class);
                startActivity(intent);
            }
        });

        ta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,TabbedActivity.class);
                startActivity(intent);
            }
        });

        sa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SpinnerActivity.class);
                startActivity(intent);
            }
        });


        cl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ChangeLanguageActivity.class);
                startActivity(intent);
            }
        });

        lva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ListviewActivity.class);
                startActivity(intent);
            }
        });


        rva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,RecyclerViewActivity.class);
                startActivity(intent);
            }
        });

        bma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,BackgroundServiceActivity.class);
                startActivity(intent);
            }
        });


        brcvr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,BatteryDemoActivity.class);
                startActivity(intent);
            }
        });
    }
}