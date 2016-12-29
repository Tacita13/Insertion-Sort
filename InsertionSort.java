
/* This program implements an Insertion Sort for an Array of randomly
 generated integers and tests the result by representing an unsorted and 
 sorted list of such numbers.
 */
package insertionsort;

/**
 *
 * @author Isamar
 */
import java.util.Random;

public class InsertionSort {
// Does the insertion Sort after recieving values for the Array

    public static int[] InsertionSort(int[] unsorted) {
        int j;
        int key;
        int i;
        int[] sorted = new int[unsorted.length];

        sorted[0] = unsorted[0];

        for (j = 1; j < unsorted.length; j++) {
            key = unsorted[j]; 
            sorted[j] = key;
            for (i = j - 1; i >= 0 && sorted[i] > key; i--) {
                sorted[i + 1] = sorted[i];
                sorted[i] = key;
            }
        }
        return sorted;
    }
    /*Test the program and assigns random values and the limit(# of elements
     and until what number is it random)*/

    public static void main(String[] args) {

        int[] numbers = new int[5];
        Random randomGenerator = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = randomGenerator.nextInt(5);
        }
        System.out.println("Unsorted: ");
        printArray(numbers);
        System.out.println("\n");

        numbers = InsertionSort(numbers);

        System.out.println("Sorted: ");
        printArray(numbers);
    }
//Prints the Array as lists   

    private static void printArray(int[] input) {

        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }
}
