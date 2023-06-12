package SoftwareDocumentation.Module5;

/**

A program that reads a list of Integer numbers from the scanned input
and saves them into a Stack sorted from the smallest to the largest.
It uses the Collections Framework and follows code guidelines.
author Yannelly Mercado
version 1.0.1
since week 5 of CSC6301
*/
import java.util.*;

public class SortedStack {
    /**
    * Reads a list of Integer numbers from the scanned input
    * and saves them into a Stack sorted from the smallest to the largest.
    *
    * @since week 4 of CSC6301
    */
    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();
        // read the numbers from the user
        try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Enter a list of numbers separated by a space (enter 'q' then hit enter to sort them):");
                // while the user has not entered 'q'
                while (scanner.hasNextInt()) {
                    // get the number and add the number to the stack
                    int number = scanner.nextInt();
                    numbers.push(number);
                }
            }
            // sort the numbers using the Collections Framework
            Collections.sort(numbers);
            // create a temporary stack to reverse the order
            Stack<Integer> sortedStack = new Stack<>();
            while (!numbers.isEmpty()) {
                sortedStack.push(numbers.pop());
            }
            // print out the sorted numbers
            System.out.println("Sorted numbers: " + sortedStack);
        }
    }
