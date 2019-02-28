package com.example.portfolioapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

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

        //TODO add custom ListView with artworks
        ListView categoryList = (ListView)findViewById(R.id.categories);
        CategoryAdapter adt = new CategoryAdapter(this, R.layout.menu_item, categories);
        categoryList.setAdapter(adt);

        //TODO add database link to access images on a remote server

    }

    private ArrayList<Category> generateCategories() {
        ArrayList<Category> categories = new ArrayList<Category>();
        categories.add(new Category("Realism", null));
        categories.add(new Category("Sketches", null));
        return categories;
    }

}
