package data_structures;

public class PriorityQueue {
    Node front;
    Node rear;

    PriorityQueue() {
        this.front = null;
    }

    public void enqueue(int data) {
        Node new_node = new Node(data);
        if (is_empty()) {
            front = new_node;
            return;
        }

        Node current = front;
        while (current.next != null) {
            current = current.next;
        }

        current.next = new_node;
        display();
    }

    public void enqueue(int data, int priority) {
        Node new_node = new Node(data, priority);
        if (is_empty()) {
            front = new_node;
            display();
            return;
        }

        if (new_node.priority > front.priority) {
            new_node.next = front;
            front = new_node;
            display();
            return;
        }

        Node current = front;
        while (current.next != null && current.next.priority >= new_node.priority) {
            current = current.next;
        }

        

        new_node.next = current.next;
        current.next = new_node;

        display();
        return;
    }

    public void dequeue() {
        if (is_empty()) {
            System.out.println("Empty queue");
            return;
        }

        Node dequeued_node = front;
        front = front.next;

        System.out.println("Dequeued " + dequeued_node.data);
        return;
    }

    public void display() {
        if (is_empty()) {
            System.out.println("[]");
            return;
        }
        
        System.out.print("[");
        Node current = front;
        while( current != null ) {
            System.out.print(current.data + ":" + current.priority);
            if (current.next != null) {
                System.out.print(", ");
            }
            current = current.next;
        }
        System.out.println("]");
        return;
    }

    public boolean is_empty() {
        return front == null;
    }
    

    private class Node {
        int data;
        int priority;
        Node next;

        Node(int data) {
            this.data = data;
            this.priority = 0;
            this.next = null;
        }

        Node(int data, int priority) {
            this.data = data;
            this.priority = priority;
            this.next = null;
        }
    }
}
