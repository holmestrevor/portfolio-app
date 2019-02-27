package com.example.portfolioapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import static android.view.View.INVISIBLE;

public class TitleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        Button button = (Button)findViewById(R.id.titleButton);
        ImageView img = (ImageView)findViewById(R.id.fadeOut);

        Animation aniFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_out);
        Animation aniFadeIn = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);

        img.startAnimation(aniFadeOut);
        img.setVisibility(INVISIBLE);
        button.startAnimation(aniFadeIn);



    }
}
