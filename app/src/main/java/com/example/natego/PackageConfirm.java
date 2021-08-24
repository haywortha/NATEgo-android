package com.example.natego;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PackageConfirm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_package_confirm);
    }

    public void clickBackPackage(View v){
        Intent intent = new Intent(this, Packages.class);
        startActivity(intent);
    }

    public void clickNextPackage(View v){
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}