package com.example.menulistview;

public class Category {

    private String description;
    private int imgID;

    public Category() {
        this("null", 0);
    }

    public Category(String description, int imgID) {
        setDescription(description);
        setImgID(imgID);
    }

    public void setDescription(String description) {
        this.description=description;
    }

    public String getDescription() {
        return description;
    }

    public void setImgID(int imgID) {
        this.imgID=imgID;
    }

    public int getImgID() {
        return imgID;
    }

    public String toString() {
        return "Category: " + description;
    }

}
