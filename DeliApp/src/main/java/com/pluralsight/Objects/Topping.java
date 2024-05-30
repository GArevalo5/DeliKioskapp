package com.pluralsight.Objects;

public class Topping implements Product{
    private String name;
    private double price;


    public Topping(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
