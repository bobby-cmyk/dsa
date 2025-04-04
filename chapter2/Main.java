package chapter2;

public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 20, 50, 60, 100, 150, 200, 250, 500, 1000};
        int val = 1000;
        
        int index = binarySearch(arr, val);
        linearSearch(arr, val);

        System.out.printf("Val: %s has index: %d in array\n", val, index);
    }

    private static int linearSearch(int[] arr, int val) {
        System.out.println(">>> Linear Search");
        int steps = 0;
        for (int i = 0; i < arr.length; i++) {
            steps++;
            if(arr[i] == val) {
                System.out.printf("Total steps: %d\n", steps);
                return i;
            }
        }
        System.out.printf("Total steps: %d\n", steps);
        return -1;
    }

    private static int binarySearch(int[] arr, int val) {
        System.out.println(">>> Binary Search");
        // Get lower and upper bounds
        int lowerBound = 0;
        int upperBound = arr.length;

        System.out.printf("Initial lowerbound: %d, upperbound: %d\n", lowerBound, upperBound);

        int steps = 0;

        while (lowerBound <= upperBound) {
            steps ++;
            
            int midpoint = (lowerBound + upperBound) / 2;
            System.out.printf("Midpoint: %d\n", midpoint);

            int midpointVal = arr[midpoint];

            if (val == midpointVal) {
                System.out.printf("Total steps: %d\n", steps);
                return midpoint;
            }

            else if (val < midpointVal) {
                // Ensure that midpoint is not revisted
                upperBound = midpoint - 1;
                System.out.printf("Adjusted upperbound: %d\n", upperBound);
            }

            else if (val > midpointVal) {
                // Ensure that midpoint is not revisted
                lowerBound = midpoint + 1;
                System.out.printf("Upperbound: %d\n", upperBound);
                System.out.printf("Adjusted lowerbound: %d\n", lowerBound);
            }
        }
        // return -1 if cannot find
        System.out.printf("Total steps: %d\n", steps);
        return -1;
    }
}
