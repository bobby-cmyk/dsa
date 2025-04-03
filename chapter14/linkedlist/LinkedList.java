package chapter14.linkedlist;

public class LinkedList {
    private Node firstNode;

    public LinkedList(Node firstNode) {
        this.firstNode = firstNode;
    }

    public void reverseList() {
        
        // Current Node
        Node currentNode = firstNode;
        // Previous Node
        Node previousNode = null;

        while (currentNode != null) {
            // Temporary next node 
            Node nextNode = currentNode.getNextNode();
            // Change the next node to previous node
            currentNode.setNextNode(previousNode);

            // Move forward previous node to current node
            previousNode = currentNode;
            // Move forward current node to temporary node saved
            currentNode = nextNode;
        }

        firstNode = previousNode;
    }

    public Node getLast() {
        
        Node currentNode = firstNode;

        while (currentNode.getNextNode() != null) {
            currentNode = currentNode.getNextNode();
        }

        System.out.println("Last Node: %s".formatted(currentNode.getPrimaryValue()));
        return currentNode;
    }

    public void displayNodes() {
        
        System.out.println("\n>>> Display all nodes");

        Node currentNode = firstNode;
        int currentIndex = 0;

        while (currentNode != null) {
            System.out.println("Index: %d, Node: %s".formatted(currentIndex, currentNode.getPrimaryValue()));
            currentNode = currentNode.getNextNode();
            currentIndex ++;
        }
    }

    public Node read(int index) {

        System.out.println("\n>>> Read");

        Node currentNode = firstNode;
        int currentIndex = 0;

        while (currentIndex < index) {
            currentNode = currentNode.getNextNode();

            // If reach the end of list
            if (currentNode == null) {
                System.out.println("Index is out of bounds");
                return currentNode;
            }
            // Add to current index
            currentIndex ++;
        }

        System.out.println("Primary value of read node: " + currentNode.getPrimaryValue());
        return currentNode;
    }

    public Integer search(String nodeValue) {

        System.out.println("\n>>> Search");

        Node currentNode = firstNode;
        int currentIndex = 0;

        while (true) {
            if (currentNode.getPrimaryValue().equals(nodeValue)) {
                System.out.println("Found node with value: %s at index: %d".formatted(nodeValue, currentIndex));
                return currentIndex;
            }

            else {
                currentNode = currentNode.getNextNode();
                currentIndex ++;

                if (currentNode == null) {
                    System.out.println("Node value does not exist in linked list");
                    return null;
                }
            }
        }
    }

    public void insert(int newNodeIndex, Node newNode) {

        System.out.println("\n>>> Insert");

        if (newNodeIndex == 0) {
            newNode.setNextNode(firstNode);
            this.firstNode = newNode;
            System.out.println("Inserted Node: %s at Index: %d".formatted(newNode.getPrimaryValue(), newNodeIndex));
            return;
        }

        Node previousNode = read(newNodeIndex - 1);

        if (previousNode != null) {
            newNode.setNextNode(previousNode.getNextNode());
            previousNode.setNextNode(newNode);
            System.out.println("Inserted Node: %s at Index: %d".formatted(newNode.getPrimaryValue(), newNodeIndex));
        }

        else {
            System.out.println("Not inserted - Node: %s at Index: %d".formatted(newNode.getPrimaryValue(), newNodeIndex));
        }
    }

    public void delete(int deleteNodeIndex) {

        System.out.println("\n>>> Delete");

        if (deleteNodeIndex == 0) {
            System.out.println("Deleted Node: %s at Index: %d".formatted(firstNode.getPrimaryValue(), deleteNodeIndex));
            this.firstNode = firstNode.getNextNode();
            return;
        }

        Node previousNode = read(deleteNodeIndex - 1);

        if (previousNode != null) {
            // Skip one node and set as next node
            Node toDeleteNode = previousNode.getNextNode();
            Node nextNode = toDeleteNode.getNextNode();
            previousNode.setNextNode(nextNode);
            
            System.out.println("Deleted Node: %s at Index: %d".formatted(toDeleteNode.getPrimaryValue(), deleteNodeIndex));
        }

        else {
            System.out.println("Not deleted - No node at index: %d".formatted(deleteNodeIndex));
        }
    }
} 
