package com.example.appcongthucnauan2023.model;

public class Constant
{
    int image;
    String title;
    String ingredient;
    String implementationstep;


    public Constant(int image, String title, String ingredient, String implementationstep) {
        this.image = image;
        this.title = title;
        this.ingredient = ingredient;
        this.implementationstep = implementationstep;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getIngredient() {
        return ingredient;
    }

    public String getImplementationstep() {
        return implementationstep;
    }
}
