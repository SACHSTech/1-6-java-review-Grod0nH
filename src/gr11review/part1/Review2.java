package gr11review.part1;
import java.io.*;

/**
 * A program that gives the user options to choose a joke
 * then prints out the punchline
 * @author: Gordon H.
 * 
 */

 public class Review2{
    public static void main(String[] args) throws IOException{

        // Initilizes the User Input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Initilizing all the variables
        int intMenu = 0;

        // Lists the options
        System.out.println("0 - print a joke about your hair"); 
        System.out.println("1 - print a joke about your feet"); 
        System.out.println("2 - print a joke about your clothes"); 
        System.out.println("3 - print a joke about your teacher");

        // Gets the user input
        System.out.print("Choose a menu option: ");
        intMenu = Integer.parseInt(br.readLine());

        // Switch case that selects the joke based on the user's input
        switch(intMenu){
            case 0:
                System.out.println("I had straight As in grade 9?");
                System.out.println("In grade 12, I can't even keep my hair straight.");
                break;
            case 1:
                System.out.println("I hope he's doing okay.");
                System.out.println("Are you sure heel be fine?");
                break;
            case 2:
                System.out.println("Why did the golfer have an extra pair of pants?");
                System.out.println(" In case he got a hole in one!");
                break;
            case 3:
                System.out.println("Why were the teacher's eyes crossed?");
                System.out.println("She couldn't control her pupils!");
                break;
            default:
                System.out.println("Invalid menu option");
                break;
        }

    }
}
