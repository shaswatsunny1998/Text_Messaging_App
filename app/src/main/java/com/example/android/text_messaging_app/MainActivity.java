package com.example.android.text_messaging_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText no,message;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        no=(EditText) findViewById(R.id.editText3);
        message=(EditText) findViewById(R.id.editText2);
        Intent serviceIntent=new Intent(this,MyMessagingService.class);
        serviceIntent.putExtra("messa", (CharSequence) message);


    }
}
