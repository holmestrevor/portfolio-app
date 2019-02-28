package com.example.menulistview;

import android.graphics.drawable.Drawable;

public class Category {

    private String description;
    private Drawable img;

    public Category() {
        this("null", null);
    }

    public Category(String description, Drawable img) {
        setDescription(description);
        setImg(img);
    }

    public void setDescription(String description) {
        this.description=description;
    }

    public String getDescription() {
        return description;
    }

    public void setImg(Drawable img) {
        this.img=img;
    }

    public Drawable getImg() {
        return img;
    }

    public String toString() {
        return "Category: " + description;
    }

}
