package com.example.portfolioapp;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class ViewArtworkActivity extends AppCompatActivity {

    private ImageView mImageView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artview);
        getSupportActionBar().hide();

        Intent fromPrevious = getIntent();

        mImageView = (ImageView) findViewById(R.id.artFull);
        mImageView.setImageResource(fromPrevious.getIntExtra("imageID", R.drawable.poseidonbg));

        if(mImageView.getDrawable().getIntrinsicWidth()>mImageView.getDrawable().getIntrinsicHeight()) {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        }

    }
}
