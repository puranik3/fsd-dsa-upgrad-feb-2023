package stack;

import stack.StackArray;

public class StackDemo {
    private static void testPeek() {
        StackArray stackArray = new StackArray( 5 );

        System.out.println( "*** testPeek starts ***" );
        try {
            stackArray.peek();
        } catch( Exception e ) {
            System.out.println( e.getMessage() );
        }

        // add a few items
        stackArray.push( 10 );
        stackArray.push( 20 );
        stackArray.push( 30 );

        stackArray.print();
        System.out.println( stackArray.peek() );
        stackArray.print();

        System.out.println( "*** testPeek ends ***" );
    }

    public static void main(String[] args) {
        StackArray stackArray = new StackArray( 5 );

        try {
            stackArray.push(10);
            stackArray.push(20);
            stackArray.push(30);
            stackArray.push(40);
            // stackArray.push(50);
            // stackArray.push(60);
            int data = stackArray.pop();
            System.out.println( "Popped : " + data );
            stackArray.pop();
            stackArray.pop();
            stackArray.pop();
            stackArray.pop();
        } catch( Exception e ) {
            System.out.println( e.getMessage() );
        }

        // System.out.println( "See, I am continuing execution" );
        stackArray.print();

        testPeek();
    }
}
