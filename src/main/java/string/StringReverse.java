package string;

class StringReverse {
    public static String reverse(String str) {
        String reverseStr = "";

        for( int i = str.length() - 1; i >= 0; i-- ) {
            reverseStr = reverseStr + str.charAt( i );
        }

        return reverseStr;
    }

    public static void main(String[] args) {
        String str = "Hello world";
        String strReverse = reverse( str ); // "dlrow olleH";
        System.out.println( strReverse );
    }
}
