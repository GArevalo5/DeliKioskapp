package com.pluralsight.Objects;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
    private int size;
    private String bread;
    private List<Topping> toppings;
    private String sauce;
    private double sandwichPrice;

    public Sandwich(int size, String bread, String sauce, double sandwichPrice) {
        this.size = size;
        this.bread = bread;
        this.sauce = sauce;
        this.sandwichPrice = sandwichPrice;

        this.toppings = new ArrayList<>();
    }

    public int getSize() {
        return size;
    }

    public String getBread() {
        return bread;
    }

    public void add(Topping topping) {
        toppings.add(topping);
    }

    public String getSauce() {
        return sauce;
    }

    public double getSandwichPrice() {
        return sandwichPrice;
    }
}
