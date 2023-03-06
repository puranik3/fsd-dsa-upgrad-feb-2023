package stringex;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SmallestWindow {
    private static String smallestWindow( String str ) {
        // create a Map
        Map map = new HashMap<Character, Integer>();

        // The keys in the map will be the set of characters in str
        for( int i = 0; i < str.length(); i++ ) {
            map.put( str.charAt( i ), 1 );
        }

        System.out.println( map );

        int distCount = map.size(); // 4 (number of entries in the map)
        int smallestWindowSize = str.length();
        String smallestWindowStr = str;

        Map mapWindow = null;


        // given a window (start and end is given) -> check if it contains all the keys
        for( int i = 0; i < str.length(); i++ ) { // i -> where window starts
            for (int j = i; j < str.length(); j++) { // j -> where window ends
                mapWindow = new HashMap<Character, Integer>();

                for (int k = i; k <= j; k++) {
                    char ch = str.charAt(k);

                    mapWindow.put(ch, 1);
                }

                if (map.size() == mapWindow.size()) {
                    System.out.println("Window i = " + i + " , j = " + j + " has all characters");

                    int currentWindowSize = j - i + 1;

                    if( currentWindowSize < smallestWindowSize ) {
                        smallestWindowSize = currentWindowSize;
                        smallestWindowStr = str.substring( i, j + 1 );
                    }
                }
            }
        }

        System.out.println( smallestWindowSize + " : " + smallestWindowStr );

        return smallestWindowStr;
    }

    // Alternative solution using same idea but an array instead of a Map - https://www.geeksforgeeks.org/smallest-window-contains-characters-string/
    private static String smallestWindowEfficient( String str ) {
        // map maintains the index at which a character was found the last time
        Map<Character, Integer> map = new HashMap();
        int cwStart = 0, swStart = 0, swEnd = 0;

        for( int i = 0; i < str.length(); i++ ) {
            char ch = str.charAt( i );

            // expand the window if this is the first time a character is encountered...
            if( map.get( ch ) == null ) {
                map.put( ch, i );
                swEnd = i;
            } else { // ...else simply update the last found index for a character, and update current window based on the previous window
                map.put(ch, i);

                // move cwStart to the right as long as the leading characters do not appear later on in the current window
                while (map.get(str.charAt(cwStart)) != cwStart) {
                    cwStart++;
                }

                // change smallest window to current window if needed
                if (i - cwStart < swEnd - swStart) {
                    swStart = cwStart;
                    swEnd = i;
                }
            }
        }

        return str.substring( swStart, swEnd + 1 );
    }

    public static void main(String[] args) {
        String str = "aabcbcdbca"; // in string pool

        // str.equals( "aabcbcdbca" ) // in string pool -> the string from the previous line is used again
        new String( "aabcbcdbca" ); // NOT in string pool

        String smallestWindowStr;

        smallestWindowStr = smallestWindow( str );
        System.out.println( "Smallest window = " + smallestWindowStr ); // "dbca"

        smallestWindowStr = smallestWindowEfficient( str );
        System.out.println( "Smallest window = " + smallestWindowStr ); // "dbca"

        //"hello world wordhelow" // "wordhelow"
    }
}
