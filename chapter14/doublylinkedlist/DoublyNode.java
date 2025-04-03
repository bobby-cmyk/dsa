package chapter14.doublylinkedlist;

public class DoublyNode {
    private DoublyNode previousNode;
    private DoublyNode nextNode;
    private String nodeValue;

    public DoublyNode(String nodeValue) {
        this.nodeValue = nodeValue;
    }

    public DoublyNode getPreviousNode() {
        return previousNode;
    }
    public void setPreviousNode(DoublyNode previousNode) {
        this.previousNode = previousNode;
    }
    public DoublyNode getNextNode() {
        return nextNode;
    }
    public void setNextNode(DoublyNode nextNode) {
        this.nextNode = nextNode;
    }
    public String getNodeValue() {
        return nodeValue;
    }
    public void setNodeValue(String nodeValue) {
        this.nodeValue = nodeValue;
    }
}
