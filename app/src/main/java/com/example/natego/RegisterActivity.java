package com.example.natego;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

import java.util.Arrays;

public class RegisterActivity extends AppCompatActivity {
    private EditText username, password, confirmPassword, email, phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        View button = findViewById(R.id.buttonReg);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitySetgoal();
            }
        });

        username = findViewById(R.id.textUsername);
        password = findViewById(R.id.textPassword);
        confirmPassword = findViewById(R.id.textConfirmpassword);
        email = findViewById(R.id.textEmail);
        phone = findViewById(R.id.editTextPhone);
    }

    public void openActivitySetgoal(){
        if(checkValidEntries()) {
            Intent intent = new Intent(this, FitnessActivity.class);
            startActivity(intent);
        }
    }

    //this checks the validity for entries on the registration
    //toDo: password strength
    public boolean checkValidEntries(){
        String passwordStr = password.getText().toString();
        String confirmpasswordStr = confirmPassword.getText().toString();

        if(TextUtils.isEmpty(username.getText())){
            username.setError("Username required!");
            return false;
        } else if (TextUtils.isEmpty(email.getText())){
            email.setError("Email required!");
            return false;
        }else if (TextUtils.isEmpty(password.getText())){
            password.setError("Password required!");
            return false;
        }else if (TextUtils.isEmpty(confirmPassword.getText())){
            confirmPassword.setError("Please confirm password!");
            return false;
        }else if (TextUtils.isEmpty(phone.getText())){
            phone.setError("Phone number required!");
            return false;
        }else if(!passwordStr.equals(confirmpasswordStr)) {
            confirmPassword.setError("Passwords do not match!");
            return false;
        }else {
            return true;
        }
    }
}