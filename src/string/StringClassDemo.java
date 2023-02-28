package string;

import java.util.Arrays;

public class StringClassDemo {
    public static void main(String[] args) {
        String str = new String( "Hello world" );
        String str2 = str;
        System.out.println( "Number of characters in \"Hello world\" is " + str.length() );

        // string is immutable -> therefore str WILL NOT change
        // String replacedStr = str.replace( "l", "L" );
        // System.out.println( "returned by replace() = " + replacedStr );

        str = str.replace( "l", "L" );
        System.out.println( "str after replace() = " + str );
        System.out.println( "str2 = " + str2 );

        System.out.println( "Hello world".indexOf( "l" ) ); // 2
        System.out.println( "Hello world".indexOf( "l", 3 ) ); // 3
        System.out.println( "Hello world".indexOf( "l", 4 ) ); // 9
        System.out.println( "Hello world".indexOf( "a" ) ); // -1 (not there)

        System.out.println( "Hello world".charAt( 4 ) ); // 'o'
        int i = 6;
        System.out.println( "Hello world".charAt( i ) ); // 'w'

        System.out.println( "*** compareTo() ***" );
        System.out.println( "Comparing Adam and Ahmad : " + "Adam".compareTo( "Ahmad" ) );
        System.out.println( "Comparing Tiny and Tina : " + "Tiny".compareTo( "Tina" ) );
        // str1.equals( str2 ) -> true / false
        System.out.println( "Comparing abcd and abcd : " + "abcd".compareTo( "abcd" ) );
        System.out.println( "*******************" );

        System.out.println( "*** contains() ***" );
        System.out.println( "Hello world".contains( "world" ) ); // true
        System.out.println( "Hello world".contains( "w" ) ); // true
        System.out.println( "Hello world".contains( "a" ) ); // false
        System.out.println( "******************" );

        System.out.println( "*** toUpperCase() / toLowerCase() ***" );
        String strUpperCase = str.toUpperCase();
        System.out.println( "strUpperCase = " + strUpperCase );
        System.out.println( "str = " + str );
        System.out.println( "*************************************" );

        // we want to remove leading and trailing spaces
        System.out.println( "*** trim() ***" );
        String email = "   john.doe@example.com   ";
        String trimmedEmail = email.trim();
        System.out.println( "email = " + email );
        System.out.println( "trimmedEmail = " + trimmedEmail );
        System.out.println( "**************" );

        System.out.println( "*** toCharArray() ***" );
        char strChars[] = "Hello".toCharArray();

        for( i = 0; i < strChars.length; i++ ) {
            System.out.println( strChars[i] );
        }

        for( i = 0; i < str.length(); i++ ) {
            System.out.println( str.charAt( i ) );
        }


    }
}