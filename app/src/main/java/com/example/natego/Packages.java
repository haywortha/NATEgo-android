package com.example.natego;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Packages extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_packages);
    }
public void clickPackageDetails(View v){
    Intent intent = new Intent(this, PackageConfirm.class);
    startActivity(intent);
}
}