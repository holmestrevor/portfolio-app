package com.example.portfolioapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import static android.view.View.INVISIBLE;
import static android.view.View.VISIBLE;

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
    Animation aniFadeInShort;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_title);

        title = (TextView)findViewById(R.id.titleText);
        subtitle = (TextView)findViewById(R.id.subtitleText);
        button = (Button)findViewById(R.id.titleButton);
        button.setVisibility(INVISIBLE);
        img = (ImageView)findViewById(R.id.fadeOut);
        bg = (ImageView)findViewById(R.id.titleBG);

        aniFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_out);
        aniFadeIn = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
        aniFadeInLong = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_long);
        aniFadeInShort = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_short);
        shrink = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.shrink);
        moveUp = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.moveup);
        shrinkLess = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.shrink_less);

        /*
        When the moveUp animation has ended, it will call for the button to appear. Otherwise,
        there would be no delay.
         */
        moveUp.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }
            @Override
            public void onAnimationRepeat(Animation animation) {

            }
            @Override
            public void onAnimationEnd(Animation animation) {
                button.setVisibility(VISIBLE);
                button.startAnimation(aniFadeInShort);
            }
        });

        bg.startAnimation(shrinkLess);
        img.startAnimation(aniFadeOut);
        img.setVisibility(INVISIBLE);
//        button.startAnimation(aniFadeIn);
        title.startAnimation(aniFadeIn);
        title.startAnimation(shrink);
        subtitle.startAnimation(aniFadeInLong);
        subtitle.startAnimation(moveUp);

    }

    public void launchMenuActivity(View view) {
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }
}
