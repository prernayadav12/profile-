package com.admereselvyn.mic;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import static maes.tech.intentanim.CustomIntent.customType;

public class OnBoardingScreen2 extends AppCompatActivity {
    float x1,x2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding_screen2);
        Button btn2 =findViewById(R.id.btn2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OnBoardingScreen2.this, OnBoardingScreen5.class);
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
                if( (x1>x2)&& (Math.abs(x1-x2)>200)){
                    Intent i = new Intent(OnBoardingScreen2.this, OnBoardingScreen3.class);
                    startActivity(i);
                    customType(OnBoardingScreen2.this,"left-to-right");
                }
                else if((x2>x1)&& (Math.abs(x2-x1)>200)) {
                    Intent i = new Intent(OnBoardingScreen2.this, OnBoardingScreen1.class);
                    startActivity(i);
                    customType(OnBoardingScreen2.this,"right-to-left");
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