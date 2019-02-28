package com.example.menulistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.portfolioapp.R;

import java.util.ArrayList;

public class CategoryAdapter extends ArrayAdapter<Category> {

    public CategoryAdapter(Context context, ArrayList<Category> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Category c = getItem(position);

        if(convertView==null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.menu_item, parent, false);
        }

        TextView text = (TextView)convertView.findViewById(R.id.categoryDescription);
        ImageView img = (ImageView)convertView.findViewById(R.id.categoryPreview);

        text.setText(c.getDescription());
        img.setImageDrawable(c.getImg());

        return convertView;
    }
}
