package linkedlist;

public class Main {
    public static void main(String[] args) {
        /*LinkedList linkedList = new LinkedList();
        linkedList.insertFirst(3);
        linkedList.insertFirst(2);
        linkedList.insertFirst(9);
        linkedList.insertFirst(13);
        linkedList.insertLast(88);
        linkedList.insert(100,5);

        linkedList.display();

        System.out.println(linkedList.deleteFirst());

        linkedList.display();

        System.out.println(linkedList.deleteLast());

        linkedList.display();

        System.out.println(linkedList.delete(2));

        linkedList.display();*/

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertFirst(3);
        doublyLinkedList.insertFirst(2);
        doublyLinkedList.insertFirst(9);
        doublyLinkedList.insertFirst(13);
        doublyLinkedList.insertLast(99);
        doublyLinkedList.insert(2,76);

        doublyLinkedList.display();
    }
}
