package com.example.portfolioapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.example.menulistview.Category;
import com.example.menulistview.CategoryAdapter;

import java.util.ArrayList;
import java.util.Calendar;

public class MenuActivity extends AppCompatActivity {

    private ArrayList<Category> categories;

    private final int SKETCHES = 5;
    private final int PAINTINGS = 10;

    private TextView bioTitle;
    private ArrayList<TextView> bioParagraphs;
    private Animation fadeInRight, fadeInLeft;
    private CategoryAdapter adt;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        getSupportActionBar().hide();

        bioTitle = (TextView)findViewById(R.id.bioTitle);
        bioParagraphs = new ArrayList<TextView>();

        bioParagraphs.add((TextView)findViewById(R.id.bioParagraph1));

        /*
        This block will replace the character @ in the first paragraph with my current age, so I'll
        never have to do it manually because I'm lazy.
         */
        String p1 = ((TextView) findViewById(R.id.bioParagraph1)).getText().toString();
        bioParagraphs.get(0).setText(p1.replaceFirst("@",String.valueOf(Calendar.getInstance().get(Calendar.YEAR)-1998)));

        fadeInRight = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_fromright);
        fadeInLeft = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_fromleft);

        bioTitle.setAnimation(fadeInRight);
        for(int i=0; i<bioParagraphs.size(); i++) {
            if(i%2==0) {
                bioParagraphs.get(i).setAnimation(fadeInLeft);
            } else {
                bioParagraphs.get(i).setAnimation(fadeInRight);
            }
        }

        categories = generateCategories();

        adt = new CategoryAdapter(this, categories);
        ListView categoryList = (ListView)findViewById(R.id.categories);
        categoryList.setAdapter(adt);
        categoryList.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent();
        });

        //TODO add database link to access images on a remote server

    }

    private ArrayList<Category> generateCategories() {
        ArrayList<Category> items = new ArrayList<>();
        items.add(new Category("Paintings", R.drawable.ironmanthumb));
        items.add(new Category("Sketches/Drawings", R.drawable.sombrathumb));
        return items;
    }

    public void launchArtworkActivity(View view) {
        Intent intent = new Intent(this, ArtworkActivity.class);
        int titleIndex = 1;
        LinearLayout l = (LinearLayout)view;
        TextView t = (TextView)l.getChildAt(titleIndex);
        switch(t.getText().toString()) {
            case "Paintings":
                startActivityForResult(intent, PAINTINGS);
                break;
            case "Sketches/Drawings":
                startActivityForResult(intent, SKETCHES);
                break;
        }
    }

}