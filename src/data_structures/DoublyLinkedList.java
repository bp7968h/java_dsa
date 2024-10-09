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

    public void insertBefore(int node_data, int data) {
        Node prev = null;
        Node current = head;
        while(current != null) {
            if (current.data == node_data) {
                Node new_node = new Node(data);
                new_node.prev = prev;
                new_node.next = current;

                if (prev != null) {
                    prev.next = new_node;
                }
                current.prev = new_node;

                if (current == head){
                    head = new_node;
                }

                return;
            }
            prev = current;
            current = current.next;
        }
        insertAtHead(data);
        return;
    }

    public void insertAfter(int node_data, int data) {
        if (head == null) {
            insertAtTail(data);
            return;
        }

        Node current = head;
        while (current != null) {
            if (current.data == node_data) {
                Node new_node = new Node(data);

                new_node.prev = current;
                new_node.next = current.next;

                if (current.next != null) {
                    current.next.prev = new_node;
                }
                current.next = new_node;

                return;
            }

            current = current.next;
        }
        insertAtTail(data);
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

    public void reverse() {
        if (head == null || head.next == null) {
            return;
        }

        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            // store next to move forward the iteration
            next = current.next;

            // update the pointer for current
            current.next = prev;
            current.prev = next;

            //move pointer forward
            prev = current;
            current = next;
        }

        head = prev;
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

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        if (head == null) {
            return 0;
        }
        int size = 0;
        Node current = head;
        while(current != null) {
            size += 1;
            current = current.next;
        }

        return size;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        if (head == null || head.next == null) {
            return head;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        return current;
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
