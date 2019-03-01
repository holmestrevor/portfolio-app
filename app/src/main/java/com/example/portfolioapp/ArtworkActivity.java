package com.example.portfolioapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.artworklistview.Artwork;
import com.example.artworklistview.ArtworkAdapter;

import java.util.ArrayList;

public class ArtworkActivity extends AppCompatActivity {

    public static final String TAG = "ArtworkActivity";
    private final int SKETCHES = 5;
    private final int PAINTINGS = 10;

    private ArrayList<Artwork> artworks;
    private ArtworkAdapter adt;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artworks);

        adt = new ArtworkAdapter(this, artworks);
        ListView artworkList = (ListView)findViewById(R.id.artworkList);
        artworkList.setAdapter(adt);

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
        switch(requestCode) {
            case PAINTINGS:
                if(resultCode==RESULT_OK) {
                    loadArtworks(PAINTINGS);
                }
                break;
            case SKETCHES:
                if(resultCode==RESULT_OK) {
                    loadArtworks(SKETCHES);
                }
                break;
        }
    }

    private ArrayList<Artwork> loadArtworks(int category) {
        ArrayList<Artwork> temp = new ArrayList<Artwork>();
        switch(category) {
            case PAINTINGS:
                temp.add(new Artwork());
                break;
            case SKETCHES:
                temp.add(new Artwork());
                break;
        }
        return temp;
    }

}
