package prefixpostfix;

import java.util.Arrays;
import java.util.Stack;

public class PostfixEvaluation {
    private static double evaluate( String expr ) {
        String[] tokens = expr.split( " " ); // { "1", "2", "3", "*", "+" }
        System.out.println( Arrays.toString( tokens ) );

        Stack<Double> stack = new Stack<>();

        for( int i = 0; i < tokens.length; ++i ) {
            String token = tokens[i];

            // current token is an operator
            if( token.equals( "+" ) || token.equals( "-" ) || token.equals( "*" ) || token.equals( "/" ) ) {
                // pop 2 items (op1 operation op2)
                // lhs op rhs
                Double op2 = stack.pop(); // rhs operand
                Double op1 = stack.pop();  // lhs operand

                switch( token ) {
                    case "+":
                        stack.push( op1 + op2 );
                        break;
                    case "-":
                        stack.push( op1 - op2 );
                        break;
                    case "*":
                        stack.push( op1 * op2 );
                        break;
                    case "/":
                        stack.push( op1 / op2 );
                        break;
                }
            } else { // current token is a number
                Double value = Double.parseDouble( token ); // "3" -> 3.0D
                stack.push( value );
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String expr = "1 2 3 * +"; // 1 + 2 * 3
        System.out.println( evaluate( expr ) ); // 7
    }
}
