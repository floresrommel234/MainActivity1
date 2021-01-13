package com.example.mainactivity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.content.Intent;
import android.view.View;


public class BreakfastMenu extends AppCompatActivity {

    public ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast_menu);
    }

    public void switchFoodtray (View view) {
        Intent intent = new Intent(BreakfastMenu.this, FoodTray.class);
        startActivity(intent);

    }
}