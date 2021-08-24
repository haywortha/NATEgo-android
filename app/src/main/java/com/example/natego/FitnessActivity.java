package com.example.natego;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class FitnessActivity extends AppCompatActivity {
    private Button activitylevel;
    private RadioGroup groupRadios;
    private RadioButton radio1, radio2, radio3, radio4, radio5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitness);
        radio1 = findViewById(R.id.radio1);
        radio2 = findViewById(R.id.radio2);
        radio3 = findViewById(R.id.radio3);
        radio4 = findViewById(R.id.radio4);
        radio5 = findViewById(R.id.radio5);

        activitylevel = findViewById(R.id.buttonActivitylevel);
        activitylevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitySetgoal();
            }
        });
    }

    public void openActivitySetgoal(){
        checkLevel();
        Intent intent = new Intent(this, SetgoalActivity.class);
        startActivity(intent);

    }

    //checks the radio button for activity level.
    public void checkLevel(){
        if(radio1.isChecked()){
            //log data
        }else if(radio2.isChecked()){
            //log data
        }else if(radio3.isChecked()){
            //log data
        }else if(radio4.isChecked()){
            //log data
        }else if(radio5.isChecked()){
            //log data
        }else{
            //error message
        }
    }
}