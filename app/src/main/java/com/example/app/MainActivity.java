package com.example.app;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText username;
    private EditText password;
    Button loginButton;
    Button BACKBTN;


    TextView SignUpText;
    // Define admin credentials
    String adminUsername = "ADMINSALIM";
    String adminPw = "admin1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);
        SignUpText = findViewById(R.id.SignUpText);
        BACKBTN = findViewById(R.id.BACKBTN);
        SignUpText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signUpIntent = new Intent(MainActivity.this, Regisrer.class);
                startActivity(signUpIntent);

            }
        });
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String eUsername = username.getText().toString();
                String ePassword = password.getText().toString();

                if (eUsername.equals("user") && ePassword.equals("1234")) {
                    // User login successful
                    Toast.makeText(MainActivity.this, "Login Successful for User", Toast.LENGTH_SHORT).show();
                    Intent uIntent = new Intent(MainActivity.this, USERDASH.class);
                    startActivity(uIntent);
                    finish();
                } else if (eUsername.equals("adminsalim") && ePassword.equals("admin1234")) {
                    // Admin login successful
                    Toast.makeText(MainActivity.this, "Login Successful for Admin", Toast.LENGTH_SHORT).show();
                    Intent adminIntent = new Intent(MainActivity.this, ADMINDASH.class);
                    startActivity(adminIntent);
                    finish();
                } else {
                    // Incorrect username or password for both Admin and User
                    Toast.makeText(MainActivity.this, "Login Failed. Incorrect credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });

        BACKBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainScreen.class);
                startActivity(intent);
                finish();
            }
        });
    }
}