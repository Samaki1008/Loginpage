package com.example.loginpage;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class login_page extends AppCompatActivity {

    private EditText login_username,login_password;
    private Button login_button;
    private String username = "sammed";
    private String password = "sammed@098";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login();
    }

    public void login() {
        login_username = (EditText) findViewById(R.id.login_username);
        login_password = (EditText) findViewById(R.id.login_password);
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (login_username.getText().toString().equals("Sammed") && login_password.getText().toString().equals("sammed@069")) {

                } else {

                }
            }
        });
    }
    }



