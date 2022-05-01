package com.example.finalapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class ListviewActivity extends AppCompatActivity {

    ListView lv;
    TextView text;
    LinearLayout ll;
    String list[] = {"india", "china", "australia", "portugle", "America", "Newzelend", "india", "china", "australia", "portugle", "America", "Newzelend", "india", "china", "australia", "portugle", "America", "Newzelend", "india", "china", "australia", "portugle", "America", "Newzelend"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        setTitle("List View");

        ll = (LinearLayout) findViewById(R.id.layout);
        text = (TextView) findViewById(R.id.textViewll);


        lv = (ListView) findViewById(R.id.listview);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.rawdata, R.id.textViewll, list);
//        if(text.getText().toString().equals("india"))
//        {
//            ll.setBackgroundColor(Color.RED);
//        }
        lv.setAdapter(arrayAdapter);
    }
}