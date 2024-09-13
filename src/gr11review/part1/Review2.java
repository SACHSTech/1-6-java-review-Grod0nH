package gr11review.part1;
import java.io.*;

/**
 * A program that gives the user options to choose a joke
 * then prints out the punchline
 * @author: G. Huang
 * 
 */

 public class Review2{
    public static void main(String[] args) throws IOException{
        //Initilizes the User Input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Initilizing all the variables
        int intMenu = 0;

        //Lists the options
        System.out.println("0 - print a joke about your hair" +
                        "\n" + "1 - print a joke about your feet" +
                        "\n" + "2 - print a joke about your clothes" +
                        "\n" +"3 - print a joke about your teacher");
        //Gets the user input
        System.out.println("Choose menu option: ");
        intMenu = Integer.parseInt(br.readLine());

        switch(intMenu){
            case 0:
                System.out.println("I had straight As in grade 9. In grade 12, I can't even keep my hair straight.");
                break;
            case 1:
                System.out.println("");
                break;
            case 2:
                System.out.println("Why did the golfer have an extra pair of pants? In case he got a hole in one!");
                break;
            case 3:
                System.out.println("");
                break;
            default:
                System.out.println("Invalid menu option");
        }


    }
}
