package queue;

public class QueueArray {
    int[] arr = null;
    int front, rear;

    public QueueArray( int capacity ) {
        arr = new int[capacity];
        front = rear = -1; // invalid index -> queue is empty
    }

    public void enqueue( int data ) {
        if( isFull() ) {
            throw new RuntimeException( "Queue overflow" );
        }

        // we are adding the first element
        if( isEmpty() ) {
            front = rear = rear + 1;
            arr[rear] = data;
        } else {
            rear = rear + 1;
            arr[rear] = data;
        }
    }

    public int dequeue() {
        if( isEmpty() ) {
            throw new RuntimeException( "Queue underflow" );
        }

        int data = arr[front];

        if( front == rear ) { // we have only 1 element in the queue
            front = rear = -1; // we indicate the queue is empty
        } else {
            ++front;
        }

        return data;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return rear == arr.length - 1;
    }

    public int size() {
        return 0;
    }

    public void print() {
        if( !isEmpty() ) {
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " -> ");
            }
        }

        System.out.println( "null" );
    }
}
