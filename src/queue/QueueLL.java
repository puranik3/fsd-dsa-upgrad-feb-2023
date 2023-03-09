package queue;

public class QueueLL {
    private ListNode rear = null;
    private ListNode front = null;
    private int count = 0;

    public void enqueue( int data ) {
        if( isEmpty() ) {
            ListNode node = new ListNode( data );
            front = rear = node;
            return;
        } else {
            ListNode node = new ListNode( data );
            rear.setNext( node );
            rear = node;
        }

        ++count;
    }

    public int dequeue() {
        if( isEmpty() ) {
            throw new RuntimeException( "Queue underflow" );
        }

        int data = front.getData();

        // queue has exactly one item
        if( front == rear ) {
            front = rear = null;
        } else {
            // queue has more than 1 item
            front = front.getNext();
        }

        --count;

        return data;
    }

    public boolean isEmpty() {
//        if( front == null ) // if cond is true -> true; if cond is false -> false
//            return true;
//        else
//            return false;
        return front == null;
    }

    public int size() {
        return count;
    }

    public void print() {
        ListNode curNode = front;

        while( curNode != null ) {
            System.out.print( curNode.getData() + " -> " );
            curNode = curNode.getNext();
        }

        System.out.println( "null" );
    }
}
