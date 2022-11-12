package com.example.maket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button loginBtn;
    private EditText loginText;
    private EditText passwordText;
    private TextView registerText;
    private Button registerBtn;
    private Button getStartedBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        login();
    }

    private void login() {
        setContentView(R.layout.login);

        loginBtn = findViewById(R.id.login_btn);;
        registerText = findViewById(R.id.register);

        registerText.setOnClickListener(v -> {
            register();
        });
    }

    private void register() {
        setContentView(R.layout.register);
        registerBtn = findViewById(R.id.register_btn);
        registerBtn.setOnClickListener(v -> {
            congrats();
        });
    }

    private void congrats() {
        setContentView(R.layout.congrats);
        getStartedBtn = findViewById(R.id.get_started_btn);
        getStartedBtn.setOnClickListener(v -> {
            login();
        });
    }
}