package stack;

public class StackLL {
    private ListNode top = null; // Shall refer to the "top" of the stack
    private int count = 0;

    public void push( int data ) {
        ListNode node = new ListNode( data );

        node.setNext( top );
        top = node;
        ++count;
    }

    public int pop() {
        if( top == null ) {
            throw new RuntimeException( "Stack underflow" );
        }

        int data = top.getData();
        top = top.getNext();
        --count;
        return data;
    }

    public int peek() {
        if( top == null ) {
            throw new RuntimeException( "Stack underflow" );
        }

        return top.getData();
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return count;
    }

    public void print() {
        ListNode cur = top;

        while( cur != null ) {
            System.out.println( cur.getData() );
            cur = cur.getNext();
        }
    }
}
