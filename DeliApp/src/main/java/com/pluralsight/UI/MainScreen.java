package com.pluralsight.UI;

import java.util.Scanner;

public class MainScreen {

    public void mainScreenPage(){
        Scanner userInput = new Scanner(System.in);
        OrderScreen orderScreen = new OrderScreen();

        System.out.println("Delicious Sandwiches");
        System.out.println("-".repeat(40));
        System.out.println();
        System.out.println("Creating a order?");
        System.out.println("Press 1 to create a order");
        System.out.println("Press 2 to quit");
        System.out.println();
        System.out.print("Enter input: ");
        int choice = userInput.nextInt();
        System.out.println();

        try {

            switch (choice) {
                case 1:
                    orderScreen.orderScreenMenu();
                    break;

                case 2:
                    System.exit(0);

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
