package quicksort;

import java.util.Arrays;

public class QuickSortDemo {
    private static void swap( int[] arr, int p1, int p2 ) {
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
    }

    private static int pivot( int[] arr, int low, int high ) {
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

    private static void quickSort( int[] arr, int low, int high ) {
        if( low >= high ) {
            return;
        }

        // partition and find the pivot position -> pivot function will do this
        int pp = pivot( arr, low, high );
        quickSort( arr, low, pp - 1 );
        quickSort( arr, pp + 1, high );
    }

    public static void main(String[] args) {
        int[] arr = { 4, 1, 8, 9, 3, 8, 1, 5 };

        System.out.println( Arrays.toString( arr ) );
        quickSort( arr, 0, arr.length - 1 );
        System.out.println( Arrays.toString( arr ) );
    }
}