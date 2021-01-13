package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HappyMealMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_happy_meal_menu);
    }

    public void switchFoodtray (View view) {
        Intent intent = new Intent(HappyMealMenu.this, FoodTray.class);
        startActivity(intent);

    }
}