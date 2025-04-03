package chapter1;
// javac --source-path src -d classes src/chapter1/*.java
// java -cp classes chapter1.Main
public class Main {
    public static void main(String[] args) {

        UnorderedArray array = new UnorderedArray(5);

        // insert characters
        array.insert(0, 'd');
        array.insert(0, 'c');
        array.insert(0, 'b');
        array.insert(0, 'a');
        array.insert(4,'e');
    }
}
