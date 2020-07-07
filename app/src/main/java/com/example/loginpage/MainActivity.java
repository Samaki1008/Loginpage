package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private Button reguser,nonreguser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signin_signup();
    }


    public void signin_signup()
    {
        reguser =(Button) findViewById(R.id.reguser);
        nonreguser = (Button) findViewById(R.id.nonreguser);

        reguser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), login_page.class);
                startActivity(i);
            }
        });

        nonreguser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),reg_page.class);
                startActivity(i);

            }
        });


    }
}