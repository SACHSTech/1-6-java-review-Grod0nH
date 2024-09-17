package gr11review.part1;
import java.io.*;
import java.text.DecimalFormat;

/**
 * 
 * A program that asks the user how many items he/she would like to purchase. 
 * The program then gets the prices for the items one by one. 
 * print out the total, the tax (13%) and the grand total.
 * 
 * @author: Gordon H.
 */

 public class Review4{
    public static void main(String[] args) throws IOException{

        // Initialze User Input and Formatting

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("0.00");

        // initialize variables 
        int intItems = 0;
        double dblPrice = 0.0;

        // Takes in how many items the user has
        System.out.print("How many items do you want to buy? ");
        intItems = Integer.parseInt(br.readLine());

        // Takes in all the prices of the items
        for (int i = 0; i < intItems; i++){
            System.out.print("Enter the price for item " + (i+1) + ": ");
            dblPrice += Double.parseDouble(br.readLine());   
        }

        // prints out the subtotal, tax, and final total
        System.out.println("Subtotal: $" + df.format(dblPrice));
        System.out.println("Tax: $" + df.format(dblPrice * 0.13));
        System.out.println("Total: $" + df.format(dblPrice + (dblPrice * 0.13)));
        
    }
}