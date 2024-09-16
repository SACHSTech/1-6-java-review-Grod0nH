package gr11review.part1;
import java.io.*;

/**
 * A program that prints the odd numbers from 20 to 100 and prints the numbers from 29 to 2
 * 
 * @author: G. Huang
 */

 public class Review3{
    public static void main(String[] args) throws IOException{

        // prints all odd numbers from 20 to 100
        for (int i = 20; i < 101; i++){
            if (i % 2 == 1){
                System.out.println(i);
            }
        }

        // Adds the space
        System.out.println("");

        // Prints out all the numbers until 2 inclusive from 29
        for (int i = 29; i > 1; i--){
           System.out.println(i); 
        }
    }
}