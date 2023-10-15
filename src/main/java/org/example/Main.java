package org.example;

public class Main {
    public static void main(String[] args) {
       Inventory<FoodItem> foodInventory = new Inventory<>();

       FoodItem foodItem = new FoodItem(01,"Banana", 45);
       try {
           foodInventory.removeItem(foodItem);
       } catch (ItemNotFoundException e){

           System.out.println("Sorry, "+ e.getMessage());
       }
      try {
          foodInventory.addItem(foodItem);

          foodInventory.removeItem(foodItem);
      } catch (ItemNotFoundException e) {
          throw new RuntimeException(e);
      }

    }
}