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
    private final int DIGITAL = 15;

    private ArrayList<Artwork> artworks;
    private ArtworkAdapter adt;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artworks);

        Intent fromPrevious = getIntent();

        artworks = loadArtworks(fromPrevious.getIntExtra("Choice", 5));

        adt = new ArtworkAdapter(this, artworks);
        ListView artworkList = (ListView)findViewById(R.id.artworkList);
        artworkList.setAdapter(adt);

    }

    private ArrayList<Artwork> loadArtworks(int category) {
        ArrayList<Artwork> temp = new ArrayList<Artwork>();
        switch(category) {
            case PAINTINGS:
                temp.add(new Artwork("Title","Caption", R.drawable.ironmanthumb));
                break;
            case SKETCHES:
                temp.add(new Artwork("Sombra", "From Underwatch.", R.drawable.sombrathumb));
                break;
            case DIGITAL:
                temp.add(new Artwork("Dark Elf", "From Morrowland", R.drawable.darkelfthumb));
        }
        return temp;
    }

}
