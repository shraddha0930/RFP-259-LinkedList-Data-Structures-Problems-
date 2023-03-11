package assignments.LinkedListProblems;

import com.Mar1.MyLinkedList;

import static java.lang.System.exit;

public class SimpleLinkedList<D> {
    //take variable node
    Node<D> head ;

    Node<D> tail ;

    public void add(D data){
        Node<D> newNode = new Node<>(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.setNextNode(head);
            head = newNode;
        }
    }

    public void display() {
        Node<D> temp = head;
        // check for empty list
        if (temp == null) {
            System.out.println("list is empty");
            exit(1);
        } else {
            while (temp != null) {

                // print node data
                System.out.print(temp.getData());

                // assign temp link to temp
                temp = temp.getNextNode();
                if (temp != null)
                    System.out.print(" -> ");
            }
        }
    }
    public void append(D data) {
        Node<D> newNode = new Node<>(data);
        if(head == null){
            head = newNode;
        }
        else {
            tail.setNextNode(newNode);
        }
        tail = newNode;
    }
    public void insertInBetween(D previous, D newNode) {
        Node currentNode = head;
        Node temp = null;
        while (currentNode != null) {
            if (currentNode.data == previous) {
                temp = currentNode;
            }
            currentNode = currentNode.nextNode;
        }
        Node node = new Node(newNode);
        node.setData(newNode);
        node.nextNode = temp.nextNode;
        temp.setNextNode(node);
    }
   /* public D pop() {
        D temp = head.getData();
        head = head.getNextNode();
        return temp;
    }*/

    public D popLast() {
        D temp = tail.getData();
        Node<D> secondLast = head;
        while(secondLast.getNextNode() != tail){
            secondLast = secondLast.getNextNode();
        }
        secondLast.setNextNode(null);
        tail = secondLast;
        return temp;
    }
    public Node search(D data) {
        Node currentNode = head;
        int position = 0;
        while (currentNode != null) {
            position ++;
            if (currentNode.data== data) {
                System.out.println("Node with value " + data + " is found at position "+position);
                return currentNode;
            }
            currentNode = currentNode.nextNode;
        }
        System.out.println("No node found with value " + data);
        return null;
    }
    public boolean insertAfter(D searchData, D insertData) {
        if ((searchData) != null){
            Node<D> nextNode = search(searchData).getNextNode();
            Node<D> newNode = new Node<>(insertData);
            search(searchData).setNextNode(newNode);
            newNode.setNextNode(nextNode);
            return true;
        }
        return false;
    }

    public void delete(D data) {
        Node currentNode = head;
        Node tail = null;
        int size = 0;
        while (currentNode!= null) {
            size ++;
            if (currentNode.data == data) {
                tail.nextNode = currentNode.nextNode;
            }
            tail = currentNode;
            currentNode = currentNode.nextNode;
        }
        System.out.println("No node found with value " + data);
        System.out.println("after delete linked list size is: "+size);

    }
}
