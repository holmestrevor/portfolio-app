package com.example.com.example.artworklistview;

import android.graphics.drawable.Drawable;

public class Artwork {

    private String title;
    private String blurb;
    private Drawable image;

    public Artwork() {
        this("Placeholder", "If you're seeing this, I did something wrong.", null);
    }

    public Artwork(String title, String blurb, Drawable image) {
        setTitle(title);
        setBlurb(blurb);
        setImage(image);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBlurb() {
        return blurb;
    }

    public void setBlurb(String blurb) {
        this.blurb = blurb;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }
}
