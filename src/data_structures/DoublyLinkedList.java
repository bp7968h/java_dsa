package data_structures;

public class DoublyLinkedList {
    Node head;

    DoublyLinkedList() {
        this.head = null;
    }

    public Node search(int data) {
        Node current = head;
        while(current != null) {
            if (current.data == data) {
                return current;
            }
            current = current.next;
        }

        return null;
    }

    public void insertAtHead(int data) {
        Node new_head = new Node(data);
        if (head == null) {
            head = new_head;
            return;
        }

        head.prev = new_head;
        new_head.next = head;
        head = new_head;
        return;
    }

    public void removeHead() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }

        head.next.prev = null;
        head = head.next;

        return;
    }

    public void insertAtTail(int data) {
        Node new_tail = new Node(data);
        if (head == null) {
            head = new_tail;
            return;
        }
        Node current = head;
        while(current.next != null) {
            current = current.next;
        }

        current.next = new_tail;
        new_tail.prev = current;
        return;
    }

    public void removeTail() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }

        Node current = head;
        while(current.next != null) {
            current = current.next;
        }

        current.prev.next = null;
        return;
    }

    public void display() {
        System.out.print("Null <-> ");
        Node current = head;
        while(current != null) {
            System.out.print(current.data);
            System.out.print(" <-> ");
            current = current.next;
        }
        System.out.println("Null");
    }


    private class Node {
        Node prev;
        int data;
        Node next;

        Node(int data) {
            this.prev = null;
            this.data = data;
            this.next = null;
        }
    }
}
