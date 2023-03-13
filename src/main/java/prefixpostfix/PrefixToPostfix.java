package prefixpostfix;

import java.util.Arrays;
import java.util.Stack;

public class PrefixToPostfix {
    private static String evaluate( String expr ) {
        String[] tokens = expr.split( " " ); // { "+", "1", "*", "2", "3" }
        System.out.println( Arrays.toString( tokens ) );

        Stack<String> stack = new Stack<>();

        for( int i = tokens.length - 1; i >= 0; --i ) {
            String token = tokens[i];

            // current token is an operator
            if( token.equals( "+" ) || token.equals( "-" ) || token.equals( "*" ) || token.equals( "/" ) ) {
                // pop 2 items (op1 operation op2)
                String op1 = stack.pop();
                String op2 = stack.pop();

                stack.push( op1 + " " + op2 + " " + token ); // we push the postfix form of the expression
            } else { // current token is a number
                stack.push( token );
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String expr = "+ 1 * 2 3"; // postfix form is "1 2 3 * +"
        System.out.println( evaluate( expr ) );
    }
}
