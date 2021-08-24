package com.example.natego;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.buttonReg);
        buttonLogin = findViewById(R.id.buttonLogin);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityReg();
            }
        });

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openActivityLogin(); }
        });


    }
    public void openActivityReg(){
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }

    public void openActivityLogin() {
        //toDO: Validate logins
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    public void openForgotPassword(View v){
        Intent intent = new Intent (this, ForgotPasswordActivity.class);
        startActivity(intent);
    }
}