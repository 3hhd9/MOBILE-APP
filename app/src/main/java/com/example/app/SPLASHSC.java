package com.example.app;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
public class SPLASHSC extends AppCompatActivity {
    private static final int SPLASHDU = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashsc);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SPLASHSC.this, MainScreen.class);
                startActivity(intent);
                finish();
            }
        }, SPLASHDU);
    }
}



