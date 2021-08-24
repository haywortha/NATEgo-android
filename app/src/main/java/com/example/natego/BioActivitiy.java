package com.example.natego;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class BioActivitiy extends AppCompatActivity {
    private Button finishReg;
    EditText heightval;
    EditText weightval;
    private Button calcBMI;
    TextView textFinalBMI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio_activitiy);

        finishReg = findViewById(R.id.buttonRegfinish);
        finishReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityRegFinish();
            }
        });

        heightval = (EditText) findViewById(R.id.editHeight);
        weightval = (EditText) findViewById(R.id.editWeight);
        calcBMI = (Button) findViewById(R.id.buttonCalcBMI);
        textFinalBMI = (TextView) findViewById(R.id.editActivityLevel6);

        //Calculates the BMI once the button is pressed.
        calcBMI.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textFinalBMI.setText(calculateBMI());
            }
        });

    }

    private void openActivityRegFinish(){
        Intent intent = new Intent(this, Packages.class);
        startActivity(intent);
    }

    //rough calculation of BMI, returns string.
    private String calculateBMI(){
        String height = heightval.getText().toString();
        double finalHeight = Double.parseDouble(height);

        String Weight = weightval.getText().toString();
        double finalWeight = Double.parseDouble(Weight);

        double finalBMI = ((finalWeight / finalHeight) / finalHeight) * 703;
        String strfinalBMI = String.valueOf(finalBMI);

        return strfinalBMI;
    }
}