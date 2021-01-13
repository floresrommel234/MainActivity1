package com.example.mainactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class McdoMenu extends AppCompatActivity {

    public Imageview imageview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcdo_menu);
    }

    public void switchBreakfastMenu(View view) {
        Intent intent = new Intent(McdoMenu.this, BreakfastMenu.class);
        startActivity(intent);

    }

    public void switchRegularMenu(View view) {
        Intent intent = new Intent(McdoMenu.this, RegularMenu.class);
        startActivity(intent);
    }

    public void switchSecretMenu(View view) {
        Intent intent = new Intent(McdoMenu.this, SecretMenu.class);
        startActivity(intent);
    }

    public void switchHappyMealMenu(View view) {
        Intent intent = new Intent(McdoMenu.this, HappyMealMenu.class);
        startActivity(intent);

    }

    public void switchPartyPackage(View view) {
        Intent intent = new Intent(McdoMenu.this, PartyPackage.class);
        startActivity(intent);
    }

    public void switchDessetAndBeverages(View view) {
        Intent intent = new Intent(McdoMenu.this, DessertAndBeverages.class);
        startActivity(intent);
    }
}