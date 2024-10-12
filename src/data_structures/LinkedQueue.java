package data_structures;

public class LinkedQueue {
    Node front;
    Node rear;

    LinkedQueue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(int data) {
        Node new_node = new Node(data);
        if (is_empty()) {
            front = new_node;
            rear = new_node;
            return;
        }

        rear.next = new_node;
        rear = new_node;
        return;
    }

    public void dequeue() {
        if (is_empty()) {
            System.out.println("Queue is empty");
            return;
        }

        Node removed_node = front;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        System.out.println("Dequeued " + removed_node.data);
        return;
    }

    public void peek() {
        if (is_empty()) {
            System.out.println("Queue is empty");
        }
        System.out.println("Front " + front.data);
        return;
    }

    public boolean is_empty() {
        return front == null && rear == null;
    }

    public void display() {
        if (is_empty()) {
            System.out.println("[]");
            return;
        }
        
        System.out.print("[");
        Node current = front;
        while( current != null ) {
            System.out.print(current.data);
            if (current != rear) {
                System.out.print(", ");
            }
            current = current.next;
        }
        System.out.println("]");
        return;
    }

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}