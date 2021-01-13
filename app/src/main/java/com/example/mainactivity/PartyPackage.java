package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PartyPackage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_party_package);
    }

    public void switchFoodtray (View view) {
        Intent intent = new Intent(PartyPackage.this, FoodTray.class);
        startActivity(intent);

    }
}