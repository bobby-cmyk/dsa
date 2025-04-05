package chapter3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {    
        String[] arr = {"hi", "how", "are", "you", "list", "adding", "more", "words", "to", "the", "today", "today"};

        System.out.printf(">>> Length of string array: %d\n", arr.length);
        
        if (hasDuplicateValueQuadratic(arr)) {
            System.out.println("Has duplicates");
        }
        else {
            System.out.println("No duplicates found");
        }

        if (hasDuplicateValueLinear(arr)) {
            System.out.println("Has duplicates");
        }
        else {
            System.out.println("No duplicates found");
        }

        int[] intArr = {2923, 532, 100, 43, 40 , 23, 10, 5, 1};

        System.out.printf(">>> Length of integer array: %d\n", intArr.length);

        int[] sortedIntArr = bubbleSort(intArr);

        System.out.printf("Sorted array: ");

        for (int i = 0; i < sortedIntArr.length; i++) {
            System.out.print(sortedIntArr[i] + ", ");
        }
        System.out.println();
    }

    public static int[] bubbleSort(int[] arr) {
        System.out.println(">>> Bubble sort");
        int unsortedUntilBound = arr.length - 1;
        boolean isSorted = false;
        int steps = 0;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < unsortedUntilBound; i++) {
                steps++;
                if (arr[i] > arr[i + 1]) {
                    steps++;
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                    isSorted = false;
                }
            }
            unsortedUntilBound--;
        }
        System.out.printf("Number of steps taken: %d\n", steps);
        return arr;
    }

    public static boolean hasDuplicateValueQuadratic(String[] arr) {
        System.out.printf(">>> Check for duplicate values: Quadratic\n");
        int steps = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                steps++;

                if (i!=j && arr[i].equals(arr[j])) {
                    System.out.printf("Steps taken: %d\n", steps);
                    return true;
                }
                // Else continue looping
            }
        }
        System.out.printf("Steps taken: %d\n", steps);
        return false;
    }

    public static boolean hasDuplicateValueLinear(String[] arr) {
        System.out.printf(">>> Check for duplicate values: Linear\n");
        // Use a map to store key value when an element is iterated
        Map<String, Integer> existingNumbers = new HashMap<>();

        int steps = 0;
        for (int i = 0; i < arr.length; i++) {
            steps++;
            // Check if key exists
            if (existingNumbers.containsKey(arr[i])) {
                System.out.printf("Steps taken: %d\n", steps);
                return true;
            }
            else {
                // If does not, put an arbitary value with key in map
                existingNumbers.put(arr[i], 1);
            }
        }
        System.out.printf("Steps taken: %d\n", steps);
        return false;
    }
}
