package chapter11;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] arrStrings = {"ab", "c", "def", "ghij"};

        System.out.printf("Sum of Characters: %s\n", sumCharacters(arrStrings));
    }

    private static int sumCharacters(String[] arrStrings) {
        if (arrStrings.length == 0) return 0;

        return arrStrings[0].length() +  sumCharacters(Arrays.copyOfRange(arrStrings, 1, arrStrings.length));
    }
}
