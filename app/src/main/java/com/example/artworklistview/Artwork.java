package com.example.artworklistview;

import android.graphics.drawable.Drawable;

public class Artwork {

    private String title;
    private String blurb;
    private int imageID;

    public Artwork() {
        this("Placeholder", "If you're seeing this, I did something wrong.", 0);
    }

    public Artwork(String title, String blurb, int imageID) {
        setTitle(title);
        setBlurb(blurb);
        setImage(imageID);
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

    public int getImageID() {
        return imageID;
    }

    public void setImage(int imageID) {
        this.imageID = imageID;
    }
}
