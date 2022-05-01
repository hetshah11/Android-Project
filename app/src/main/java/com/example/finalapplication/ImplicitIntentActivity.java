package com.example.finalapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class ImplicitIntentActivity extends AppCompatActivity {



    Button implicit,implicit2,sendbutton,call,mail;
    EditText ed;
    ImageButton wp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_intent);


        setTitle("Intent");

        implicit=(Button)findViewById(R.id.implicit);
        implicit2=(Button)findViewById(R.id.imoplicit1);
        wp=(ImageButton)findViewById(R.id.whatsapp);
        ed=(EditText) findViewById(R.id.edit);
        sendbutton=(Button)findViewById(R.id.send);
        call=(Button)findViewById(R.id.call);
        mail=(Button)findViewById(R.id.newmail);

        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String recipients="dhruv.prajapati@einfochips.com";
                Intent email=new Intent(Intent.ACTION_SEND, Uri.parse("mailto:"));
                email.setType("message/rfc822");
                email.putExtra(Intent.EXTRA_EMAIL,recipients);
                email.putExtra(Intent.EXTRA_SUBJECT,"Test");
                email.putExtra(Intent.EXTRA_TEXT,"Hello dear..");

                startActivity(Intent.createChooser(email,"choose an email client from"));
            }
        });

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone="9998876902";
                Intent intent=new Intent(Intent.ACTION_DIAL,Uri.fromParts("tel",phone,null));
                startActivity(intent);
            }
        });

        String text="Hello guys..!";

        implicit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");

                intent.putExtra(Intent.EXTRA_TEXT,text);

                startActivity(Intent.createChooser(intent,"Suggest to friends"));

            }
        });





        implicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.einfochips.com/"));
                startActivity(intent);
            }
        });

        wp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text= ed.getText().toString();
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.setPackage("com.whatsapp");
                intent.putExtra(Intent.EXTRA_TEXT,text);

                startActivity(Intent.createChooser(intent,"Suggest to friends"));
                ed.setText("");
            }
        });

        sendbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}