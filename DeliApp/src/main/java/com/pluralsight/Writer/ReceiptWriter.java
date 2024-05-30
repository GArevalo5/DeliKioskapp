package com.pluralsight.Writer;

import com.pluralsight.Objects.Sandwich;
import com.pluralsight.Objects.Topping;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.time.LocalDateTime;
import java.util.Scanner;

public class ReceiptWriter {

    //Will write the receipt
    public void customerReceipt() {


        String receiptOrder = "Files/receipt.txt";
        //Should write out everything ordered and print it into a text file
        try {
            FileWriter fileWriter = new FileWriter(receiptOrder);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            double totalPrice = 0;

            bufferedWriter.write("-------DELICIOUS SANDWICHES-------");
            bufferedWriter.newLine();
            bufferedWriter.write(String.valueOf(LocalDateTime.now()));
            bufferedWriter.newLine();
            //writes sandwich first
            bufferedWriter.write("Sandwich: ");
            bufferedWriter.newLine();
            bufferedWriter.write("Type of bread: ");
            bufferedWriter.newLine();
            //writes what toppings there are next
            bufferedWriter.write("Toppings: ");
            bufferedWriter.newLine();
            bufferedWriter.write("Type of sauce: ");
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
            bufferedWriter.write("-".repeat(50));
            bufferedWriter.write("Total price: " + totalPrice);
            bufferedWriter.newLine();
            bufferedWriter.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
