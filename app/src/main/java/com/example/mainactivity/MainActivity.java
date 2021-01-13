package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
            public void switchActivity (View view) {
                Intent intent = new Intent(MainActivity.this,McdoMenu.class);
                startActivity(intent);
            }
}