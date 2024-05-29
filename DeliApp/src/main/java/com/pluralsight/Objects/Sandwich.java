package com.pluralsight.Objects;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
    private int size;
    private String bread;
    private List<Topping> toppings;
    private String sauce;
    private String toasted;
    private double sandwichPrice;

    public Sandwich(int size, String bread, String sauce, String toasted,double sandwichPrice) {
        this.size = size;
        this.bread = bread;
        this.sauce = sauce;
        this.toasted = toasted;
        this.sandwichPrice = sandwichPrice;
        this.toppings = new ArrayList<>();
    }

    public Sandwich() {
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
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
        if (size == 4){
            sandwichPrice = 5.50;
        }if ( size == 8){
            sandwichPrice = 7.00;
        } if (size == 12){
            sandwichPrice = 8.50;
        }
        return sandwichPrice;
    }

    public String getToasted() {
        return toasted;
    }

    public void setToasted(String toasted) {
        this.toasted = toasted;
    }
}
