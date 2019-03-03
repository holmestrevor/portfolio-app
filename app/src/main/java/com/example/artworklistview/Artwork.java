package com.example.artworklistview;

/**
 * @author Trevor Holmes
 * Object that stores the information of an artwork.
 */
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

    /**
     *
     * @return - The title of the Artwork.
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return - The blurb associated with the artwork.
     */
    public String getBlurb() {
        return blurb;
    }

    public void setBlurb(String blurb) {
        this.blurb = blurb;
    }

    /**
     *
     * @return - The image thumbnail resource ID associated with the artwork.
     */
    public int getImageID() {
        return imageID;
    }

    public void setImage(int imageID) {
        this.imageID = imageID;
    }

    /**
     *
     * @return - The image full-res resource ID associated with the artwork.
     */
    public int getFullImageID() {
        return fullImageID;
    }

    public void setFullImageID(int fullImageID) {
        this.fullImageID = fullImageID;
    }
}
