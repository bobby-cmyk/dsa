package chapter14.doublylinkedlist;

public class DoublyLinkedList {
    private DoublyNode firstNode;
    private DoublyNode lastNode;

    public DoublyLinkedList(DoublyNode firstNode) {
        this.firstNode = firstNode;

        DoublyNode currentNode = firstNode;
        while (currentNode != null) {
            this.lastNode = currentNode;
            currentNode = currentNode.getNextNode();
        }
    }

    public void insertAtEnd(DoublyNode newNode) {
        newNode.setPreviousNode(lastNode);
        lastNode.setNextNode(newNode);
        lastNode = newNode;
    }

    public void removeFromFront() {
        DoublyNode secondNode = firstNode.getNextNode();
        secondNode.setPreviousNode(null);

        firstNode = secondNode;
    }

    public void displayNodes() {
        System.out.println("\n>>> Display all nodes");

        DoublyNode currentNode = firstNode;

        while (currentNode != null) {
            System.out.println("Node: %s".formatted(currentNode.getNodeValue()));
            currentNode = currentNode.getNextNode();
        }
    }

    public void displayNodesInReverse() {
        System.out.println("\n>>> Display all nodes in reverse");

        DoublyNode currentNode = lastNode;

        while (currentNode != null) {
            System.out.println("Node: %s".formatted(currentNode.getNodeValue()));
            currentNode = currentNode.getPreviousNode();
        }
    }
}

