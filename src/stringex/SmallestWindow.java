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

    public static void main(String[] args) {
        String str = "aabcbcdbca"; // in string pool

        // str.equals( "aabcbcdbca" ) // in string pool -> the string from the previous line is used again
        new String( "aabcbcdbca" ); // NOT in string pool

        String smallestWindowStr = smallestWindow( str );
        System.out.println( smallestWindowStr ); // "dbca"

        //"hello world wordhelow" // "wordhelow"
    }
}
