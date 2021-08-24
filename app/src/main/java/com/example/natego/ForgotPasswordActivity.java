package com.example.natego;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ForgotPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        View button = findViewById(R.id.buttonPass);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityOTP();
            }
        });
    }

    public void openActivityOTP(){

        //toDo: validates OTP before starting intent

        Intent intent = new Intent(this, ForgotPasswordOTP.class);
        startActivity(intent);
    }
}