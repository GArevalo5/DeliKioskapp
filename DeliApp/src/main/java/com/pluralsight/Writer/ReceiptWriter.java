package com.pluralsight.Writer;
import com.pluralsight.Objects.*;
import com.pluralsight.ReceiptOrder.Order;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ReceiptWriter {

    //Will write the receipt
    public void customerReceipt(Order order) {
        String formattedDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HHmmss"));;
        double totalPrice = 0;


        //Should write out everything ordered and print it into a text file
        try {
            String receiptOrder = "Files/receipt_"+ formattedDate + ".txt";
            FileWriter fileWriter = new FileWriter(receiptOrder);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("-------DELICIOUS SANDWICHES-------");
            bufferedWriter.newLine();
            bufferedWriter.write(String.valueOf(LocalDate.now()));
            bufferedWriter.newLine();
            bufferedWriter.write(String.valueOf(LocalTime.now()));
            bufferedWriter.newLine();
            for(Product product : order.getItems()) {
                if(product instanceof Sandwich)
                {
                    Sandwich sandwich = (Sandwich)product;
                    List<Topping> toppings = sandwich.getToppings();
                    bufferedWriter.write("Sandwich order: ");
                    bufferedWriter.write(" " + sandwich.getBread());
                    bufferedWriter.newLine();
                    bufferedWriter.write("Size: "+ sandwich.getSize());
                    bufferedWriter.newLine();
                    bufferedWriter.write("Sauce: " + sandwich.getSauce());
                    bufferedWriter.newLine();
                    bufferedWriter.write("Is " + sandwich.getToasted());
                    bufferedWriter.newLine();
                    bufferedWriter.write("Sandwich price: $ " + sandwich.getSandwichPrice());
                    bufferedWriter.newLine();
                    totalPrice += sandwich.getSandwichPrice();
                    bufferedWriter.write("Toppings: ");

                    for(Topping topping: toppings)
                    {
                        if (topping instanceof Meat){
                        Meat meat = (Meat)topping;
                        bufferedWriter.write(meat.getName() + " $ " + meat.getPrice());
                        bufferedWriter.newLine();
                        totalPrice += meat.getPrice();
                    }
                        if (topping instanceof Cheese){
                            Cheese cheese = (Cheese)topping;
                            bufferedWriter.write(cheese.getName() + " $ " + cheese.getPrice());
                            bufferedWriter.newLine();
                            totalPrice += cheese.getPrice();
                        }
                        if (topping instanceof Veggies){
                            Veggies veggies = (Veggies)topping;
                            bufferedWriter.write(veggies.getName());
                            bufferedWriter.newLine();
                        }
                        if (topping instanceof Side){
                            Side side = (Side)topping;
                            bufferedWriter.write("Side: " + side.getName());
                            bufferedWriter.newLine();
                        }
                    }
                }
                if (product instanceof Drink)
                {
                    Drink drink = (Drink)product;

                    bufferedWriter.newLine();
                    bufferedWriter.write("Drink size:" + drink.getSize() + "  $ " + drink.getPrice());
                    totalPrice += drink.getPrice();

                }
                if (product instanceof Chips)
                {
                    Chips chips = (Chips)product;
                    bufferedWriter.newLine();
                    bufferedWriter.write("Chips price: $ " + chips.getPrice());
                    bufferedWriter.newLine();
                    totalPrice += chips.getPrice();
                }
            }
            bufferedWriter.write("-".repeat(50));
            bufferedWriter.newLine();
            bufferedWriter.write("Total: $ " + totalPrice);
            bufferedWriter.newLine();
            bufferedWriter.write("-".repeat(50));
            bufferedWriter.newLine();
            bufferedWriter.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
