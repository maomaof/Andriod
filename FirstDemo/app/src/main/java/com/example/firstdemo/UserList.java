package com.example.firstdemo;

public class UserList {
    private String name;
    private int imageId;

    public UserList(String name, int imageId)
    {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }
}
