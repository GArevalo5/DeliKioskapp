package com.pluralsight.UI;

import com.pluralsight.ListOfOrder.Order;
import com.pluralsight.Objects.Chips;
import com.pluralsight.Objects.Drink;
import com.pluralsight.Objects.Sandwich;
import com.pluralsight.Writer.ReceiptWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderScreen {

    public void orderScreenMenu(){
        Scanner userInput = new Scanner(System.in);
        MainScreen mainScreen = new MainScreen();

    System.out.println("Choose your order from the options below");
    System.out.println("-".repeat(50));
    System.out.println("1) Add sandwich");
    System.out.println("2) Add drink");
    System.out.println("3) Add chips");
    System.out.println("4) check out");
    System.out.println("5) Cancel order");
    System.out.println();
    System.out.print("Enter input: ");
    int choice = userInput.nextInt();
        System.out.println();

        try {

            switch (choice) {
                case 1:
                    addSandwich();
                    break;
                case 2:
                    addDrink();
                    break;
                case 3:
                    addChips();
                    break;
                case 4:
                    checkOut();
                    break;
                case 5:
                    cancelOrder();
                    System.out.println("Order canceled!");
                    System.out.println("-".repeat(50));
                    mainScreen.mainScreenPage();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

public void addSandwich(){
        Scanner userInput = new Scanner(System.in);

    List<Sandwich>sandwichOrder = new ArrayList<>();
    Order orderList = new Order();


    Sandwich sandwich = new Sandwich();
    System.out.println();
    //ask for sandwich size
    System.out.println("Select sandwich size from following options:");
    System.out.println("1) 4 inch");
    System.out.println("2) 8 inch");
    System.out.println("3) 12 inch");
    System.out.println("4) Main Screen");
    System.out.println();
    System.out.println("Input:");
    int sandwichSize = userInput.nextInt();
        //choices for size of sandwich
        switch (sandwichSize) {
            case 1:
                System.out.println("4 inch added!");
                sandwich.setSize(4);
                break;
            case 2:
                System.out.println("8 inch added!");
                sandwich.setSize(8);
                break;
            case 3:
                System.out.println("12 inch added!");
                sandwich.setSize(12);
            case 4:
                orderScreenMenu();
        }

    //ask for type of bread and add it
    System.out.println("Select what type of bread from the following options:");
    System.out.println();
    System.out.println("1) White");
    System.out.println("2) Wheat");
    System.out.println("3) Rye");
    System.out.println("4) Wrap");
    System.out.println("5) return to main screen ");
    System.out.println("Input: ");
    int breadChoice = userInput.nextInt();
    //types of bread choices
    switch (breadChoice){
        case 1:
            System.out.println("White bread selected");
            sandwich.setBread("White");
        case 2:
            System.out.println("Wheat bread added");
            sandwich.setBread("Wheat");
        case 3:
            System.out.println("Rye bread added");
            sandwich.setBread("Rye");
        case 4:
            System.out.println("Wrap bread added");
            sandwich.setBread("Wrap");
        case 5:
            orderScreenMenu();
    }

    //ask for toppings
    System.out.println("Choose meat toppings from the following options  ");

    System.out.println("1) Steak");
    System.out.println("2) Ham");
    System.out.println("3) Salami");
    System.out.println("4) Roast beef");
    System.out.println("5) Chicken");
    System.out.println("6) Bacon");
    System.out.println("7) none");
    System.out.println("8) Main menu");
    int meatTopping = userInput.nextInt();

    //meat choices
    switch (meatTopping){
        case 1:
            System.out.println("Steak selected");
        case 2:
            System.out.println("Ham selected");
        case 3:
            System.out.println("salami selected");
        case 4:
            System.out.println("Roast beef selected");
        case 5:
            System.out.println("Chicken selected");
        case 6:
            System.out.println("Bacon selected");
        case 7:
            if (userInput.nextInt() == 7){
            }
        case 8:
            orderScreenMenu();
    }
    System.out.println("Would you like to add another meet topping? ");
    System.out.println("Enter Y or N");

    //cheese
    System.out.println("Choose a cheese topping from the following options");
    System.out.println("1) American");
    System.out.println("2) provolone");
    System.out.println("3) Cheddar");
    System.out.println("4) Swiss");
    System.out.println("5) Main menu");
    System.out.println("Input: ");
    int cheeseChoice = userInput.nextInt();
    switch (cheeseChoice){
        case 1:
            System.out.println("American selected");
        case 2:
            System.out.println("Provolone selected");
        case 3:
            System.out.println("Cheddar selected");
        case 4:
            System.out.println("Swiss selected");
        case 5:
            orderScreenMenu();
    }
    System.out.println("Would you like to add any other toppings");
    System.out.println("Hit Y or N");
    //other toppings
//    while(true)
//    {
//        // create new topping
//        //add it to the sandwich
//    }

    //sauces

    //if they want it toasted

    //record onto receipt
    //sandwichOrder.add(sandwich);

}

public void addDrink(){
    Drink drink = new Drink();
    Scanner userInput = new Scanner(System.in);
    String Y = "";
    String N = "";
    //ask the customer if needs a drink or not
    System.out.println("Do they want a drink?");
    System.out.println("Y for yes or N for no: ");
    String choice = userInput.next().toUpperCase().trim();
    // If needs a drink
    if (choice.equals(Y)){
        System.out.println("What size drink? ");
        System.out.println("1) for Small");
        System.out.println("2) for medium");
        System.out.println("3) for Large");
        System.out.println("4) Main Menu");
        System.out.println("Input: ");
        int drinkChoice = userInput.nextInt();

        switch (drinkChoice){
            case 1:
                //return smallDrink;
                System.out.println("Small drink Added!");
                drink.setDrinkSize("Small drink");
                drink.setDrinkPrice(2.00);
            case 2:
                //return mediumDrink;
                System.out.println("Medium drink added!");
                drink.setDrinkSize("Medium drink");
                drink.setDrinkPrice(2.50);
            case 3:
                //return largeDrink;
                System.out.println("Large drink added!");
                drink.setDrinkSize("Large Drink");
                drink.setDrinkPrice(3.00);
            case 4:
                orderScreenMenu();
        }

        //if doesn't need a drink
    } if (choice.equals(N)) {

       orderScreenMenu();
    }
}

public void addChips(){
    Chips chips = new Chips();
        Scanner userInput = new Scanner(System.in);

    System.out.println("Enter Y or N if adding chips");
    String Y = "";
    String N = "";
    String yesOrNo = userInput.nextLine().toUpperCase().trim();
    if (yesOrNo.equals(Y)){
        chips.setPrice(1.50);
    }if (yesOrNo.equals(N)){
        orderScreenMenu();
    }
}

public void checkOut(){
    ReceiptWriter receiptWriter = new ReceiptWriter();

    receiptWriter.customerReceipt();
    System.out.println("Receipt printed");
    System.out.println("Returning to main screen");

}

public void cancelOrder(){
        MainScreen mainScreen = new MainScreen();
    System.out.println("-".repeat(50));
    System.out.println("Canceling order and heading back to Home Screen!");
    System.out.println("-".repeat(50));
    System.out.println();
    mainScreen.mainScreenPage();
}


}
