package LinkedLIst.CircularLinkedList;

public class CLL {
    Node head;
    Node tail;

    CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insertAtLast(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    public void display() {
        Node tempNode = head;
        if (head != null) {
            do {
                System.out.print(tempNode.value + " -> ");
                if (tempNode.next != null) {
                    tempNode = tempNode.next;
                }
            } while (tempNode != head);
        }
        System.out.println("HEAD");
    }

    public void delete(int value) {
        Node currentNode = head;
        if (head == null) {
            return;
        }
        if (currentNode.value ==  value) {
            head = head.next;
            tail.next = head;
            return;
        }
        do {
            Node n = currentNode.next;
            if (n.value == value) {
                currentNode.next = n.next;
                break;
            }
            currentNode = currentNode.next;
        } while (currentNode != head);
    }
    private static class Node {
        private int value;
        private Node next;

        Node(int value) {
            this.value = value;
        }
        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
