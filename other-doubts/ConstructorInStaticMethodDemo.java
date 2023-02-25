package doubtsclearingfeb;

public class ConstructorInStaticMethodDemo {
    public int x;

    public ConstructorInStaticMethodDemo( int x ) {
        this.x = x;
    }

    private static ConstructorInStaticMethodDemo getInstance() {
        ConstructorInStaticMethodDemo instance = new ConstructorInStaticMethodDemo( 100 );

        return  instance;
    }

    public static void main(String[] args) {
        ConstructorInStaticMethodDemo instance = getInstance();
        System.out.println( instance.x );
    }
}
