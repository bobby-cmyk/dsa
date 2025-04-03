package chapter8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // O(N) implementations

        // Intersection 
        int[] array1 = {1, 3, 5, 6, 7, 8, 9};
        int[] array2 = {4, 5, 7, 12};

        System.out.printf("Intersect Array: %s\n", intersectArr(array1, array2).toString());

        // First Duplicate

        char[] arrayWithDuplicates = {'a', 'b', 'b', 'c', 'd', 'd', 'e'};

        System.out.printf("First duplicate value: %s\n", firstDuplicate(arrayWithDuplicates));

        // Missing alphabet

        String sentence = "the quick brown box jumps over a lazy dog";

        System.out.printf("First duplicate value: %s\n", missingAlphabet(sentence));

        // Non duplicated character

        String word = "minimum";

        System.out.printf("First non duplicated charcter: %s\n", nonDuplicatedCharacter(word));
    }
    
    private static List<Integer> intersectArr(int[] array1, int[] array2) {

        // Determine which is the larger array
        int[] largerArr;
        int[] smallerArr;

        if (array1.length > array2.length) {
            largerArr = array1;
            smallerArr = array2;
        }
        else {
            smallerArr = array1;
            largerArr = array2;
        }

        // Make the larger array into a hash table
        HashMap<Integer, Boolean> largerMap = new HashMap<>();

        // convert larger array to hash
        for (int i = 0; i < largerArr.length; i++) {
            largerMap.put(largerArr[i], true);
        }

        List<Integer> thirdArr = new ArrayList<>();
        

        for (int i = 0; i < smallerArr.length; i++) {

            if (largerMap.containsKey(smallerArr[i])) {
                thirdArr.add(smallerArr[i]);
            }
        }
        
        return thirdArr;
    }

    private static Character firstDuplicate(char[] arrayWithDuplicates) {

        HashMap<Character, Boolean> hashMap = new HashMap<>();

        Character value = null;

        for (int i = 0; i < arrayWithDuplicates.length; i++) {

            value = arrayWithDuplicates[i];

            if (hashMap.containsKey(value)) {
                return value;
            }

            else {
                hashMap.put(value, true);
            }
        }

        return value;
    }

    private static Character missingAlphabet(String sentence) {

        Character missingAlphabet = null;

        HashMap<Character, Boolean> hashMap = new HashMap<>();

        for (int i = 0; i < sentence.length(); i++) {
            hashMap.put(sentence.charAt(i), true);
        }

        String allAlphabet = "abcdefghijklmnopqrstuvwxyz";
        
        for (int i = 0; i < allAlphabet.length(); i++) {
            Character character = allAlphabet.charAt(i);
            if (!hashMap.containsKey(character)) {
                missingAlphabet = character;
                return missingAlphabet;
            }
        }

        return missingAlphabet;
    }

    private static Character nonDuplicatedCharacter(String string) {

        Character nonDuplicatedChar = null;

        HashMap<Character, Integer> hashMap = new HashMap<>();
        
        for (int i = 0; i < string.length(); i++) {
            if (hashMap.containsKey(string.charAt(i))) {
                hashMap.put(string.charAt(i), hashMap.get(string.charAt(i)) + 1);
            }

            else {
                hashMap.put(string.charAt(i), 1);
            }
        }

        for (int i = 0; i < string.length(); i++) {

            Character character = string.charAt(i);

            if (hashMap.get(string.charAt(i)) == 1) {
                nonDuplicatedChar = character;

                return nonDuplicatedChar;
            }
        }

        return nonDuplicatedChar;
    }
}

