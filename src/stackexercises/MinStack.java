package stackexercises;

import java.util.Stack;

public class MinStack {
    Stack<Integer> st = new Stack();
    Stack<Integer> minSt = new Stack();

    public void push( int data ) {
        st.push( data );

        if( minSt.isEmpty() ) {
            minSt.push( data );
        } else {
            if( data <= minSt.peek() ) {
                minSt.push( data );
            }
        }
    }

    public int pop() {
        int data = st.pop();

        if( data == minSt.peek() ) {
            minSt.pop();
        }

        return data;
    }

    public int peek() {
        return st.peek();
    }

    public boolean isEmpty() {
        return st.isEmpty();
    }

    public int min() {
        return minSt.peek();
    }

    public String toString() {
        return st.toString();
    }
}
