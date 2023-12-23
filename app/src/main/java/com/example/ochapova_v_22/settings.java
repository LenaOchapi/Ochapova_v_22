package com.example.ochapova_v_22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class settings extends AppCompatActivity {

    private Switch switchSet1, switchSet2, switchSet3;
    private Button resetButton;

    public void onClickGoBack(View view){
        Intent intent = new Intent(this, Personal_area.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);

        switchSet1 = findViewById(R.id.SwitchSet1);
        switchSet2 = findViewById(R.id.SwitchSet2);
        switchSet3 = findViewById(R.id.SwitchSet3);
        resetButton = findViewById(R.id.resetButton);



        switchSet1.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                switchSet1.setTextColor(Color.RED);
            } else {
                switchSet1.setTextColor(Color.BLACK);
            }
        });

        switchSet2.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                switchSet2.setTextColor(Color.RED);
            } else {
                switchSet2.setTextColor(Color.BLACK);
            }
        });

        switchSet3.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                switchSet3.setTextColor(Color.RED);
            } else {
                switchSet3.setTextColor(Color.BLACK);
            }
        });

        resetButton.setOnClickListener(v -> {
            switchSet1.setChecked(false);
            switchSet2.setChecked(false);
            switchSet3.setChecked(false);
        });


    }
}