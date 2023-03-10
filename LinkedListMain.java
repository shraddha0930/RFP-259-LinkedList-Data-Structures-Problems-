package assignments.LinkedListProblems;

import java.util.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("Welcome To LinkedList Data Structures Problem");
        SimpleLinkedList<Integer> simpleLinkedList = new SimpleLinkedList<>();//create object

        simpleLinkedList.add(70);//call add method from simplelinkedlist and adding nodeOne to simplelinkedlist
        simpleLinkedList.add(30);
        simpleLinkedList.add(56);
        simpleLinkedList.display();

    }
}
