package com.samsung.myapplication.models;

public class Dish {
    public int id;
    public String[] ingredients;

    public Dish() {
        //require
    }

    public Dish(int id, String[] ingredients) {
        this.id = id;
        this.ingredients = ingredients;
    }
}
