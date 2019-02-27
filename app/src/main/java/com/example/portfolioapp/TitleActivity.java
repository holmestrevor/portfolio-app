package com.example.portfolioapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import static android.view.View.INVISIBLE;

public class TitleActivity extends AppCompatActivity {

    TextView title;
    TextView subtitle;
    Button button;
    ImageView img;
    ImageView bg;
    Animation aniFadeOut;
    Animation aniFadeIn;
    Animation shrink;
    Animation shrinkLess;
    Animation moveUp;
    Animation aniFadeInLong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title);
        getSupportActionBar().hide();

        title = (TextView)findViewById(R.id.titleText);
        subtitle = (TextView)findViewById(R.id.subtitleText);
        button = (Button)findViewById(R.id.titleButton);
        img = (ImageView)findViewById(R.id.fadeOut);
        bg = (ImageView)findViewById(R.id.titleBG);

        aniFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_out);
        aniFadeIn = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
        aniFadeInLong = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_long);
        shrink = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.shrink);
        moveUp = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.moveup);
        shrinkLess = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.shrink_less);

        bg.startAnimation(shrinkLess);
        img.startAnimation(aniFadeOut);
        img.setVisibility(INVISIBLE);
        button.startAnimation(aniFadeIn);
        title.startAnimation(aniFadeIn);
        title.startAnimation(shrink);
        subtitle.startAnimation(aniFadeInLong);
        subtitle.startAnimation(moveUp);

    }
}
