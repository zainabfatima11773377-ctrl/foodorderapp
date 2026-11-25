package com.example.foodorderingapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    View food;
    TextView foodorder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowCompat.enableEdgeToEdge(getWindow());
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        food=findViewById(R.id.logoImage);
        foodorder=findViewById(R.id.txtfood);
        food.setOnClickListener(v -> {
            Intent i=new Intent(this, loginpagefood.class);
            startActivity(i);
        });
        foodorder.setOnClickListener(v -> {
            Intent i=new Intent(this, loginpagefood.class);
            startActivity(i);
        });


    }
}