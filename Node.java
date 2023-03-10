package assignments.LinkedListProblems;

public class Node<D>{
    private D data;
    Node<D> nextNode;

    public Node(D data) {
        this.data = data;
    }

    public D getData() {
        return data;
    }

    public void setData(D data) {
        this.data = data;
    }

    public Node<D> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<D> nextNode) {
        this.nextNode = nextNode;
    }



}
