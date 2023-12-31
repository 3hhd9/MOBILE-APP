package com.example.app;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
public class USERDASH extends AppCompatActivity {
    Button BACKBTN;
    Button order;
    Button ABTU;
    Button ContactUs;
    Button Feedback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userdash);
        BACKBTN = findViewById(R.id.BACKBTN);
        order = findViewById(R.id.order);
        ABTU = findViewById(R.id.ABU);
        ContactUs = findViewById(R.id.ContactUs);
        Feedback = findViewById(R.id.feed);
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(USERDASH.this, order.class);
                startActivity(intent);
            }
        });
        ABTU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(USERDASH.this, aboutus.class);
                startActivity(intent);
            }
        });
        Feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(USERDASH.this, feed.class);
                startActivity(intent);
            }
        });
        ContactUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(USERDASH.this, callus.class);
                startActivity(intent);
                finish();
            }
        });
        BACKBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(USERDASH.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
