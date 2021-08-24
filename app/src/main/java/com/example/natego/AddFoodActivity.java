package com.example.natego;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddFoodActivity extends AppCompatActivity {
    private Button addfoodbutton;
    public EditText mealName;
    private String strMealname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_food);
        mealName = findViewById(R.id.editMealname);
        strMealname = mealName.getText().toString();

        addfoodbutton = findViewById(R.id.buttonAddmeal);
        addfoodbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityConfirmFood();
            }
        });
    }

    public void openActivityConfirmFood(){
        Intent intent = new Intent(this, ConfirmFoodActivity.class);
        intent.putExtra("mealname", strMealname);
        startActivity(intent);
    }



}