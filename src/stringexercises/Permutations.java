package stringexercises;
public class Permutations {
    private static String swap( String str, int x, int y ) {
        char[] charStr = str.toCharArray(); // { 'A', 'B', 'C' }

        char temp = charStr[x];
        charStr[x] = charStr[y];
        charStr[y] = temp;

        // convert char array back to a new String
        return new String( charStr );
    }

    private static void permute( String str, int start, int end ) {
        if( start > end ) { // all spots in the string have been chosen...
            System.out.println( str ); // ...so lets print it
            return;
        }

        for( int i = start; i <= end; i++ ) {
            // let us assume we are choosing character at i for the first spot
            str = swap( str, start, i );
            permute( str, start + 1, end );
            // System.out.println( str );
            str = swap( str, start, i );
        }
    }

    public static void main(String[] args) {
        String str = "ABC";

        // checking if swap returns a new string with swapped characters
        // System.out.println( swap( str, 0, 2 ) ); // "CBA"

        permute( str, 0, str.length() - 1 );
    }
}
