package com.example.ochapova_v_22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Personal_area extends AppCompatActivity {

    public void onClickBack(View view){
        Intent intent = new Intent(this, login.class);
        startActivity(intent);
    }

    public void onClickSite(View view) {Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://moskva.mts.ru/personal"));
        startActivity(intent);}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_area);

        String login = getIntent().getStringExtra("login");
        TextView welcomeTextView;
        welcomeTextView = findViewById(R.id.welcomeTextView2);
        welcomeTextView.setText(login);
        welcomeTextView.setTextColor(getResources().getColor(R.color.redColor));
    }
}