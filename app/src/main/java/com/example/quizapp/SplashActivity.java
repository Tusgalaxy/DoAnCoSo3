package com.example.quizapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ResourceCursorAdapter;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

public class SplashActivity extends AppCompatActivity {

    private TextView appname;

    @Override
    protected void onCreate(Bundle saveInstancetate){
        super.onCreate(saveInstancetate);
        setContentView(R.layout.activity_splash);

        appname = findViewById(R.id.app_name);

        Typeface typeface = ResourcesCompat.getFont(this, R.font.cabin_condensed_bold);
        appname.setTypeface(typeface);

        Animation anim = AnimationUtils.loadAnimation(this, R.anim.myanim);
        appname.setAnimation(anim);

        new Thread() {
            @Override
            public void run() {
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
            }
        }.start();
    }
}