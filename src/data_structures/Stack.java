package data_structures;

public class Stack {
    private int container[] = new int[10];
    private int tos;

    Stack() {
        tos = -1;
    }

    void push(int i) {
        if (tos == 9){
            System.out.println("Stack is full");
        } else {
            container[++tos] = i;
        }
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow");
            return 0;
        }
        
        return container[--tos]; 
    }
}
