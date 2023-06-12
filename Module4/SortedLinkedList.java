 /**
 * a program that reads a list of Integer numbers from the 
 * scanned input and saves them into a Linked List sorted from the 
 * smallest to the largest. It uses the Collections Framework 
 * and follows code guidelines.
 * @author Yannelly Mercado
 * @version 1.0.0
 * @since week 4 of CSC6301
 */

import java.util.*;
public class SortedLinkedList {
    /**
     * reads a list of Integer numbers from the 
     * scanned input and saves them into a Linked List sorted from the 
     * smallest to the largest.
     * @since week 4 of CSC6301
     */
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        // read the numbers from the user
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a list of numbers separated by a space (enter 'e' then hit enter to sort them):");
            
            // while the user has not entered 'e'
            while (scanner.hasNextInt()) {
                // add the number to the list
                int number = scanner.nextInt();
                numbers.add(number);
            }
        }
        // sort the numbers using the Collections Framework
        Collections.sort(numbers);
        // print out the sorted numbers
        System.out.println("Sorted numbers: " + numbers);
    }
}

