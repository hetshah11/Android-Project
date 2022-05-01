package com.example.sampleapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sampleapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    // Used to load the 'androidnativeeinfochip' library on application startup.
    static {
        System.loadLibrary("sampleapplication");

    }
    Button btnJNI, btnJNIStringArray;
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
// Example of a call to a native method
        TextView tv = binding.sampleText;
        tv.setText(stringFromJNI());
        btnJNI = findViewById(R.id.btnJni);
        btnJNIStringArray = findViewById(R.id.btnJniStringArray);
        btnJNI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = sendYourName("Umang", "Thakkar");
                Toast.makeText(getApplicationContext(), "Result from JNI is " + result,
                        Toast.LENGTH_LONG).show();
            }
        });
        btnJNIStringArray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] strings = stringArrayFromJNI();
                Toast.makeText(getApplicationContext(), "First element is "+strings[0],
                        Toast.LENGTH_LONG).show();
            }
        });
    }
    /**
     * A native method that is implemented by the 'androidnativeeinfochip' native
     library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
    public native String sendYourName(String firstName, String lastName);
    public native String[] stringArrayFromJNI();
}