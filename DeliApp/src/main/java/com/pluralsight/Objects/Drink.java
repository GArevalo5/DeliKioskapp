package com.pluralsight.Objects;

public class Drink extends Sandwich{
    private Double drinkSize;
    private boolean orderDrink;

    public Drink(String bread, String meatTopping, boolean extraMeat, boolean extraCheese, String regularTopping, String sauce, String sides, Double drinkSize) {
        super(bread, meatTopping, extraMeat, extraCheese, regularTopping, sauce, sides);
        this.drinkSize = drinkSize;
    }
}
