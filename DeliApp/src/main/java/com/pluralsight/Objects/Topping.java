package com.pluralsight.Objects;

public class Topping {
    private String name;
    private double price;
    private boolean isExtraMeat;
    private boolean isExtraCheese;

    public Topping(String name, double price, boolean isExtraMeat, boolean isExtraCheese) {
        this.name = name;
        this.price = price;
        this.isExtraMeat = isExtraMeat;
        this.isExtraCheese = isExtraCheese;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {

        return price;
    }

    public boolean isExtraMeat() {

        return isExtraMeat;
    }

    public boolean isExtraCheese() {
        return isExtraCheese;
    }
}
