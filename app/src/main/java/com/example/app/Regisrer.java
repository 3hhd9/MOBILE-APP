package com.example.app;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class Regisrer extends AppCompatActivity {
    EditText username;
    EditText MobilePhone;
    EditText password;
    EditText Repassword;
    TextView loginText;
    Button RegisterButton;
    Button BACKBTN;
    //DATABASEHELPER DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regisrer);
        username = findViewById(R.id.username);
        MobilePhone = findViewById(R.id.Mobile);
        password = findViewById(R.id.password);
        Repassword = findViewById(R.id.ConfirmedPW);
        RegisterButton = findViewById(R.id.RegstrButton);
        loginText = findViewById(R.id.SignUpText);
        BACKBTN =findViewById(R.id.BACKBTN);
       // DB = new DATABASEHELPER(this);

        //login text under the form
        loginText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               // DB.addUSER(username,MobilePhone);
                // Navigate back to the MainActivity (login page)
                Intent intent = new Intent(Regisrer.this, MainActivity.class);
                startActivity(intent);

                finish(); // Close the current Register activity
            }
        });

          // button of registration
        RegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register();
            }
        });

    }

    private void register() {
        String usernameStr = username.getText().toString().trim();
        String mobilePhoneStr = MobilePhone.getText().toString().trim();
        String passwordStr = password.getText().toString().trim();
        String confirmPasswordStr = Repassword.getText().toString().trim();

        if (!usernameStr.isEmpty() && !mobilePhoneStr.isEmpty() && !passwordStr.isEmpty() && !confirmPasswordStr.isEmpty()) {
            if (passwordStr.equals(confirmPasswordStr)) {
                // Passwords match, perform registration logic here
                // For demonstration, show a Toast indicating successful registration
                Toast.makeText(Regisrer.this, "Registration successful!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Regisrer.this, MainActivity.class);
                startActivity(intent);
                finish();

                Intent intentt = new Intent(Regisrer.this, MainActivity.class);
                intent.putExtra("registration_successful", true);
                // Optionally pass any data back
                startActivity(intent);
                finish();

            } else {
                // Passwords don't match, display an error message
                Toast.makeText(Regisrer.this, "Passwords not matches", Toast.LENGTH_SHORT).show();
            }
        } else {
            // Fields are empty, display a message to fill in all fields
            Toast.makeText(Regisrer.this, "Please fill in all the fields", Toast.LENGTH_SHORT).show();
        }
        BACKBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Regisrer.this, MainScreen.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
