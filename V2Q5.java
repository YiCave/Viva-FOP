/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva2wed;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class V2Q5 {
    
    public static void main(String[] args) {
            
 
    Scanner in = new Scanner(System.in);
    String[] fruits = {"Apple", "Crape", "Banana", "Mango", "Orange", "Strawberry", "Blueberry"};
    int[] storage = {45, 57, 75, 34, 75, 65, 78};
    double[] price = {5.00, 10.00, 2.50, 6.00, 3.00, 15.00, 12.00};

    printFruit(fruits); // Print available fruits
    System.out.print("Please enter the fruit you want to buy: ");
    String fruitselect = in.nextLine(); // Fix: Use nextLine() for String input
    System.out.print("Unit or Box: ");
    int quantity = in.nextInt();

    int fruitIdx = getIdxFruit(fruits, fruitselect); // Get index of selected fruit
    if (!haveProduct(fruits, fruitIdx)) {
        System.out.println("Sorry, we currently do not offer this product.");
    } else if (!haveStock(fruitIdx, storage, quantity)) {
        System.out.println("Sorry, we do not have enough stock for " + fruits[fruitIdx] + ". Please come again later!");
    } else {
        System.out.println("\nKindly Checkout here: ");
        generateBill(fruits, fruitIdx, price, quantity); // Generate bill for the purchase
    }
}
    public static void printFruit(String[]fruits){
        System.out.println("Fresh Mart Fruit Selection");
        int counter=1;
        for(String fruit:fruits){
            System.out.println(counter+". "+fruit);
            counter++;
        }
    }
    
    public static int getIdxFruit(String[]fruits,String selectedFruit){
      
        for(int i=0;i<fruits.length;i++){
            if(fruits[i].equalsIgnoreCase(selectedFruit)){
                return i;
            }
        }
        return -1;
    }
    
    public static boolean haveProduct(String[]fruits,int fruitidx){
        return fruitidx>=0;
    }
    
    public static boolean haveStock(int fruitidx,int[]storage,int quantity){
        return storage[fruitidx]>=quantity;
    }
    
    public static void generateBill(String[]fruits,int fruitidx,double[]price,int quantity){
       
        System.out.println("---------Fresh Mart Receipt---------");
        System.out.println("Product\t\tQuantity\tPrice Per Unit(RM)");
        System.out.println(fruits[fruitidx]+"\t\t"+quantity+"\t"+price[fruitidx]);
        System.out.println("------------------------------------");
        double total=quantity*price[fruitidx];
        System.out.println("Total Price:RM"+total);
    }
    
    
    
    }

