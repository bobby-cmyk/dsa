package chapter1;

public class UnorderedArray {

    private char[] unorderedArray;
    private int size;

    public UnorderedArray(int capacity) {
        this.unorderedArray = new char[capacity];
        this.size = 0;
    }

    public char read(int index) {

        int steps = 0;

        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }

        char value = unorderedArray[index];
        steps ++; // One step
        
        System.out.printf("Read\n - Array Size: %d\n - Steps: %d\n", size, steps);

        return value;
    }

    public char search(char value) {

        int steps = 0;
        
        for (int i = 0 ; i < unorderedArray.length; i++) {

            steps++; // iterate through to check value

            if (unorderedArray[i] == value) {

                // Lesser steps if value is found 
                System.out.printf("Search\n - Array Size: %d\n - Steps: %d\n".formatted(size, steps));

                return value;
            }
        }
        System.out.printf("Search\n - Array Size: %d\n - Steps: %d\n", size, steps);
        // Not found
        return 'x';
    }

    public void insert(int index, char value) {
        
        if (index < 0 || index > size) {
            // ensure that the index provided is within 0 or just +1 (end of array)
            throw new ArrayIndexOutOfBoundsException();
        }

        if (size == unorderedArray.length) {
            // Cannot insert more element because array is full
            throw new IllegalStateException();
        }

        int steps = 0;

        System.out.printf("Step %d: %s\n", steps, toString());

        for (int i = size; i > index; i--) {
            // shift elements that are after and on the insert index one step to the right
            unorderedArray[i] = unorderedArray[i - 1];
            steps++;

            System.out.printf("Step %d: %s\n", steps, toString());
        } 

        // Insert value into the empty spot
        unorderedArray[index] = value;
        steps++;

        System.out.printf("Step %d: %s\n", steps, toString());

        size++;
        
        System.out.printf("Insert\n - Array Size: %d\n - Steps: %d\n", size, steps);
    } 

    public void delete(int index) {

        if (index < 0 || index >= size) {
            // within (0, size-1)
            throw new ArrayIndexOutOfBoundsException();
        }

        int steps = 0;

        // One step to delete element
        unorderedArray[index] = ' ';
        steps++;

        for (int i = index; i < size - 1; i++) {
            unorderedArray[index] = unorderedArray[index + 1];
            steps++;
        }

        unorderedArray[size - 1] = ' ';
        size--;

        System.out.printf("Delete\n - Array Size: %d\n - Steps: %d\n", size, steps);
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < unorderedArray.length; i++) {
            builder.append(unorderedArray[i]).append(",");
        }

        String arrayString = builder.toString();

        return arrayString.substring(0, arrayString.length()-1);
    }
}
