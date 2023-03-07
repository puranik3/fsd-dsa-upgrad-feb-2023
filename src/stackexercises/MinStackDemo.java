package stackexercises;

public class MinStackDemo {
    public static void main(String[] args) {
        MinStack st = new MinStack();

        st.push( 40 );
        st.push( 90 );
        st.push( 20 );
        st.push( 70 );
        st.push( 50 );

        System.out.println( st ); // [ 40, 90, 20, 70, 50 ]
        System.out.println( st.min() ); // 20

        st.pop();
        st.pop();
        st.pop();

        System.out.println( st ); // [ 40, 90 ]
        System.out.println( st.min() ); // 40
    }
}
