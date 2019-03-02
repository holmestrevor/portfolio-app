package com.example.portfolioapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

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

    ListView artworkList;
    TextView categoryTitle;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artworks);

        Intent fromPrevious = getIntent();

        categoryTitle = (TextView)findViewById(R.id.categoryTitle);
        categoryTitle.setText(fromPrevious.getStringExtra("Category"));

        artworks = loadArtworks(fromPrevious.getIntExtra("Choice", 5));

        adt = new ArtworkAdapter(this, artworks);
        artworkList = (ListView)findViewById(R.id.artworkList);
        artworkList.setAdapter(adt);

    }

    private ArrayList<Artwork> loadArtworks(int category) {
        ArrayList<Artwork> temp = new ArrayList<Artwork>();
        switch(category) {
            case PAINTINGS:
                temp.add(new Artwork(getResources().getString(R.string.ironmanTitle),getResources().getString(R.string.ironmanDescription), R.drawable.ironmanthumb, R.drawable.ironmanfull));
                temp.add(new Artwork(getResources().getString(R.string.pupperTitle),getResources().getString(R.string.pupperDescription),R.drawable.pupperthumb, R.drawable.pupperthumb));
                break;
            case SKETCHES:
                temp.add(new Artwork(getResources().getString(R.string.sombraTitle),getResources().getString(R.string.sombraDescription), R.drawable.sombrathumb, R.drawable.sombrafull));
                temp.add(new Artwork(getResources().getString(R.string.peggTitle),getResources().getString(R.string.peggDescription),R.drawable.peggthumb, R.drawable.peggfull));
                temp.add(new Artwork(getResources().getString(R.string.pageTitle),getResources().getString(R.string.pageDescription),R.drawable.pagethumb, R.drawable.pagefull));
                temp.add(new Artwork(getResources().getString(R.string.streetTitle),getResources().getString(R.string.streetDescription),R.drawable.streetthumb, R.drawable.streetfull));
                break;
            case DIGITAL:
                temp.add(new Artwork(getResources().getString(R.string.darkelfTitle),getResources().getString(R.string.darkelfDescription), R.drawable.darkelfthumb, R.drawable.darkelffull));
        }
        return temp;
    }

}
