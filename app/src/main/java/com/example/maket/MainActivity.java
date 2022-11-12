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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        loginBtn = findViewById(R.id.login_btn);
        loginText = findViewById(R.id.login);
        passwordText = findViewById(R.id.password);
        registerText = findViewById(R.id.register);

        registerText.setOnClickListener(v -> {
            setContentView(R.layout.register);
        });

    }
}