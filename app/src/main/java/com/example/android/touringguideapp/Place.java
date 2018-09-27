package com.example.android.touringguideapp;

public class Place
{
    // some varaible to hold information
    private String name;
    private String address;
    private int imageRessource;

    public Place(String name, String address, int imageRessource) {
        this.name = name;
        this.address = address;
        this.imageRessource = imageRessource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getImageRessource() {
        return imageRessource;
    }

    public void setImageRessource(int imageRessource) {
        this.imageRessource = imageRessource;
    }



}
