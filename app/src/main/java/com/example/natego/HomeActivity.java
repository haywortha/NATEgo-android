package com.example.natego;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;

public class HomeActivity extends AppCompatActivity {
    private FloatingActionButton buttonAddfood;
    private ImageButton profileButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        buttonAddfood = findViewById(R.id.buttonAddfood);
        profileButton = findViewById(R.id.imageButton1);

        buttonAddfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityAddfood();
            }
        });
    }

    public void openActivityAddfood(){
        Intent intent = new Intent(this, AddFoodActivity.class);
        startActivity(intent);

    }

    public void gotoProfile(View v){
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }
}