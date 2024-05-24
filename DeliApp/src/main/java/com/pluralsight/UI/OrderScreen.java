package com.pluralsight.UI;

import java.util.Scanner;

public class OrderScreen {
Scanner userInput = new Scanner(System.in);
MainScreen mainScreen = new MainScreen();

    public void orderScreenMenu(){
        int choice = 0;


    System.out.println("Choose your order from the options below");
    System.out.println("-".repeat(50));
    System.out.println("1) Add sandwich");
    System.out.println("2) Add drink");
    System.out.println("3) Add chips");
    System.out.println("4) check out");
    System.out.println("5) Cancel order");
    System.out.println();
    System.out.print("Enter input: ");
    userInput.nextInt();

        switch (choice){
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
            mainScreen.mainScreenPage();
    }
}

public void addSandwich(){
    System.out.println("Still in progress");
}

public void addDrink(){
    System.out.println("Still in progress");
}

public void addChips(){
    System.out.println("Still in progress");
}

public void checkOut(){
    System.out.println("Still in progress");
}

public void cancelOrder(){
    System.out.println("Still in progress");
}


}
