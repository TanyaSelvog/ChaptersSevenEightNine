import java.util.Scanner; // Needed for Scanner class
import java.util.Random; // Needed for Random class
import java.io.*; // Needed for file I/O classes

/**
This program writes random numbers to a file
*/

public class ObjectDemo 
{
    public static void main(String[] args) throws IOException
    {
        int maxNumbers; // max number of random numbers
        int number; // to hold a random number

        // Create a Scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Create a Random object to generate random numbers
        Random rand = new Random();

        // Create a PrintWriter object to open the file
        PrintWriter outputFile = new PrintWriter("numbers.txt");

        // Get the number of random numbers to write
        System.out.print("How many numbers y'all want?");
        maxNumbers = keyboard.nextInt();

        // Write the random numbers to a file
        for (int count = 0; count < maxNumbers; count++)
            {
                // Generate a random integer
                number = rand.nextInt();

                // Write the random number to the file
                outputFile.println(number);

            }
        
        // Close the file
        outputFile.close();
        System.out.println("Done.");
    }
}
