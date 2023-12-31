package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ADMINDASH extends AppCompatActivity {
   Button addBTN,deleteBTN,updateBTN,insertBTN,BackBTN;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admindash);



        // Initialize buttons
        addBTN = findViewById(R.id.addButton);
        deleteBTN = findViewById(R.id.deleteButton);
        updateBTN = findViewById(R.id.updatebutton);
        insertBTN = findViewById(R.id.insertbutton);
        BackBTN =findViewById(R.id.BACKBTN);


        addBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ADMINDASH.this, "Add User clicked", Toast.LENGTH_SHORT).show();
            }
        });
        deleteBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(ADMINDASH.this, "Delete User clicked", Toast.LENGTH_SHORT).show();

            }
        });
        updateBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(ADMINDASH.this, "Update User clicked", Toast.LENGTH_SHORT).show();

            }
        });


        insertBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(ADMINDASH.this, "Insert clicked", Toast.LENGTH_SHORT).show();

            }
        });


        BackBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ADMINDASH.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }
}