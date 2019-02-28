package com.example.portfolioapp;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import com.example.menulistview.Category;
import com.example.menulistview.CategoryAdapter;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {

    private ArrayList<Category> categories;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);



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