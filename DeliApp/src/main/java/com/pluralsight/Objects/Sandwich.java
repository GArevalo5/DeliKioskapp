package com.pluralsight.Objects;

public class Sandwich {
    String bread;
    String meatTopping;
    boolean extraMeat;
    boolean extraCheese;
    String regularTopping;
    String sauce;
    String sides;

    public Sandwich(String bread, String meatTopping, boolean extraMeat, boolean extraCheese, String regularTopping, String sauce, String sides) {
        this.bread = bread;
        this.meatTopping = meatTopping;
        this.extraMeat = extraMeat;
        this.extraCheese = extraCheese;
        this.regularTopping = regularTopping;
        this.sauce = sauce;
        this.sides = sides;
    }

    public String getBread() {
        return bread;
    }

    public String getMeatTopping() {
        return meatTopping;
    }

    public boolean isExtraMeat() {
        return extraMeat;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public String getRegularTopping() {
        return regularTopping;
    }

    public String getSauce() {
        return sauce;
    }

    public String getSides() {
        return sides;
    }

}
