package com.example.portfolioapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class ViewArtworkActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artview);

        Intent fromPrevious = getIntent();

        ImageView artFull = (ImageView)findViewById(R.id.artFull);
        artFull.setImageResource(fromPrevious.getIntExtra("imageID", R.drawable.poseidonbg));

    }

}
