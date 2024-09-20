package data_structures;

public class Stack {
    private int container[];
    private int tos;

    Stack(int length) {
        this.container = new int[length];
        this.tos = -1;
    }

    void push(int i) {
        if (tos == container.length - 1){
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
