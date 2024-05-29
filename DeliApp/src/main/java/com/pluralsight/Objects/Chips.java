package com.pluralsight.Objects;

import java.util.List;

public class Chips extends Sandwich {
    private boolean chips;

    public Chips(int size, String bread, String sauce, double sandwichPrice) {
        super(size, bread, sauce, sandwichPrice);
    }


    public boolean isChips() {
        return chips;
    }
}
