package stack;

import java.util.Arrays;

class StackArray {
    private int arr[];
    private int top = -1;

    public StackArray( int capacity ) {
        arr = new int[capacity];
    }

    public void push( int data ) {
        if( top == arr.length - 1 ) {
            throw new RuntimeException( "Stack overflow" );
        }

        top++;
        arr[top] = data;
    }

    public int pop() {
        if( top == -1 ) {
            throw new RuntimeException( "Stack underflow" );
        }

        int data = arr[top];
        arr[top] = 0;
        top--;
        return data;
    }

    public int peek() {
        if( top == -1 ) {
            throw new RuntimeException( "Stack underflow" );
        }

        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == arr.length - 1;
    }

    public void print() {
        System.out.println(Arrays.toString( arr ) );
        if( top == -1 ) {
            System.out.println( "Stack is empty" );
        } else {
            System.out.println("Top of stack is at position " + top + " and it is " + arr[top]);
        }
    }
}
