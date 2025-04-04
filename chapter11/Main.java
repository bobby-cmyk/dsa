package chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        <SUM NUMBER OF CHARACTERS>
        
        String[] arrayStrings = {"abc", "c", "def", "ghij"};

        System.out.println("Sum of characters: " + sumCharacters(arrayStrings));    
        
        */
    
       // 

        /*
         
        <RETURN EVEN NUMBERS ARRAY>
        
        List<Integer> numArr = new ArrayList<>();
        numArr.add(2);
        numArr.add(2);
        numArr.add(1);
        numArr.add(1);
        numArr.add(1);
        numArr.add(1);
        
        for (Integer i : numArr) {
            System.out.printf("%d,", i);
        }

        System.out.println();

        List<Integer> evenOnlyNumArr = onlyEvenNumbers(numArr);

        for (Integer i : evenOnlyNumArr) {
            System.out.printf("%d,", i);
        }

        System.out.println();

        */

        /*
        <TRIANGULAR NUMBERS>
        

        int n = 7;

        System.out.printf("Term: %d - Triangular Number: %d\n", n,triNum(n));
        */

        /*
        <X_INDEX>
        

        String string = "abxcde";

        System.out.println("X index: %d".formatted(xIndex(string)));

        */
    }

    public static int xIndex(String string) {

        if (string.length() == 1) {
            //Assuming that there's a x
            return 0;
        }

        if (string.substring(0, 1).equals("x")) {
            return 0;
        }

        else {
            return 1 + xIndex(string.substring(1, string.length()));
        }
    }

    public static int triNum(int n) {

        if (n == 1) {
            return 1;
        }

        return n + triNum(n-1);
    }

    public static int sumCharacters(String[] arrStrings) {
       if (arrStrings.length == 1) {
        return arrStrings[0].length();
       } 
       return arrStrings[0].length() + sumCharacters(Arrays.copyOfRange(arrStrings, 1, arrStrings.length)); 
    }

    public static List<Integer> onlyEvenNumbers(List<Integer> numArr) {

        if (numArr.size() == 1) {
            if (numArr.get(0) % 2 == 0) {
                return numArr;
            }

            else {
                // return empty array
                return new ArrayList<>();
            }
        } 
        
        // If even number
        if (numArr.get(0) % 2 == 0) {
            List<Integer> result = new ArrayList<>();
            result.add(numArr.get(0));
            result.addAll(onlyEvenNumbers(numArr.subList(1, numArr.size())));
            return result;
        }
        else {
            return onlyEvenNumbers(numArr.subList(1, numArr.size()));
        }
    }
}
