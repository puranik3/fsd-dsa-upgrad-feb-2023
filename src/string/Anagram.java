package string;

import java.util.Arrays;

public class Anagram {
    private static boolean isAnagram( String str1, String str2 ) {
        // return true; // or false
        char char1[] =  str1.toCharArray();
        Arrays.sort( char1 ); // { 'a', 'a', 'b', ... }
        String sortedStr1 = new String( char1 );

        return true;
    }

    public static void main(String[] args) {
        String str1 = "saurabh", str2 = "suarbha";
        System.out.println( isAnagram( str1, str2 ) ); // true

        System.out.println( isAnagram( "late", "fate" ) ); // false
    }
}
