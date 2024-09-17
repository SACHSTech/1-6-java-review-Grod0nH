package gr11review.part1;
import java.io.*;
import java.text.DecimalFormat;

/**
 * A program that takes a string from the user
 * and then prints out the # of characters, spaces, and letters in the sentence
 * 
 * @author: Gordon H.
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

        // Calculates the amount of 'a', spaces, and dashes to include
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

        // Outputs
        intChars = strInput.length();
        System.out.println("There are " + intChars + " characters in the sentence.");
        System.out.println("There are " + intSpaces + " spaces in the sentence.");
        System.out.println("There are " + intLetters + " letter a in the sentence.");
        System.out.println(strDash);

    }
}

    
