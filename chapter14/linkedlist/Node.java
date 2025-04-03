package chapter14.linkedlist;

public class Node {
    private String primaryValue;
    private Node nextNode;

    public Node(String primaryValue) {
        this.primaryValue = primaryValue;
    }

    public String getPrimaryValue() {
        return primaryValue;
    }
    public void setPrimaryValue(String primaryValue) {
        this.primaryValue = primaryValue;
    }
    public Node getNextNode() {
        return nextNode;
    }
    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
