package com.pluralsight.UI;
import com.pluralsight.Objects.*;
import com.pluralsight.ReceiptOrder.Order;
import com.pluralsight.Writer.ReceiptWriter;
import java.util.Scanner;

public class OrderScreen {

    Order order = new Order();

    public void orderScreenMenu() {
        Scanner userInput = new Scanner(System.in);
        MainScreen mainScreen = new MainScreen();
        int choice = 6;
        while (choice !=5){

            System.out.println("Choose your order from the options below");
            System.out.println("-".repeat(50));
            System.out.println("1) Add sandwich");
            System.out.println("2) Add drink");
            System.out.println("3) Add chips");
            System.out.println("4) check out");
            System.out.println("5) Cancel order");
            System.out.println();
            System.out.print("Enter input: ");
            choice = userInput.nextInt();
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
    }

    public void addSandwich() {
        Scanner userInput = new Scanner(System.in);

        Sandwich sandwich = new Sandwich();
        Cheese cheese = new Cheese();
        Meat meat = new Meat();
        Veggies veggies = new Veggies();
        Side side = new Side();

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
        try {
            switch (sandwichSize) {
                case 1:
                    System.out.println("4 inch added!");
                    sandwich.setSize(4);
                    sandwich.getSandwichPrice();

                    break;
                case 2:
                    System.out.println("8 inch added!");
                    sandwich.setSize(8);
                    sandwich.getSandwichPrice();
                    break;
                case 3:
                    System.out.println("12 inch added!");
                    sandwich.setSize(12);
                    sandwich.getSandwichPrice();
                    break;
                case 4:
                    orderScreenMenu();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
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
        try {
            switch (breadChoice) {
                case 1:
                    System.out.println("White bread selected");
                    sandwich.setBread("White");
                    break;
                case 2:
                    System.out.println("Wheat bread added");
                    sandwich.setBread("Wheat");
                    break;
                case 3:
                    System.out.println("Rye bread added");
                    sandwich.setBread("Rye");
                    break;
                case 4:
                    System.out.println("Wrap bread added");
                    sandwich.setBread("Wrap");
                    break;
                case 5:
                    orderScreenMenu();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
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
        try {
            switch (meatTopping) {
                case 1:
                    System.out.println("Steak selected");
                    meat.setName("Steak");
                    if (sandwich.getSize() == 4) {
                        meat.setPrice(1.00);
                    }
                    if (sandwich.getSize() == 8) {
                        meat.setPrice(2.00);
                    }
                    if (sandwich.getSize() == 12) {
                        meat.setPrice(3.00);
                    }
                    break;
                case 2:
                    System.out.println("Ham selected");
                    meat.setName("Ham");
                    if (sandwich.getSize() == 4) {
                        meat.setPrice(1.00);
                    }
                    if (sandwich.getSize() == 8) {
                        meat.setPrice(2.00);
                    }
                    if (sandwich.getSize() == 12) {
                        meat.setPrice(3.00);
                    }
                    break;
                case 3:
                    System.out.println("salami selected");
                    meat.setName("Salami");
                    if (sandwich.getSize() == 4) {
                        meat.setPrice(1.00);
                    }
                    if (sandwich.getSize() == 8) {
                        meat.setPrice(2.00);
                    }
                    if (sandwich.getSize() == 12) {
                        meat.setPrice(3.00);
                    }
                    break;
                case 4:
                    System.out.println("Roast beef selected");
                    meat.setName("Roast beef");
                    if (sandwich.getSize() == 4) {
                        meat.setPrice(1.00);
                    }
                    if (sandwich.getSize() == 8) {
                        meat.setPrice(2.00);
                    }
                    if (sandwich.getSize() == 12) {
                        meat.setPrice(3.00);
                    }
                    break;
                case 5:
                    System.out.println("Chicken selected");
                    meat.setName("Chicken");
                    if (sandwich.getSize() == 4) {
                        meat.setPrice(1.00);
                    }
                    if (sandwich.getSize() == 8) {
                        meat.setPrice(2.00);
                    }
                    if (sandwich.getSize() == 12) {
                        meat.setPrice(3.00);
                    }
                    break;
                case 6:
                    System.out.println("Bacon selected");
                    meat.setName("Bacon");
                    if (sandwich.getSize() == 4) {
                        meat.setPrice(1.00);
                    }
                    if (sandwich.getSize() == 8) {
                        meat.setPrice(2.00);
                    }
                    if (sandwich.getSize() == 12) {
                        meat.setPrice(3.00);
                    }
                    break;
                case 7:
                    System.out.println("N/A");
                    meat.setName("N/A");
                    meat.setPrice(0);
                    break;
                case 8:
                    orderScreenMenu();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //cheese
        System.out.println("Choose a cheese topping from the following options");
        System.out.println("1) American");
        System.out.println("2) provolone");
        System.out.println("3) Cheddar");
        System.out.println("4) Swiss");
        System.out.println("5) None");
        System.out.println("6) Main menu");
        System.out.println("Input: ");
        int cheeseChoice = userInput.nextInt();
        try {
            switch (cheeseChoice) {
                case 1:
                    System.out.println("American selected");
                    cheese.setName("American");
                    if (sandwich.getSize() == 4) {
                        cheese.setPrice(.75);
                    }
                    if (sandwich.getSize() == 8) {
                        cheese.setPrice(1.50);
                    }
                    if (sandwich.getSize() == 12) {
                        cheese.setPrice(3.00);
                    }
                    break;
                case 2:
                    System.out.println("Provolone selected");
                    cheese.setName("Provolone");
                    if (sandwich.getSize() == 4) {
                        cheese.setPrice(.75);
                    }
                    if (sandwich.getSize() == 8) {
                        cheese.setPrice(1.50);
                    }
                    if (sandwich.getSize() == 12) {
                        cheese.setPrice(3.00);
                    }
                    break;
                case 3:
                    System.out.println("Cheddar selected");
                    cheese.setName("Cheddar");
                    if (sandwich.getSize() == 4) {
                        cheese.setPrice(.75);
                    }
                    if (sandwich.getSize() == 8) {
                        cheese.setPrice(1.50);
                    }
                    if (sandwich.getSize() == 12) {
                        cheese.setPrice(3.00);
                    }
                    break;
                case 4:
                    System.out.println("Swiss selected");
                    cheese.setName("Swiss");
                    if (sandwich.getSize() == 4) {
                        cheese.setPrice(.75);
                    }
                    if (sandwich.getSize() == 8) {
                        cheese.setPrice(1.50);
                    }
                    if (sandwich.getSize() == 12) {
                        cheese.setPrice(3.00);
                    }
                    break;
                case 5:
                    System.out.println("N/A");
                    cheese.setName("N/A");
                    cheese.setPrice(0);
                    break;
                case 6:
                    orderScreenMenu();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //other toppings
        System.out.println("Choose the toppings from the following options  ");
        System.out.println("1) Lettuce");
        System.out.println("2) Peppers");
        System.out.println("3) Onions");
        System.out.println("4) Tomatoes");
        System.out.println("5) Jalapenos");
        System.out.println("6) Cucumbers");
        System.out.println("7) Pickles");
        System.out.println("8) Guacamole");
        System.out.println("9) Mushrooms");
        System.out.println("10) None");
        System.out.println("0) Main menu");
        int veggieTopping = userInput.nextInt();

        //other choices
        try {
            switch (veggieTopping) {
                case 1:
                    System.out.println("Lettuce selected");
                    veggies.setName("Lettuce");
                    veggies.setPrice(0);
                    break;
                case 2:
                    System.out.println("Peppers selected");
                    veggies.setName("Peppers");
                    veggies.setPrice(0);
                    break;
                case 3:
                    System.out.println("Onions selected");
                    veggies.setName("Onions");
                    veggies.setPrice(0);
                    break;
                case 4:
                    System.out.println("Tomatoes selected");
                    veggies.setName("Tomatoes");
                    veggies.setPrice(0);
                    break;
                case 5:
                    System.out.println("Jalapenos selected");
                    veggies.setName("Jalapenos");
                    veggies.setPrice(0);
                    break;
                case 6:
                    System.out.println("Cucumbers selected");
                    veggies.setName("Cucumbers");
                    veggies.setPrice(0);
                    break;
                case 7:
                    System.out.println("Pickles selected");
                    veggies.setName("Pickles");
                    veggies.setPrice(0);
                    break;
                case 8:
                    System.out.println("Guacamole selected");
                    veggies.setName("Guacamole");
                    veggies.setPrice(0);
                    break;
                case 9:
                    System.out.println("Mushrooms selected");
                    veggies.setName("Mushrooms");
                    veggies.setPrice(0);
                    break;
                case 10:
                    System.out.println("N/A");
                    veggies.setName("N/A");
                    veggies.setPrice(0);
                    break;
                case 0:
                    orderScreenMenu();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //sauces
        System.out.println("Select a sauce from the following options:");
        System.out.println();
        System.out.println("1) Mayo");
        System.out.println("2) Mustard");
        System.out.println("3) ketchup");
        System.out.println("4) ranch");
        System.out.println("5) thousand islands");
        System.out.println("6) vinaigrette");
        System.out.println("7) none");
        System.out.println("8) main menu");
        System.out.println("Input: ");
        int sauceChoice = userInput.nextInt();
        //types of bread choices
        try {

            switch (sauceChoice) {
                case 1:
                    System.out.println("Mayo selected");
                    sandwich.setSauce("Mayo");
                    break;
                case 2:
                    System.out.println("Mustard added");
                    sandwich.setSauce("Mustard");
                    break;
                case 3:
                    System.out.println("Ketchup added");
                    sandwich.setSauce("Ketchup");
                    break;
                case 4:
                    System.out.println("Ranch added");
                    sandwich.setSauce("Ranch");
                    break;
                case 5:
                    System.out.println("Thousand islands added");
                    sandwich.setSauce("Thousand islands");
                    break;
                case 6:
                    System.out.println("Vinaigrette added");
                    sandwich.setSauce("Vinaigrette");
                    break;
                case 7:
                    System.out.println("N/A added");
                    sandwich.setSauce("N/A");
                    break;
                case 8:
                    orderScreenMenu();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //if they want it toasted
        System.out.println("Does it need to be toasted?");
        System.out.println("Press 1 for yes or 2 for no");
        int yesOrNo = userInput.nextInt();
        try {

            switch (yesOrNo) {
                case 1:
                    System.out.println("Set to toasted");
                    sandwich.setToasted("Toasted");
                    break;
                case 2:
                    System.out.println("Set to not be toasted");
                    sandwich.setToasted("Not toasted");
                    break;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //side
        System.out.println("Choose a side from the options below");
        System.out.println("1) Au jus");
        System.out.println("2) sauce");
        System.out.println("3) No side");
        int sideChoice = userInput.nextInt();
        try {

            switch (sideChoice) {
                case 1:
                    System.out.println("Au jus added!");
                    side.setName("Au jus");
                    side.setPrice(0);
                    break;
                case 2:
                    System.out.println("Sauce added");
                    side.setName("Sauce");
                    side.setPrice(0);
                    break;
                case 3:
                    System.out.println("N/A");
                    side.setName("N/A");
                    side.setPrice(0);
                    break;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        sandwich.add(meat);
        sandwich.add(cheese);
        sandwich.add(veggies);
        sandwich.add(side);
        // Add order to Array to be written
        order.addProduct(sandwich);

    }

    public void addDrink() {
        Drink drink = new Drink();
        Scanner userInput = new Scanner(System.in);

            System.out.println("What size drink? ");
            System.out.println("1) for Small");
            System.out.println("2) for medium");
            System.out.println("3) for Large");
            System.out.println("4) Main Menu");
            System.out.println("Input: ");
            int drinkChoice = userInput.nextInt();
            try {
                switch (drinkChoice) {
                    case 1:
                        //return smallDrink;
                        System.out.println("Small drink Added!");
                        drink.setDrinkSize("Small drink");
                        drink.setDrinkPrice(2.00);
                        order.addProduct(drink);
                        break;
                    case 2:
                        //return mediumDrink;
                        System.out.println("Medium drink added!");
                        drink.setDrinkSize("Medium drink");
                        drink.setDrinkPrice(2.50);
                        order.addProduct(drink);
                        break;
                    case 3:
                        //return largeDrink;
                        System.out.println("Large drink added!");
                        drink.setDrinkSize("Large Drink");
                        drink.setDrinkPrice(3.00);
                        order.addProduct(drink);
                        break;
                    case 4:
                        orderScreenMenu();
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
    }

    public void addChips() {
        Chips chips = new Chips();
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter 1 for yes or 2 for no if adding chips");

        int yesOrNo = userInput.nextInt();
        if (yesOrNo == 1) {
            System.out.println("Chips added!");
            chips.setPrice(1.50);
            order.addProduct(chips);
        }
        if (yesOrNo == 2) {
            orderScreenMenu();
        }
    }

    public void checkOut() {
        ReceiptWriter receiptWriter = new ReceiptWriter();

        receiptWriter.customerReceipt(order);
        System.out.println("Receipt printed");
        System.out.println("Returning to main screen");

    }

    public void cancelOrder() {
        MainScreen mainScreen = new MainScreen();
        System.out.println("-".repeat(50));
        System.out.println("Canceling order and heading back to Home Screen!");
        System.out.println("-".repeat(50));
        System.out.println();
        mainScreen.mainScreenPage();
    }


}
