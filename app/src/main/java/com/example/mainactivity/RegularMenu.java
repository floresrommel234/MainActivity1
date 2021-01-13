package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class RegularMenu extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regular_menu);

    }

    public void switchFoodtray (View view) {
        Intent intent = new Intent(RegularMenu.this, FoodTray.class);
        startActivity(intent);

    }
}