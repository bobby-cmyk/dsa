package chapter9;

public class Main {
    public static void main(String[] args) {
        

        String string = "abcdef";

        String reverseString = "";

        Stack stack = new Stack();

        for (int i = 0; i < string.length(); i++) {
            stack.push(string.charAt(i));
        }

        for (int i  = 0; i < string.length(); i++) {
            reverseString += stack.read();
            stack.pop();
        }

        System.out.printf("Original String: %s\n", string);
        System.out.printf("Reverse String: %s\n", reverseString);
    }
}
