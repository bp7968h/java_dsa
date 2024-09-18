package data_structures;

public class LinkedList {
    Node head;

    LinkedList() {
        this.head = null;
    }

    void addNode(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node temp_node = head;

            while (temp_node.next != null) {
                temp_node = temp_node.next;
            }

            temp_node.next = new Node(data);
        }
    }

    void addNodeAtBeginning(int data) {
        Node new_head = new Node(data);
        new_head.next = head;
        head = new_head;
    }

    void addNodeAtPosition(int data, int position) {
        if (position < 0) {
            System.out.println("Invalid position");
            return;
        }

        if (head == null) {
            if (position == 0) {
                addNodeAtBeginning(data); // Add at the beginning if position is 0
            } else {
                System.out.println("Position out of bounds");
            }
            return;
        }

        if (position == 0) {
            addNodeAtBeginning(data);
            return;
        }

        Node temp = head;
        int count = 0;

        while (temp != null && count < position - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null) {
            System.out.println("Position out of bounds");
        } else {
            // Insert the new node at the desired position
            Node newNode = new Node(data);
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
