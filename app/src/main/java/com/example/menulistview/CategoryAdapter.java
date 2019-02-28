package com.example.menulistview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class CategoryAdapter extends ArrayAdapter<Category> {

    Context ctx;
    ArrayList<Category> items;

    public CategoryAdapter(Context context, int resource, ArrayList<Category> objects) {
        super(context, resource, objects);
    }

    public CategoryAdapter(Context context, int resource) {
        super(context, resource);
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Category getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }

    public Context getCtx() {
        return ctx;
    }

    public void setCtx(Context ctx) {
        this.ctx = ctx;
    }

    public ArrayList<Category> getItems() {
        return items;
    }

    public void setItems(ArrayList<Category> items) {
        this.items = items;
    }
}
