package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        TextView logo1 = findViewById(R.id.TextViewTopTitle);
        TextView logo2 = findViewById(R.id.TextViewBottomTitle);

        Animation fade1 = AnimationUtils.loadAnimation(this, R  .anim.fade_in);
        logo1.startAnimation(fade1);
        logo2.startAnimation(fade1);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Ensure UI-related operations are on the main thread
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        setContentView(R.layout.activity_main);
                    }
                });
            }
        }, 2000);

    }
}