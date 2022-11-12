package com.example.chronocount;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class counter extends AppCompatActivity {
    ImageButton backbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);
        backbutton= findViewById((R.id.backbuttoncounter));
        backbutton.setOnClickListener(v -> {
            Intent intent = new Intent(getBaseContext(),MainActivity.class);
            startActivity(intent);
        });
    }
}