package gr11review.part1;
import java.io.*;
import java.text.DecimalFormat;

/**
 * A program that gives the user options to input the yearly invested amount, compound interest rate, and the target amount
 * then the program will calculate and output the amount of years it takes to reach the target amount
 * 
 * @author: Gordon H.
 */

 public class Review5{
    public static void main(String[] args) throws IOException{

         // Initialze User Input and Adding Decimal Formatting
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Initializing Used Variables
        int intYearlyAmount;
        double dblInterest;
        int intTarget;
        double dblFinal = 0.0;
        int intYear = 0;

        // 
        System.out.print("Enter the yearly invested amount: ");
        intYearlyAmount = Integer.parseInt(br.readLine());
        System.out.print("Enter the compound interest rate: ");
        dblInterest = Double.parseDouble(br.readLine());
        System.out.print("Enter the target amount: ");
        intTarget = Integer.parseInt(br.readLine());

        dblFinal = 0;

        while(dblFinal < intTarget){

            dblFinal+= intYearlyAmount;
            dblFinal += ((dblInterest/100) * dblFinal);
            intYear +=1;
            
        }

        System.out.println("The target amount will be earned in " + intYear + " years.");
        


        
    }
}