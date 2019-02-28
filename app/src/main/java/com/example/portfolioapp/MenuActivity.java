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
        CategoryAdapter adt = new CategoryAdapter(this, categories);
        categoryList.setAdapter(adt);

        //TODO add database link to access images on a remote server

    }

    private ArrayList<Category> generateCategories() {
        ArrayList<Category> categories = new ArrayList<Category>();
        categories.add(new Category("Realism", null));
        categories.add(new Category("Sketches", null));
        return categories;
    }

    private class CategoryAdapter extends BaseAdapter {

        private ArrayList<Category> items;
        private Context context;

        public CategoryAdapter(Context context, ArrayList<Category> items) {
            this.context = context;
            this.items = items;
        }

        @Override
        public int getCount() {
            return items.size();
        }

        @Override
        public Object getItem(int position) {
            return items.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = getLayoutInflater();
            View newView = inflater.inflate(R.layout.menu_item, parent, false);

            Category currentItem = (Category) getItem(position);

            TextView text = (TextView)convertView.findViewById(R.id.categoryDescription);
            ImageView img = (ImageView)convertView.findViewById(R.id.categoryPreview);

            text.setText(currentItem.getDescription());
            img.setImageDrawable(currentItem.getImg());

            return newView;
        }
    }

}
