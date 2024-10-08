package data_structures;

public class SinglyLinkedList {
    private Node head;

    SinglyLinkedList() {
        this.head = null;
    }

    public void addNode(int data) {
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

    public void deleteNodeWithValue(int data) {
        if (head == null) {
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node prev = head;
        Node current = head.next;
        while (current != null) {
            if (current.data == data) {
                prev.next = current.next;
                return;
            }
            prev = current;
            current = current.next;
        }
        return;
    }

    public void addNodeAtHead(int data) {
        Node new_head = new Node(data);
        new_head.next = head;
        head = new_head;
    }

    public void deleteNodeAtHead() {
        if (head == null) {
            return;
        }

        head = head.next;
        return;
    }

    public void addNodeAtTail(int data) {
        if (head == null) {
            addNodeAtHead(data);
            return;
        }
        Node current = head;
        while(current.next != null) {
            current = current.next;
        }
        Node new_tail = new Node(data);
        current.next = new_tail;
        return;
    }

    public void deleteNodeAtTail() {
        if (head == null) {
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        return;
    }

    public void addNodeAtPosition(int data, int position) {
        if (position < 0) {
            System.out.println("Invalid position");
            return;
        }

        if (head == null) {
            if (position == 0) {
                addNodeAtHead(data); // Add at the beginning if position is 0
            } else {
                System.out.println("Position out of bounds");
            }
            return;
        }

        if (position == 0) {
            addNodeAtHead(data);
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

    public Node findMiddle() {
        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return head;
        }

        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public void reverse() {
        if (head == null || head.next == null) {
            return;
        }

        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            //save next conditionto move forward
            next = current.next;

            current.next = prev;

            prev = current;
            current = next;
        }
        head = prev;
    }

    public boolean isCyclic() {
        if (head == null || head.next == null) {
            return false;
        }

        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        if (head == null) {
            return 0;
        }

        int size = 0;
        Node current = head;
        while (current != null) {
            size += 1;
            current = current.next;
        }
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void clear() {
        head = null;
        return;
    }

    public void display() {
        System.out.print("Null -> ");
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            System.out.print(" -> ");
            current = current.next;
        }
        System.out.println("Null");
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
