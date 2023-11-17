package LinkedLIst.CircularLinkedList;

public class Main {
    public static void main(String[] args) {
        CLL cll = new CLL();
        cll.insertAtLast(10);
        cll.insertAtLast(20);
        cll.delete(20);
        cll.display();
    }
}
