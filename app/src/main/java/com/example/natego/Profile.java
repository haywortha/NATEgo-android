package com.example.natego;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Profile extends AppCompatActivity {
    private Button resetPasssword, close;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        resetPasssword = findViewById(R.id.resetpasswordButton);
        close = findViewById(R.id.buttonClose);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backHome();
            }
        });
    }

    public void resetPassword(View v){
        Intent intent = new Intent(this, ResetPassword.class);
        startActivity(intent);
    }

    public void backHome(){
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}