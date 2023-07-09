package com.example.callrecorderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

 Button start;
 Button stop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = findViewById(R.id.buttonStart);
        stop= findViewById(R.id.buttonStop);


        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText( MainActivity.this, " Call Recording Started", Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(MainActivity.this,RecordingService.class);
                 startService(intent);

            }
        });


        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,RecordingService.class);
              //  stopService(intent);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Call Recording Stoped", Toast.LENGTH_SHORT).show();
            }
        });
    }



}