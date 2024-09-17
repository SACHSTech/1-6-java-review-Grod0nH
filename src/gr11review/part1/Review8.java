package gr11review.part1;
import java.io.*;
import java.math.*;
import java.util.*;

/**
 * A program that prints out 100 lines of 3 numbers per row of random numbers
 * then it counts where all 3 numbers are equal and prints out the result
 * 
 * @author: Gordon Huang
 */

 public class Review8{
    public static void main(String[] args) throws IOException{

        // Initialize Variables
        int intJackpot = 0;
        int intSlot1;
        int intSlot2;
        int intSlot3;
        Random rand = new Random();


        // Prints out 1000 rows and keeps count of triples
        for (int i = 0; i < 1000; i++){

            intSlot1 = rand.nextInt(9);
            intSlot2 = rand.nextInt(9);
            intSlot3 = rand.nextInt(9);

            System.out.println(intSlot1 + " " +intSlot2+ " " + intSlot3);

            if (intSlot1 == intSlot2 && intSlot2 == intSlot3) {
                intJackpot++;
            }

        }

        // Output
        System.out.println(intJackpot);
    }
}

    
