package data_structures;

public class Main {
    public static void main(String[] args) {

        PriorityQueue q = new PriorityQueue();

        q.enqueue(1);
        q.enqueue(2);
        // q.display();
        q.enqueue(3,1);
        q.enqueue(4);
        q.enqueue(5,3);
        q.enqueue(6, 2);
        q.enqueue(7,2);
        // q.display();

        // DoublyLinkedList list = new DoublyLinkedList();
        

        // list.insertAtHead(1);
        // list.insertAtTail(2);
        // list.insertAtTail(3);
        // list.insertAtTail(4);
        // list.removeHead();
        // list.removeTail();
        // list.insertAfter(2, 5);
        // list.insertBefore(1, 0);
        // list.reverse();
        // list.display();

        // LinkedQueue q = new LinkedQueue();
        // q.dequeue();
        // q.enqueue(1);
        // q.enqueue(2);
        // q.display();
        // q.dequeue();
        // q.peek();
        // q.dequeue();
        // q.dequeue();


    }
}
