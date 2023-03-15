package prefixpostfixexercises.exercises;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
    private static int[] stockSpan( int stockPrices[] ) {
        int span[] = new int[stockPrices.length];

        for( int i = 0; i < stockPrices.length; i++ ) {
            int cur = stockPrices[i];

            int j = i;
            int count = 0;

            while( j >= 0 && stockPrices[j] <= cur ) {
                count++;
                j--;
            }

            span[i] = count;
        }

        return span;
    }

    private static int[] stockSpanUsingStack( int stockPrices[] ) {
        int span[] = new int[stockPrices.length];
        Stack<Integer> stack = new Stack<>();

        // for the first day
        span[0] = 1;
        stack.push( 0 );

        // calculating stock span from 2nd day onwards...
        for( int i = 1; i < stockPrices.length; i++ ) {
            while( true ) {
                // the current day is the highest value we encountered so far
                if( stack.isEmpty() ) {
                    span[i] = i + 1;
                    break;
                }

                int j = stack.peek();
                int cur = stockPrices[i];

                if( stockPrices[j] <= cur ) {
                    stack.pop();
                } else {
                    span[i] = i - j;
                    break;
                }
            }

            stack.push( i );
        }

        return span;
    }

    public static void main(String[] args) {
        int stockPrices[] = { 10, 20, 25, 15, 17, 10, 30, 25, 35, 40 };

        int span[] = stockSpan( stockPrices );
        System.out.println( Arrays.toString( span ) ); // [ 1, 2, 3, 1, 2, 1, 7, 1, 9, 10 ]

        span = stockSpanUsingStack( stockPrices );
        System.out.println( Arrays.toString( span ) ); // [ 1, 2, 3, 1, 2, 1, 7, 1, 9, 10 ]
    }
}
