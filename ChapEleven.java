package edu.neu.mgen;
import java.util.Scanner;

public class ChapEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Reading a string from the terminal
            System.out.print("Enter a string: ");
            String text = scanner.next();
            System.out.println("You entered: " + text);
        } catch (Exception e) {
            // Handle any input-related exceptions
            System.out.println("Error: Invalid input. Please enter a valid value.");
        } finally {
            scanner.close();
        }
    }
}
