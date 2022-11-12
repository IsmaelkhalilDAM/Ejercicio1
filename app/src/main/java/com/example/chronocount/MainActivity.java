package com.example.chronocount;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageButton chronobut,timerbut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chronobut = findViewById(R.id.chronobutton);
        timerbut = findViewById(R.id.timerbutton);
        chronobut.setOnClickListener(v -> {
            Intent intent = new Intent(getBaseContext(),chrono.class);
            startActivity(intent);
        });
        timerbut.setOnClickListener(v -> {
            Intent intent = new Intent(getBaseContext(),counter.class);
            startActivity(intent);
        });
    }
}