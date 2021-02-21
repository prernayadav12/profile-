package com.admereselvyn.mic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeScreen_UploadFile extends AppCompatActivity {

    private Button btn_upload_file;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen__upload_file);

        btn_upload_file = findViewById(R.id.btn_upload_file);

        btn_upload_file.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeScreen_UploadFile.this, HomeScreen_SubmitFile.class);
                startActivity(i);
            }
        });
    }
}