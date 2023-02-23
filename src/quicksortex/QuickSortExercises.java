package quicksortex;

import java.util.Arrays;
import java.util.Random;

public class QuickSortExercises {
    // Generate a random integer between low and high
    // getRandomNumber( 10, 15 ) -> 10 / 15 / 11 / 12 / 13/ 14
    private static int getRandomNumber( int low, int high ) {
        Random rand = new Random();

        // rand.nextInt( high + 1 - low ) -> [ 0 -> high - low ]
        // low + [ 0 -> high - low ] -> [ low, high - low + low ] = [ low, high ]
        int num = low + rand.nextInt( high + 1 - low ); // 0 - (high - 1)
        return num;
    }

    private static void swap( int[] arr, int p1, int p2 ) {
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
    }

    private static int pivot( int[] arr, int low, int high ) {
        int pivotIdx = getRandomNumber( low, high );
        swap( arr, pivotIdx, high ); // we swap the pivot with the last number

        int p = arr[high]; // p is the value of the last (high) item
        int curr = low; // where do we want to put a lower number when we loop through the array and find one

        for( int i = low; i < high; i++ ) {
            if( arr[i] < p ) {
                // swap arr[curr] and arr[i]
                swap( arr, curr, i );
                curr++;
            }
        }

        // get the pivot to its correct position
        swap( arr, curr, high );

        // return the pivot's position
        return curr;
    }

    private static void randomizedQuickSort( int[] arr, int low, int high ) {
        if( low >= high ) {
            return;
        }

        // partition and find the pivot position -> pivot function will do this
        int pp = pivot( arr, low, high );
        randomizedQuickSort( arr, low, pp - 1 );
        randomizedQuickSort( arr, pp + 1, high );
    }

    private static int kth( int arr[], int low, int high, int k ) {
        if( low >= high ) {
            return -1;
        }

        int pp = pivot( arr, low, high );

        // we found the kth smallest - it is the current pivot
        if( pp == k - 1 ) {
            return arr[pp];
        }

        if( pp < k - 1 ) {
            return kth( arr, pp + 1, high, k );
        }

        return kth( arr, low, pp - 1, k );
    }

    public static void main(String[] args) {
        System.out.println( getRandomNumber( 2, 5 ) );

        int[] arr = { 4, 1, 8, 9, 3, 8, 1, 5 };

        System.out.println( Arrays.toString( arr ) );
        randomizedQuickSort( arr, 0, arr.length - 1 );
        System.out.println( Arrays.toString( arr ) );

        int arr2[] = { 4, 1, 8, 9, 3, 13, 11, 5 };

        int kthSmallest = kth( arr2, 0, arr2.length - 1, 6 );
        System.out.println( kthSmallest );

    }
}
