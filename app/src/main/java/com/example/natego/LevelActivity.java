package com.example.natego;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class LevelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.activitylevel1:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.activitylevel2:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.activitylevel3:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.activitylevel4:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.activitylevel5:
                if (checked)
                    // Ninjas rule
                    break;
        }
    }

}

