package com.pluralsight.Writer;

import com.pluralsight.Objects.Sandwich;
import com.pluralsight.Objects.Topping;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;

public class ReceiptWriter {

    //Will write the receipt
public void customerReceipt(){
    Scanner userInput = new Scanner(System.in);

        Sandwich testSandwich = new Sandwich(4,"Wheat","Mayo",5.50);
        Topping bacon = new Topping("Bacon",1.00,false,false);
        Topping ham = new Topping("Ham", 1.00,false,false);

        Sandwich.add(bacon);
        Sandwich.add(ham);



        String receiptOrder = "receipt.txt";
        //Should write out everything ordered and print it into a text file
        try {
            FileWriter fileWriter = new FileWriter(receiptOrder);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            double totalPrice = testSandwich.getSandwichPrice() + bacon.getPrice() + ham.getPrice();

            bufferedWriter.write("-------DELICIOUS SANDWICHES-------");
            bufferedWriter.newLine();
            //writes sandwich first
            bufferedWriter.write("Sandwich: " + testSandwich.getSize() + "Type of bread: " + testSandwich.getBread()
            + "Type of sauce" + testSandwich.getSauce());
            bufferedWriter.newLine();
            //writes what toppings there are next
            bufferedWriter.write("Toppings: " + bacon.getName()+ ham.getName());
            bufferedWriter.newLine();
            //prints side
            bufferedWriter.write("side: ");
            bufferedWriter.newLine();
            //add chips if there is any
            bufferedWriter.write("Chips: ");
            bufferedWriter.newLine();
            //adds drink if there is any
            bufferedWriter.write("Drink: ");
            bufferedWriter.newLine();
            //adds total from the order
            bufferedWriter.write("Total price: " + totalPrice);
            bufferedWriter.newLine();
            bufferedWriter.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
