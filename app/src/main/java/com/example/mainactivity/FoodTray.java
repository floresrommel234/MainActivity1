package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FoodTray extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_tray);
    }

    public void switchPaymentMethod(View view) {
        Intent intent = new Intent(FoodTray.this,PaymentMethod.class);
        startActivity(intent);
    }
}