package com.pluralsight.Objects;

import com.pluralsight.UI.OrderScreen;

import java.util.List;
import java.util.Scanner;

public class Drink extends Sandwich{
    private String drinkSize;
    private boolean orderDrink;
    private double drinkPrice;

    public Drink(int size, String bread, String sauce, String toasted, double sandwichPrice, String drinkSize, boolean orderDrink, double drinkPrice) {
        super(size, bread, sauce, toasted, sandwichPrice);
        this.drinkSize = drinkSize;
        this.orderDrink = orderDrink;
        this.drinkPrice = drinkPrice;
    }

    public Drink(){

    }

    public String getDrinkSize() {
        return drinkSize;
    }

    public void setDrinkSize(String drinkSize) {
        this.drinkSize = drinkSize;
    }

    public boolean isOrderDrink() {
        return orderDrink;
    }

    public void setOrderDrink(boolean orderDrink) {
        this.orderDrink = orderDrink;
    }

    public double getDrinkPrice() {
        return drinkPrice;
    }

    public void setDrinkPrice(double drinkPrice) {
        this.drinkPrice = drinkPrice;
    }
}
