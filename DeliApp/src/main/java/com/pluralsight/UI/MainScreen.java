package com.pluralsight.UI;

import java.util.Scanner;

public class MainScreen {
    OrderScreen orderScreen = new OrderScreen();

    public void mainScreenPage(){
        Scanner userInput = new Scanner(System.in);
        int choice = 0;

        System.out.println("Delicious Sandwiches");
        System.out.println("-".repeat(40));
        System.out.println();
        System.out.println("Creating a order?");
        System.out.println("Press 1 to create a order");
        System.out.println("Press 2 to quit");
        System.out.println();
        System.out.print("Enter input: ");
        userInput.nextInt();

        switch (choice){
            case 1:
                orderScreen.orderScreenMenu();
                break;

            case 2:
                System.exit(0);

        }

    }
}
