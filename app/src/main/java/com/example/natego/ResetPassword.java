package com.example.natego;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ResetPassword extends AppCompatActivity {
    private EditText newPass, confirmPass, originalPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        newPass = findViewById(R.id.newPassword);
        confirmPass = findViewById(R.id.confirmPassword2);
        originalPass = findViewById(R.id.oldPassword);

        View button = findViewById(R.id.buttonConfirmNewPass);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changePassword();
            }
        });

    }

    public void changePassword(){
        //check if original password entered from the edittext equals the one in database.
        if(checkValidEntries()){
            Intent intent = new Intent(this, Profile.class);
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