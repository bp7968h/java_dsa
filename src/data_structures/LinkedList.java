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
}

class Node {
    int data;
    Node next;

    Node (int data) {
        this.data = data;
        this.next = null;
    }
}
