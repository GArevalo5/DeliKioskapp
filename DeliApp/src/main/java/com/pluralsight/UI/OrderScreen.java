package com.pluralsight.UI;

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
                sandwichOrder.add(sandwichSize);
                break;
            case 2:
                System.out.println("8 inch added!");
                sandwichOrder.add(sandwichSize);
                break;
            case 3:
                System.out.println("12 inch added!");
                sandwichOrder.add(sandwichSize);
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
            sandwichOrder.add(breadChoice);
        case 2:
            System.out.println("Wheat bread added");
            sandwichOrder.add(breadChoice);
        case 3:
            System.out.println("Rye bread added");
            sandwichOrder.add(breadChoice);
        case 4:
            System.out.println("Wrap bread added");
            sandwichOrder.add(breadChoice);
        case 5:
            orderScreenMenu();
    }

    //ask for toppings
    System.out.println("What toppings from the following options ");

    //meat

    //cheese

    //other toppings

    //sauces

    //if they want it toasted

    //record onto receipt

}

public void addDrink(){
    System.out.println("Still in progress");
}

public void addChips(){
    System.out.println("Still in progress");
}

public void checkOut(){
    ReceiptWriter receiptWriter = new ReceiptWriter();
    receiptWriter.customerReceipt();
    System.out.println("Receipt printed");
    System.out.println("Returning to main screen");

}

public void cancelOrder(){
    System.out.println("Still in progress");
}


}
