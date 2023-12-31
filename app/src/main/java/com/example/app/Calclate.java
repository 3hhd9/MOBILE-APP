package com.example.app;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class Calclate extends AppCompatActivity {
    final double CUP2_PRICE = 0.5;
    final double BIG3_PRICE = 25;
    final double SMALL1_PRICE = 10;
    final double STBR1_PRICE = 2.9;
    EditText Enteredcode;
    Button btnCalculateCost, btnCalculateVAT, BACKBTN;
    TextView ViewVat, TCV, Cost, Code, TotalCostWithVAT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calclate);
        BACKBTN = findViewById(R.id.BACKBTN);
        final EditText CakeCode = findViewById(R.id.CakeCode);
        final TextView Cost = findViewById(R.id.Cost);
        final TextView ViewVAT = findViewById(R.id.ViewVAT);
        final TextView TotalCostWithVAT = findViewById(R.id.TotalCostWithVAT);
        btnCalculateCost = findViewById(R.id.btnCalculateCost);
        btnCalculateVAT = findViewById(R.id.btnCalculateVAT);
        btnCalculateCost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cakeCodeStr = CakeCode.getText().toString().trim();
                double cost;
                if (cakeCodeStr.equals("CUP2")) {
                    cost = CUP2_PRICE;
                } else if (cakeCodeStr.equals("BIG3")) {
                    cost = BIG3_PRICE;
                } else if (cakeCodeStr.equals("SMALL1")) {
                    cost = SMALL1_PRICE;
                } else if (cakeCodeStr.equals("STBR1")) {
                    cost = STBR1_PRICE;
                } else {
                    cost = 0;
                }
                Cost.setText("Cost: " + cost);
                btnCalculateVAT.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String costString = Cost.getText().toString().replace("Cost: ", "");
                        double cost = Double.parseDouble(costString);
                        // Calculate VAT
                        double vat = cost * 0.05;
                        ViewVAT.setText("VAT (5%): " + vat);
                        double totalCostnVAT = cost + vat;
                        TotalCostWithVAT.setText("Total Cost with VAT: " + totalCostnVAT);
                    }
                });
            }
        });
        BACKBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Calclate.this, order.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
