package com.chesterrapp.activities;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

import com.chesterrapp.R;

public class SplashActivity extends AppCompatActivity {

    ImageView ivSplashLogo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        findViewById(R.id.ivSplashLogo).startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.splash_animation));
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(getApplicationContext(), "Chesterr", Toast.LENGTH_LONG).show();
            }
        },1500);
    }
}
