package com.pluralsight.Objects;

public class Chips extends Sandwich {
    private boolean chips;

    public Chips(String bread, String meatTopping, boolean extraMeat, boolean extraCheese, String regularTopping, String sauce, String sides, boolean chips) {
        super(bread, meatTopping, extraMeat, extraCheese, regularTopping, sauce, sides);
        this.chips = chips;
    }
}
