package string;

public class Palindrome {
    private static boolean palindrome( String str ) {
        String reverseStr = StringReverse.reverse( str );

        // System.out.println( str );
        // System.out.println( reverseStr );

        return str.equals( reverseStr );
    }

    public static void main(String[] args) {
        String str1 = "madam";
        System.out.println( palindrome( str1 ) ); // true

        String str2 = "adam";
        System.out.println( palindrome( str2 ) ); // false
    }
}
