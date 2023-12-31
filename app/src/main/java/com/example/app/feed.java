package com.example.app;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class feed extends AppCompatActivity {
    Button BACKBTN;
    Button SUB;
    private TextView feedback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);
        feedback = findViewById(R.id.feedback);
        BACKBTN = findViewById(R.id.BACKBTN);
        SUB= findViewById(R.id.SUBMIT);
            BACKBTN.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(feed.this, USERDASH.class);
                    startActivity(intent);
                    finish();
                }
            });
        }
    }
