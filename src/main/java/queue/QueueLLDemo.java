package main.java.queue;

import queue.QueueLL;

public class QueueLLDemo {
    private static void testEnqueue() {
        QueueLL queueLL = new QueueLL();

        queueLL.enqueue( 10 );
        queueLL.enqueue( 20 );
        queueLL.enqueue( 30 );
        queueLL.enqueue( 40 );

        queueLL.print();
    }

    private static void testDequeueEmpty() {
        System.out.println( "*** test if dequeue works well when queue is empty" );
        QueueLL queueLL = new QueueLL();

        try {
            queueLL.dequeue();
        } catch( Exception exception ) {
            System.out.println( exception.getMessage() );
        }
    }

    private static void testDequeueOneElement() {
        System.out.println( "*** test if dequeue works well when queue has only one element" );
        QueueLL queueLL = new QueueLL();

        queueLL.enqueue( 10 );

        queueLL.print();
        queueLL.dequeue();
        queueLL.print();
    }

    private static void testDequeueMultipleElements() {
        System.out.println( "*** test if dequeue works well when queue has multiple elements" );
        QueueLL queueLL = new QueueLL();

        queueLL.enqueue( 10 );
        queueLL.enqueue( 20 );
        queueLL.enqueue( 30 );

        queueLL.print();
        queueLL.dequeue();
        queueLL.print();
    }

    public static void main(String[] args) {
        testEnqueue();
        testDequeueEmpty();
        testDequeueOneElement();
        testDequeueMultipleElements();
        // EXERCISE: Write and execute test to check if size() works fine
    }
}
