package main.java.queue;

import queue.QueueArray;

public class QueueArrayDemo {
    private static void testEnqueue() {
        QueueArray queueArray = new QueueArray( 3 );

        queueArray.enqueue( 10 );
        queueArray.enqueue( 20 );
        queueArray.enqueue( 30 );

        queueArray.print();
    }

    private static void testEnqueueWhenQueueIsFull() {
        QueueArray queueArray = new QueueArray( 3 );

        try {
            queueArray.enqueue(10);
            queueArray.enqueue(20);
            queueArray.enqueue(30);

            queueArray.enqueue(40);
        } catch( Exception exception ) {
            System.out.println( exception.getMessage() );
        }

        queueArray.print();
    }

    private static void testDequeueEmpty() {
        QueueArray queueArray = new QueueArray( 3 );

        try {
            queueArray.dequeue();
        } catch( Exception exception ) {
            System.out.println( exception.getMessage() );
        }
    }

    private static void testDequeueOneElement() {
        QueueArray queueArray = new QueueArray( 3 );

        queueArray.enqueue( 10 );

        queueArray.print();
        queueArray.dequeue();
        queueArray.print();
    }

    private static void testDequeueMultipleElements() {
        // arrange
        QueueArray queueArray = new QueueArray( 3 );

        queueArray.enqueue( 10 );
        queueArray.enqueue( 20 );

        // act
        int data = queueArray.dequeue();

        // assertion
        System.out.println( "Item which was dequeued = " + data );

        queueArray.print(); // 20 -> null

    }

    public static void main(String[] args) {
        testEnqueue();
        testEnqueueWhenQueueIsFull();

        testDequeueEmpty();
        testDequeueOneElement();

        // EXERCISE: Implement this test
        testDequeueMultipleElements();
    }
}
