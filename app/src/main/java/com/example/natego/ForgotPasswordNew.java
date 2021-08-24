package com.example.natego;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ForgotPasswordNew extends AppCompatActivity {
    private EditText newPass, confirmPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password_new);

        View button = findViewById(R.id.buttonNewPass);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityLogin();
            }
        });

        newPass = findViewById(R.id.NewPassword);
        confirmPass = findViewById(R.id.ConfirmPassword);
    }

    public void openActivityLogin(){
        if(checkValidEntries()) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }

    public boolean checkValidEntries(){
        String passwordNew = newPass.getText().toString();
        String passwordConf = confirmPass.getText().toString();

        if(!passwordNew.equals(passwordConf)){
            confirmPass.setError("Passwords do not match!");
            return false;
        } else {
            //toDo: adds new password to account
            return true;
        }
    }
}