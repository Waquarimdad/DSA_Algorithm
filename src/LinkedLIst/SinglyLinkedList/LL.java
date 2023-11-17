package LinkedLIst.SinglyLinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertAtFirstPosition (int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        /*
            Head always points to the first node.
         */
        head = newNode;

        if (tail == null) {
            tail = head;
        }

        size++;
    }

    public void display() {
        /*
            Changing temp will not change the head
         */
        Node tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.value + " -> ");
            tempNode = tempNode.next;
        }
        System.out.println("null");
    }

    public void insertAtLastPosition (int value) {
        if (tail == null) {
            insertAtFirstPosition(value);
            return;
        }
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void insert(int value, int index) {
        if (index == 0) {
            insertAtFirstPosition(value);
            return;
        }
        if (index == size) {
            insertAtLastPosition(value);
            return;
        }
        Node tempNode = head;
        for (int i = 1; i < index; i++) {
            tempNode = tempNode.next;
        }
        Node newNode;
        newNode = new Node(value, tempNode.next);
        tempNode.next = newNode;
        size++;
    }

    public int deleteFirstElement() {
        int value = head.value;
        head = head.next;
        if (head == null)
            tail = null;
        size--;
        return value;
    }

    public int deleteLastElement() {
        if (size <= 1) {
            return deleteFirstElement();
        }
        Node secondLastElement = get(size - 2);
        int values = tail.value;
        tail = secondLastElement;
        tail.next = null;
        return values;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirstElement();
        }
        if (index == size - 1) {
            return deleteLastElement();
        }
        Node previousNode = get(index - 1);
        int value = previousNode.next.value;
        previousNode.next = previousNode.next.next;
        return value;
    }

    public Node get(int index) {
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    public Node find(int value) {
        Node currentNode = head;
        while(currentNode != null) {
            if (currentNode.value == value) {
                return currentNode;
            }
            currentNode = currentNode.next;
        }
        return null;
    }

    /*
        insert using recursion
     */
    public void insertUsingRecursion(int value, int index) {
        if (index == 0)
            insertAtFirstPosition(value);
        if (index == size)
            insertAtLastPosition(value);
        Node lastNode = head;
        for (int i = 1; i < index; i++) {
            lastNode = lastNode.next;
        }
        Node newNode = new Node(value);
        newNode.next = lastNode.next;
        lastNode.next = newNode;
        size++;
    }

    private static class Node {
        private int value;
        private Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
