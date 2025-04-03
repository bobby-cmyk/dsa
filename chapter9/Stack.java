package chapter9;

import java.util.ArrayList;
import java.util.List;

public class Stack {

    private List<Character> stack = new ArrayList<>();

    public void push(Character character) {
        // Default add to the back of the list
        stack.add(character);
    }

    public void pop() {
        stack.remove(stack.size() - 1);
    }

    public Character read() {
        return stack.get(stack.size() - 1);
    }
}
