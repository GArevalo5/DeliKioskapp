package com.pluralsight.Objects;

public class Veggies extends Topping {
    String name;


    public Veggies() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public void setPrice(double price) {

    }
}
