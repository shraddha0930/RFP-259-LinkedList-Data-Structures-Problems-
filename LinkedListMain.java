package assignments.LinkedListProblems;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("Welcome To LinkedList Data Structures Problem");
        SimpleLinkedList<Integer> simpleLinkedList = new SimpleLinkedList<>();//create object
//        simpleLinkedList.add(70);
//        simpleLinkedList.add(30);
//        simpleLinkedList.add(56);
//        simpleLinkedList.display();
//        System.out.println();

        simpleLinkedList.add(56);
      //  simpleLinkedList.append(30);
        simpleLinkedList.append(70);
  //      simpleLinkedList.display();
        simpleLinkedList.insertInBetween(56 ,30);

      //  simpleLinkedList.pop();
        simpleLinkedList.popLast();
        simpleLinkedList.display();




    }
}
