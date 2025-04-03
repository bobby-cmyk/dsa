package chapter14;

import chapter14.doublylinkedlist.DoublyLinkedList;
import chapter14.doublylinkedlist.DoublyNode;
import chapter14.linkedlist.LinkedList;
import chapter14.linkedlist.Node;

// Complie - javac -d classes -cp src src/chapter14/Main.java
// Run - java -cp classes chapter14.Main

public class Main {
    public static void main(String[] args) {
        deleteNodeDemo();
    }

    public static void deleteNodeDemo() {

        // Initialise linked list
        Node node1 = new Node("1");
        Node node2 = new Node("2");
        Node node3 = new Node("3");
        Node node4 = new Node("4");
        Node node5 = new Node("5");
        
        node1.setNextNode(node2);
        node2.setNextNode(node3);
        node3.setNextNode(node4);
        node4.setNextNode(node5);

        LinkedList linkedList = new LinkedList(node1);

        linkedList.displayNodes();

        // Delete node
        Node toDelete = node5;
        Node currentNode = toDelete;
        Node nextNode = toDelete.getNextNode();

        if (nextNode != null) {
            System.out.print("\n>>> Delete node: %s".formatted(node3.getPrimaryValue()));

            currentNode.setPrimaryValue(nextNode.getPrimaryValue());
            currentNode.setNextNode(nextNode.getNextNode());
        }

        else {
            System.out.println("\n>>> Cannot delete last node");
        }

        linkedList.displayNodes();
    }

    public static void reverseLinkedListDemo() {
        // Initialise linked list
        Node node1 = new Node("1");
        Node node2 = new Node("2");
        Node node3 = new Node("3");
        Node node4 = new Node("4");
        Node node5 = new Node("5");
        
        node1.setNextNode(node2);
        node2.setNextNode(node3);
        node3.setNextNode(node4);
        node4.setNextNode(node5);

        LinkedList linkedList = new LinkedList(node1);

        linkedList.displayNodes();
        linkedList.reverseList();
        linkedList.displayNodes();
    }

    public static void linkedListDemo() {
         // Initialise linked list
        Node node1 = new Node("1");
        Node node2 = new Node("2");
        Node node3 = new Node("3");
        Node node4 = new Node("4");
        Node node5 = new Node("5");
        
        node1.setNextNode(node2);
        node2.setNextNode(node3);
        node3.setNextNode(node4);
        node4.setNextNode(node5);

        LinkedList linkedList = new LinkedList(node1);

        // Read
        int selectedIndex = 10;
        linkedList.read(selectedIndex);

        // Search
        String selectedValue = "hello";
        linkedList.search(selectedValue);

        // Insert
        Node newNode1 = new Node("0");
        Node newNode2 = new Node("10");
        Node newNode3 = new Node("6");
        linkedList.displayNodes();
        linkedList.insert(0, newNode1);
        linkedList.displayNodes();
        linkedList.insert(10, newNode2);
        linkedList.displayNodes();
        linkedList.insert(6, newNode3);
        linkedList.displayNodes();

        // Delete
        linkedList.delete(0);
        linkedList.displayNodes();
        linkedList.delete(10);
        linkedList.displayNodes();
        linkedList.delete(3);
        linkedList.displayNodes();

        // Return last node
        linkedList.getLast();
    }

    public static void doublyLinkedListDemo() {
        DoublyNode node1 = new DoublyNode("a");
        DoublyNode node2 = new DoublyNode("b");
        DoublyNode node3 = new DoublyNode("c");
        DoublyNode node4 = new DoublyNode("d");
        DoublyNode node5 = new DoublyNode("e");

        node1.setNextNode(node2);
        node2.setPreviousNode(node1);
        node2.setNextNode(node3);
        node3.setPreviousNode(node2);
        node3.setNextNode(node4);
        node4.setPreviousNode(node3);
        node4.setNextNode(node5);
        node5.setPreviousNode(node4);
        
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(node1);

        doublyLinkedList.displayNodes();

        doublyLinkedList.displayNodesInReverse();
    }
}
