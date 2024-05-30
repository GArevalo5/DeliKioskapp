package com.pluralsight.ReceiptOrder;


import com.pluralsight.Objects.*;

import java.util.ArrayList;
import java.util.List;

public class Order
{
    private ArrayList<Product> recieptOrder = new ArrayList<>();

   public void addProduct(Product product)
   {
        recieptOrder.add(product);
   }

   public List<Product> getItems()
   {
       return recieptOrder;
   }

}
