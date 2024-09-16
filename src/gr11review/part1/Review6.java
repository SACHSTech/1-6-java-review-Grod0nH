package gr11review.part1;
import java.io.*;
import java.text.DecimalFormat;

/**
 * A program that prints the prompt of how many items you want to purchase
 * and stops to calculate the subtotal, tax, and total when you type 0
 * 
 * @author: G. Huang
 */

 public class Review6{
    public static void main(String[] args) throws IOException{

        // Initialize Format and User Input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("0.00");

        // Initlize Variable
        double dblPrice;
        double dblFinal = 0.0;

        // prints out the prompt until user types 0
        while(true){
            System.out.print("Enter the price for an item: ");

            dblPrice = Double.parseDouble(br.readLine());

            dblFinal += dblPrice;

            if (dblPrice == 0){
                break;
            }
        }

        // prints out the subtotal, tax, and total
        System.out.println("Subtotal: $" + df.format(dblFinal));
        System.out.println("Tax: $" + df.format(dblFinal * 0.13));
        System.out.println("Total: $" + df.format(dblFinal + (dblFinal * 0.13)));
    }
}

    
