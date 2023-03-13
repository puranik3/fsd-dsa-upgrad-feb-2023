package codewars;

public class ConvertToCamelCase {
    static String toCamelCase(String s){
        boolean convertCase = false;
        String output = "";

        for( int i = 0; i < s.length(); i++ ) {
            char ch = s.charAt( i );

            if( ch == '_' || ch == '-' ) {
                convertCase = true;
            } else {
                convertCase = false;

                if( convertCase ) {
                    output = output + ( ch + "" ).toUpperCase();

                }

                output = output + ch;
            }
        }

        return output;
    }
}
