package stack;

public class StackLLDemo {
    private static void testPush() {
        System.out.println( "*** testPush ***" );
        StackLL stack = new StackLL();

        stack.push( 10 );
        stack.push( 20 );

        stack.print();

        System.out.println( "\n\n" );
    }

    private static void testPop() {
        System.out.println( "*** testPop ***" );
        StackLL stack = new StackLL();

        stack.push( 10 );
        stack.push( 20 );

        stack.print();

        stack.pop();

        stack.print();
    }

    public static void main(String[] args) {
        testPush();
        testPop();
    }
}
