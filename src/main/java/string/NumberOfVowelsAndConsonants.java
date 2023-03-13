package string;

public class NumberOfVowelsAndConsonants {
    // for str -> "Hello world", it prints 3 Vowels ('a', 'e', 'i', 'o', 'u') and 7 consonants
    private static void printNumVowelsAndConsonants( String str ) {
        str = str.toLowerCase();
        int vCount = 0, cCount = 0;

        for( int i = 0; i < str.length(); i++ ) {
            char cur = str.charAt( i );

            if( cur == 'a' || cur == 'e' || cur == 'i' || cur == 'o' || cur == 'u' ) {
                vCount++;
            } else {
                if( cur != ' ' ) {
                    cCount++;
                }
            }
        }

        System.out.println( "vowel count is " + vCount );
        System.out.println( "consonant count is " + cCount );
    }

    public static void main(String[] args) {
        String str = "Hello world";
        printNumVowelsAndConsonants( str );
    }
}
