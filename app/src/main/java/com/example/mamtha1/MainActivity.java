package com.example.mamtha1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // textView = findViewById(R.id.textView);

        textToSpeech=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if(i!=TextToSpeech.ERROR){
                    textToSpeech.setLanguage(Locale.UK);
                    textToSpeech.speak("Hi there! By using this AI ChatBot app,you can tap into knowledge of an AI assistant to ask questons nd recieve accurate answers",TextToSpeech.QUEUE_FLUSH,null);
                }


            }
        });

    }

    public void ChatAI(View view){
        Intent intent=new Intent(this,ChatAI.class);
        startActivity(intent);
    }
    public void ImageAI(View view){
        Intent intent=new Intent(this,ImageAI.class);
        startActivity(intent);
    }
    public void SMSAI(View view){
        Intent intent=new Intent(this, SMSSender.class);
        startActivity(intent);
    }
    public void NewsActivity(View view){
        Intent intent=new Intent(this, NewsActivity.class);
        startActivity(intent);
    }
}