package com.pluralsight.Objects;

import com.pluralsight.UI.OrderScreen;

import java.util.List;
import java.util.Scanner;

public class Drink extends Sandwich{
    private Double drinkSize;
    private boolean orderDrink;

    public Drink(int size, String bread, String sauce, double sandwichPrice) {
        super(size, bread, sauce, sandwichPrice);
    }


    public Double getDrinkSize() {
        return drinkSize;
    }

    public boolean isOrderDrink() {

        Scanner userInput = new Scanner(System.in);
        String Y = "";
        String N = "";
        double smallDrink = 2.00;
        double mediumDrink = 2.50;
        double largeDrink = 3.00;

        //ask the customer if needs a drink or not
        System.out.println("Do they want a drink?");
        System.out.println("Y for yes or N for no: ");
        String choice = userInput.next().toUpperCase().trim();
        // If needs a drink
        if (choice.equals(Y)){
            System.out.println("What size drink? ");
            System.out.println("1 for Small");
            System.out.println("2 for medium");
            System.out.println("3 for Large");
            System.out.println("Input: ");
            int choice2 = userInput.nextInt();

            switch (choice2){
                case 1:
                    //return smallDrink;
                case 2:
                    //return mediumDrink;
                case 3:
                    //return largeDrink;

            }


            //if doesn't need a drink
        } else if (choice.equals(N)) {

            return false;

        }
        return Boolean.parseBoolean(choice);
    }
}
