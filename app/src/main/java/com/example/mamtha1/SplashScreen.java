package com.example.mamtha1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class SplashScreen extends AppCompatActivity {

    TextView chatgpt;
    LottieAnimationView lottie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        chatgpt=findViewById(R.id.chatgpt);
        lottie=findViewById(R.id.lottie);

        chatgpt.animate().translationY(-1400).setDuration(2500).setStartDelay(0);
        lottie.animate().translationX(2000).setDuration(2000).setStartDelay(2900);




        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);

            }


        },5000);
    }
}