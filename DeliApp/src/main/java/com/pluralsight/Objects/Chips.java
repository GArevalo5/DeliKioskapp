package com.pluralsight.Objects;

import java.util.List;

public class Chips extends Sandwich {
    private boolean chips;
    private double price;

    public boolean isChips() {
        return chips;
    }

    public void setChips(boolean chips) {
        this.chips = chips;
    }

    public double getPrice() {
        if (chips){
            price = 1.50;
        }
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
