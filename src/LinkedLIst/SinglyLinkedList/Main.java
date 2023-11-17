package LinkedLIst.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        LL ll = new LL();
        ll.insertAtFirstPosition(10);
        ll.insert(100, 1);
        ll.insert(200, 2);
        ll.insert(210, 3);
        ll.insert(323, 4);
        System.out.println("Displaying before deleting fist element");
        ll.display();
        ll.delete(3);
        System.out.println("After deleting the element");
        ll.display();
        System.out.println("Inserting at any particular position");
        ll.insertUsingRecursion(90, 2);
        System.out.println("After inserting");
        ll.display();
    }
}
