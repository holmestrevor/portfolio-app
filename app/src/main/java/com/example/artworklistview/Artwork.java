package com.example.artworklistview;

public class Artwork {

    private String title, blurb;
    private int imageID, fullImageID;

    public Artwork() {
        this("SOME","BODY ONCE TOLD ME THE WORLD IS GONNA ROLL ME",0, 0);
    }

    public Artwork(String title, String blurb, int imageID, int fullImageID) {
        setTitle(title);
        setBlurb(blurb);
        setImage(imageID);
        setFullImageID(fullImageID);
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

    public int getFullImageID() {
        return fullImageID;
    }

    public void setFullImageID(int fullImageID) {
        this.fullImageID = fullImageID;
    }
}
