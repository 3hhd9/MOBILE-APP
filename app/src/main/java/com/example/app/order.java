package com.example.app;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class order extends AppCompatActivity {
    Button BACKBTN;
    Button calculate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        BACKBTN =findViewById(R.id.BACKBTN);
        calculate =findViewById(R.id.Calculate);
        BACKBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(order.this, USERDASH.class);
                startActivity(intent);
                finish();
            }
        });
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(order.this, Calclate.class);
                startActivity(intent);
                finish();
            }
        });
    }
}