package com.example.app;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class callus extends AppCompatActivity {
    Button BACKBTN;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_callus);
        text = findViewById(R.id.demoText);
        BACKBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(callus.this, USERDASH.class);
                startActivity(intent);
                finish();
            }
        });

    }
}