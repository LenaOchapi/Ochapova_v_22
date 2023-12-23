package com.example.ochapova_v_22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login extends AppCompatActivity {

    private EditText loginEditText;
    private Button signInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        loginEditText = findViewById(R.id.Login);
        final EditText passwordEditText = findViewById(R.id.Passw);

        loginEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    loginEditText.setBackgroundResource(R.drawable.active_login_plain);
                } else {
                    loginEditText.setBackgroundResource(R.drawable.login_plain);
                }
            }
        });

        passwordEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    passwordEditText.setBackgroundResource(R.drawable.active_login_plain);
                } else {
                    passwordEditText.setBackgroundResource(R.drawable.login_plain);
                }
            }
        });

        signInButton = findViewById(R.id.SignIn);
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String login = loginEditText.getText().toString();
                Intent intent = new Intent(login.this, Personal_area.class);
                intent.putExtra("login", login);
                startActivity(intent);
            }
        });
    }
}