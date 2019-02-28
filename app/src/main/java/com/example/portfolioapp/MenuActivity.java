package com.example.portfolioapp;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import android.widget.TextView;

import com.example.menulistview.Category;
import com.example.menulistview.CategoryAdapter;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MenuActivity extends AppCompatActivity {

    private ArrayList<Category> categories;

    TextView bioTitle;
    ArrayList<TextView> bioParagraphs;
    Animation fadeInRight, fadeInLeft;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        bioTitle = (TextView)findViewById(R.id.bioTitle);
        bioParagraphs = new ArrayList<TextView>();
        bioParagraphs.add((TextView)findViewById(R.id.bioParagraph1));

        fadeInRight = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_fromright);
        fadeInLeft = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_fromleft);

        bioTitle.setAnimation(fadeInRight);

        categories = generateCategories();

        //TODO add custom ListView with artwork categories
        CategoryAdapter adt = new CategoryAdapter(this, categories);
        ListView categoryList = (ListView)findViewById(R.id.categories);
        categoryList.setAdapter(adt);
        categoryList.setOnItemClickListener((parent, view, position, id) -> {

        });

        //TODO add database link to access images on a remote server

    }

    private ArrayList<Category> generateCategories() {
        ArrayList<Category> items = new ArrayList<Category>();
        Drawable realism = Drawable.createFromPath("C:\\Users\\sandw\\AndroidStudioProjects\\portfolio-app\\app\\src\\main\\res\\drawable\\poseidonbg.jpg");
        items.add(new Category("Realism", realism));
        items.add(new Category("Sketches", null));
        return items;
    }

}