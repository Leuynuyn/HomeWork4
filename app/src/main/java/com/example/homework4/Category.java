package com.example.homework4;

public class Category {
    int imageResId;
    String title;
    Class<?> targetActivity;
    public Category(int imageResId, String title, Class<?> targetActivity) {
        this.imageResId = imageResId;
        this.title = title;
        this.targetActivity = targetActivity;
    }

    public Category() {
    }

    public int getImageResId() {
        return imageResId;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public Class<?> getTargetActivity(){
        return targetActivity;
    }
}
