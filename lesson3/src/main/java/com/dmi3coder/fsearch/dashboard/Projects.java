package com.dmi3coder.fsearch.dashboard;


import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import com.kinvey.java.model.KinveyFile;

public class Projects {

    @Key
    private String name;
    @Key
    private String description;
    @Key
    private int price;
    @Key
    private int level;
    @Key
    private String country;

    public Projects(){}

    public Projects(String name, String description, int price, int level, String country) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.level = level;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return name + " \n "+ price;
    }
}
