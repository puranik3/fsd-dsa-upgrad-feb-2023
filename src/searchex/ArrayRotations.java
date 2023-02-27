package searchex;

public class ArrayRotations {
    private static int numRotations( int arr[] ) {
        for( int i = 0; i < arr.length - 1; i++ ) { // go through array one-by-one
            // compare the current number with the number after it and suppose it drops...
            if( arr[i] > arr[i + 1] ) {
                return i + 1; // ...then we found the number of rotations
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int arr[] = { 15, 18, 2, 3, 6, 12 };
        System.out.println( "Number of rotations = " + numRotations( arr ) );
    }
}
