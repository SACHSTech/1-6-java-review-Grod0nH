package gr11review.part1;
import java.io.*;
import java.math.*;
import java.util.*;

/**
 * A program that prints the prompt of how many items you want to purchase
 * and stops to calculate the subtotal, tax, and total when you type 0
 * 
 * @author: G. Huang
 */

 public class Review8{
    public static void main(String[] args) throws IOException{

        int intJackpot = 0;
        int intSlot1;
        int intSlot2;
        int intSlot3;
        Random rand = new Random();


        for (int i = 0; i < 1000; i++){

            intSlot1 = rand.nextInt(9);
            intSlot2 = rand.nextInt(9);
            intSlot3 = rand.nextInt(9);

            System.out.println(intSlot1 + " + " +intSlot2+ " + " + intSlot3);

            if (intSlot1 == intSlot2 && intSlot2 == intSlot3) {
                intJackpot++;
            }

        }

        System.out.println(intJackpot);
    }
}

    
