package com.admereselvyn.mic;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import static maes.tech.intentanim.CustomIntent.customType;

public class OnBoardingScreen5 extends AppCompatActivity {
    float x1,x2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding_screen5);

        Button btn5;
        btn5 = findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OnBoardingScreen5.this, UserDashBoard.class);
                startActivity(intent);
            }
        });

    }
    //This method will create left and write gesture
    public boolean onTouchEvent(MotionEvent touchEvent){
        switch(touchEvent.getAction()){
            case (MotionEvent.ACTION_DOWN):
                x1 = touchEvent.getX();
                break;
            case (MotionEvent.ACTION_UP):
                x2 = touchEvent.getX();
                 if((x2>x1)&& (Math.abs(x2-x1)>200)) {
                    Intent i = new Intent(OnBoardingScreen5.this, OnBoardingScreen4.class);
                    startActivity(i);
                     customType(OnBoardingScreen5.this,"right-to-left");
                }
                break;
        }
        return false;
    }
    @Override
    public void onBackPressed() {
        finishAffinity();
        System.exit(0);
    }
}