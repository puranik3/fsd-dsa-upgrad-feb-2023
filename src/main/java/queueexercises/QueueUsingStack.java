package queueexercises;

import java.util.Stack;

public class QueueUsingStack {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void enqueue( int data ) {
        stack1.push( data );
    }

    public int dequeue() {
        if( stack1.isEmpty() ) {
            throw new RuntimeException( "Queue underflow" );
        }

        // keep on popping from stack1 and pushing to stack2
        while( stack1.isEmpty() == false ) {
            int d = stack1.pop();
            stack2.push( d );
        }

        // pop form stack2 - that is the data to be returned
        int result = stack2.pop();

        // keep on popping from stack2 and pushing to stack1
        while( stack2.isEmpty() == false ) {
            int d = stack2.pop();
            stack1.push( d );
        }

        return result;
    }

    public boolean isEmpty() {
        return stack1.isEmpty();
    }
}
