package com.pluralsight.Objects;
//added to topping so would just work right
public class Side extends Topping {
    String sideChoice;



    public Side(String sideChoice) {
        this.sideChoice = sideChoice;
    }

    public Side() {
    }

    @Override
    public String getName() {
        return sideChoice;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public void setPrice(double price) {

    }
}
