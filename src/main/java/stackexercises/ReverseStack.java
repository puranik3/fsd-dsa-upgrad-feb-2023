package stackexercises;

import java.util.Stack;

public class ReverseStack {
    private static void insertBottom( Stack<Integer> stack, int data ) {
        if( stack.isEmpty() ) {
            stack.push( data );
            return;
        }

        int d = stack.pop();
        insertBottom( stack, data );
        stack.push( d );
    }

    private static void reverse( Stack<Integer> stack ) {
        if( stack.isEmpty() ) {
            return;
        }

        int d = stack.pop();
        reverse( stack );
        insertBottom( stack, d );
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();

        stack.push( 1 );
        stack.push( 2 );
        stack.push( 3 );
        stack.push( 4 );

        System.out.println( stack );
        System.out.println( "Stack top is " + stack.peek() );

        // insertBottom( stack, 4 ); [ 5, 1, 2, 3, 4 ]
        reverse( stack ); // [ 4, 3, 2, 1 ]

        System.out.println( stack );
        System.out.println( "Stack top is " + stack.peek() );
    }
}
