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



        String receiptOrder = "Files/receipt.txt";
        //Should write out everything ordered and print it into a text file
        try {
            FileWriter fileWriter = new FileWriter(receiptOrder);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            double totalPrice = 0;

            bufferedWriter.write("-------DELICIOUS SANDWICHES-------");
            bufferedWriter.newLine();
            //writes sandwich first
            bufferedWriter.write("Sandwich: "  + "Type of bread: "
            + "Type of sauce" );
            bufferedWriter.newLine();
            //writes what toppings there are next
            bufferedWriter.write("Toppings: ");
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
