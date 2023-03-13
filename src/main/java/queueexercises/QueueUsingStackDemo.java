package queueexercises;

public class QueueUsingStackDemo {
    private static void testEnqueueAndDeque() {
        QueueUsingStack queue = new QueueUsingStack();

        queue.enqueue( 10 );
        queue.enqueue( 20 );
        queue.enqueue( 30 );

        int data;

        data = queue.dequeue(); // 10
        System.out.println( "Data dequeued after queueing up 10, 20, 30 = " + data );

        data = queue.dequeue(); // 20
        System.out.println( "Data dequeued second time after queueing up 10, 20, 30 = " + data );

        data = queue.dequeue(); // 30
        System.out.println( "Data dequeued second time after queueing up 10, 20, 30 = " + data );

        try {
            data = queue.dequeue();
        } catch( Exception e ) {
            if( e.getMessage().equals( "Queue underflow" ) ) {
                System.out.println( "Queue has no elements" );
            }
        }
    }

    public static void main(String[] args) {
        testEnqueueAndDeque();
    }
}
