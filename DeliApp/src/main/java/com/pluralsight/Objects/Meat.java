package com.pluralsight.Objects;

public class Meat extends Topping {
    String name;
    double price;
    boolean extraMeat;


    public Meat() {
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

        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isExtraMeat() {
        return extraMeat;
    }

    public void setExtraMeat(boolean extraMeat) {
        this.extraMeat = extraMeat;
    }
}
