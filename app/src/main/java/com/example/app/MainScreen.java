package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainScreen extends AppCompatActivity {
    Button Adminloginn;
    Button userloginn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        Adminloginn = findViewById(R.id.Adminlogin);
        userloginn = findViewById(R.id.userlogin);

        Adminloginn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String adminUsername = "ADMINSALIM";
                String adminPassword = "admin1234";

                // Admin login button click
                Intent adminIntent = new Intent(MainScreen.this, MainActivity.class);
                adminIntent.putExtra("ADMNUSER", adminUsername);
                adminIntent.putExtra("PASSWORDADMN", adminPassword);
                startActivity(adminIntent);
            }
        });

        userloginn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = "USER";
                String password="1234";

                // Handle User login button click
                Intent userIntent = new Intent(MainScreen.this, USERDASH.class);
                userIntent.putExtra("USR", user);
                userIntent.putExtra("PASS", password);
                startActivity(userIntent);

            }

        });

    }
}



