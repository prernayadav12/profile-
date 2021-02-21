package com.admereselvyn.mic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomeScreen_Register_now extends AppCompatActivity {

    private Button btn_register_now;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen__registernow);

        btn_register_now = findViewById(R.id.btn_register_now);

        btn_register_now.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeScreen_Register_now.this, HomeScreen_Submit.class);
                startActivity(i);
            }
        });
    }
}