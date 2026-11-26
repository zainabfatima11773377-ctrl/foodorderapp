package com.example.foodorderingapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;

public class loginpagefood extends AppCompatActivity {
    EditText email,pass;
    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowCompat.enableEdgeToEdge(getWindow());
        setContentView(R.layout.activity_loginpagefood);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        email=findViewById(R.id.etEmail);
        pass=findViewById(R.id.etPassword);
        btnlogin=findViewById(R.id.btnLogin);
        btnlogin.setOnClickListener(v -> {
            String E=email.getText().toString().trim();
            String P=pass.getText().toString().trim();
            if(E.isEmpty()||P.isEmpty()){
                email.setError("field is requird!");
                pass.setError("password not entered");
            }else {
                Toast.makeText(this,"login successfully",Toast.LENGTH_LONG).show();
                Intent in=new Intent(this, foodchoice.class);
                startActivity(in);

            }
        });
    }
}