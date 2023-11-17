package LinkedLIst.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.insertAtFirstPosition(10);
        dll.insertAtFirstPosition(20);
        dll.insertAtFirstPosition(30);
        dll.insertNodeAtLast(40);
        dll.insertNodeAtLast(50);
        dll.display();

    }
}
