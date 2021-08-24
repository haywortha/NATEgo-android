package com.example.natego;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ForgotPasswordOTP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password_otp);

        View button = findViewById(R.id.buttonOTP);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityOTP();
            }
        });
    }

    public void openActivityOTP(){
        Intent intent = new Intent(this, ForgotPasswordNew.class);
        startActivity(intent);
    }
}