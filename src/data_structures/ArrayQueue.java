package data_structures;

public class ArrayQueue {
    int[] queue;
    int front, rear, capacity;

    ArrayQueue(int cap) {
        queue = new int[cap];
        front = 0;
        capacity = cap;
        rear = -1;
    }

    void enqueue(int data) {
        if ( rear == capacity - 1) {
            System.out.println("Queue is full");
            return;
        }

        queue[++rear] = data;
    }

    void dequeue() {
        if (front > rear) {
            System.out.println("Queue is empty");
            return;
        }

        int result = queue[front];

        for (int i=0; i<capacity; i++) {
            queue[i] = queue[i+1];
        }

        rear--;

        System.out.println("Removed " +result+ " from queue");
    }

    Integer peek() {
        if (front > rear){
            System.out.println("Queue is empty");
            return null;
        }

        return Integer.valueOf(queue[front]);
    }

    boolean isEmpty() {
        return front > rear;
    }

    boolean isFull() {
        return rear == capacity - 1;
    }
}