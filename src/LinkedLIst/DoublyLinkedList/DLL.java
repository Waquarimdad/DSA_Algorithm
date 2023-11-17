package LinkedLIst.DoublyLinkedList;

public class DLL {
    private Node head;

    DLL() {

    }

    public void insertAtFirstPosition(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        newNode.previousNode = null;
        if (head != null) {
            head.previousNode = newNode;
        }
        head = newNode;
    }
    public void display() {
         /*
            Changing temp will not change the head
         */
        Node tempNode = head;
        Node lastNode = null;
        while (tempNode != null) {
            System.out.print(tempNode.value + " -> ");
            lastNode = tempNode;
            tempNode = tempNode.next;
        }
        System.out.println("END");

        System.out.println("Print in reverse");
        while(lastNode != null) {
            System.out.print(lastNode.value + " -> ");
            lastNode = lastNode.previousNode;
        }
        System.out.println("START");
    }

    public void insertNodeAtLast(int value) {
        Node newNode = new Node(value);
        newNode.next = null;
        Node lastNode = head;
        if (head == null) {
            newNode.previousNode = null;
            head = newNode;
            return;
        }
        while(lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
        newNode.previousNode = lastNode;
    }


    public class Node  {
        int value;
        Node next;
        Node previousNode;

        Node(int value) {
            this.value = value;
            this.next = null;
            this.previousNode = null;
        }

        public Node(int value, Node next, Node prevuoisNode) {
            this.value = value;
            this.next = next;
            this.previousNode = prevuoisNode;
        }
    }
}
