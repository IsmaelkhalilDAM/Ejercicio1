package com.example.chronocount;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class chrono extends AppCompatActivity {
    ImageButton backbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chrono);
        backbutton= findViewById((R.id.backbuttonchrono));
        backbutton.setOnClickListener(v -> {
            Intent intent = new Intent(getBaseContext(),MainActivity.class);
            startActivity(intent);
        });
    }
}