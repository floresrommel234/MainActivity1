package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DessertAndBeverages extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert_and_beverages);
    }

    public void switchFoodtray (View view) {
        Intent intent = new Intent(DessertAndBeverages.this, FoodTray.class);
        startActivity(intent);

    }
}