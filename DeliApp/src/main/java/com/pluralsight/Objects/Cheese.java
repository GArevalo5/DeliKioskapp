package com.pluralsight.Objects;

public class Cheese extends Topping {
    String name;
    double price;
    boolean extraCheese;

    public Cheese(String name, double price, boolean extraCheese) {
        this.name = name;
        this.price = price;
        this.extraCheese = extraCheese;
    }

    public Cheese() {
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

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }
}
