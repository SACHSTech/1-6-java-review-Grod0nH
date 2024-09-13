package gr11review.part1;
import java.io.*;

/**
 * A program that calculates the the number of days passed when you enter the month(in numbers) and the days
 * then prints out the result
 * @author: G. Huang
 * 
 */
public class Review1{
    public static void main(String[] args) throws IOException{
        //Initilizes the User Input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int intMonth = 0;
        int intDay = 0;
        int intFinalDay = 0;
        int[] arrMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        //Inputs
        System.out.print("Enter the month number: ");
        intMonth = Integer.parseInt(br.readLine());

        System.out.print("Enter the day number: ");
        intDay = Integer.parseInt(br.readLine());

        //Calculates the months in days
        for(int i = 0; i < intMonth - 1; i++){
            intFinalDay += arrMonth[i];
        }
        //Adds the months and the days for the final days
        intFinalDay += intDay;
        
        //prints out the result
        System.out.println(intFinalDay);
    }
}

