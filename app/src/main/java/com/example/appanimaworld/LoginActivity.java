package com.example.appanimaworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {
    Button btnLogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnLogar = findViewById(R.id.btnEntrar);
        entrarMenu();
    }

    public void entrarMenu() {
        btnLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaMenu = new Intent(getApplicationContext(),MenuActivity.class);
                startActivity(telaMenu);
            }
        });
    }
}