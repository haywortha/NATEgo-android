package com.example.natego;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ConfirmFoodActivity extends AppCompatActivity {
    private Button Editbutton;
    private Button Confirmbutton;
    private Button Cancelbutton;
    public EditText mealName, servings, timeEaten, mealType;
    private TextView confirmFood;
    private String receivedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_food);
        mealName = findViewById(R.id.editMealname);
        confirmFood = findViewById(R.id.textConfirmfood);

        Intent intentReceive = getIntent();
        receivedText = intentReceive.getStringExtra("mealname");
        confirmFood.setText(receivedText);

        Editbutton = findViewById(R.id.buttonEdit);
        Editbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityEditFood();
            }
        });

        Confirmbutton = findViewById(R.id.buttonConfirmmeal);
        Confirmbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityConfirmFood();
            }
        });

        Cancelbutton = findViewById(R.id.buttonCancel);
        Cancelbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityCancelFood();
            }
        });
    }
    public void openActivityConfirmFood(){
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    public void openActivityEditFood(){
        Intent intent = new Intent(this, AddFoodActivity.class);
        startActivity(intent);
    }

    public void openActivityCancelFood(){
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

}