package gr11review.part1;
import java.io.*;
import java.text.DecimalFormat;

/**
 * A program that prints the prompt of how many items you want to purchase
 * and stops to calculate the subtotal, tax, and total when you type 0
 * 
 * @author: G. Huang
 */

 public class Review7{
    public static void main(String[] args) throws IOException{

        // Initialize Format and User Input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String strInput;
        int intChars;
        int intSpaces = 0;
        int intLetters = 0;
        String strDash = "";
        

        // Gets the User Input
        strInput = (br.readLine());

        for (int i = 0; i < strInput.length(); i++){
            if (strInput.charAt(i) == 'a'){
                intLetters += 1;
            }
            if (strInput.charAt(i) == ' '){
                intSpaces+= 1; 
            }
            if (i % 2 == 0){
                strDash += "-";
            }
        }


        intChars = strInput.length();
        System.out.println("There are " + intChars + " characters in the sentence.");
        System.out.println("There are " + intSpaces + " spaces in the sentence.");
        System.out.println("There are " + intLetters + " letter a in the sentence.");
        System.out.println(strDash);






    }
}

    
