package com.example.natego;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SetgoalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setgoal);

        View button = findViewById(R.id.buttonSetgoal);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityBMI();
            }
        });
    }

    public void openActivityBMI(){
        Intent intent = new Intent(this, BioActivitiy.class);
        startActivity(intent);
    }
}