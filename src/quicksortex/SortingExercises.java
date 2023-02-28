package quicksortex;

import java.util.Arrays;
import java.util.Random;

public class SortingExercises {
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int partition(char[] arr, int low, int high, char p) {
        int curr = low;

        for (int i = low; i < high; i++) {
            if (arr[i] < p) {
                swap( arr, curr, i );
                curr++;
            } else if (arr[i] == p) { // this else part is unnecessary (at least if arr items are unique)
                swap( arr, i, high );
                i--;
            }
        }

        swap( arr, curr, high );

        return curr;
    }

    private static int partition( int[] arr, int low, int high ) {
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
// #################################

    /**
     * Randomized quick sort
     */

    static void setRandomizedPivot(int[] arr, int low, int high) {
        Random rand = new Random();
        int pivot = low + rand.nextInt(high - low + 1 );

        swap( arr, pivot, high );
    }

    private static int randomizedPartition( int[] arr, int low, int high ) {
        setRandomizedPivot(arr, low, high);
        return partition( arr, low, high );
    }

    private static void randomQuickSort( int[] arr, int low, int high ) {
        if( low >= high ) {
            return;
        }

        // partition and find the pivot position -> pivot function will do this
        int pp = randomizedPartition( arr, low, high );
        randomQuickSort( arr, low, pp - 1 );
        randomQuickSort( arr, pp + 1, high );
    }

    /**
     * Kth smallest element in the array
     */
    public static int kth( int[] arr, int left, int right, int k ) {
        if( k - 1 < left || k - 1 > right ) {
            throw new Error( "Problem does not make sense" );
        }

        int pivotIdx = partition(arr, left, right);

        if( pivotIdx == k - 1 ) {
            return arr[pivotIdx];
        }

        if( pivotIdx > k - 1 ) {
            return kth( arr, left, pivotIdx - 1, k );
        }

        return kth( arr, pivotIdx + 1, right, k );
    }

    /**
     * Matching Nuts and Bolts
     */
    public static void matchNutsNBolts(char[] nuts, char[] bolts, int low, int high) {
        if( low >= high ) {
            return;
        }

        int pp = partition(nuts, low, high, bolts[high]);
        partition(bolts, low, high, bolts[high]);

        matchNutsNBolts(nuts, bolts, low, pp - 1);
        matchNutsNBolts(nuts, bolts, pp + 1, high);
    }

    public static void main(String[] args) {
        char nuts[] = {'@', '#', '$', '%', '^', '&'};
        char bolts[] = {'$', '%', '&', '^', '@', '#'};

        matchNutsNBolts(nuts, bolts, 0, nuts.length - 1);

        System.out.println(Arrays.toString(nuts));
        System.out.println(Arrays.toString(bolts));

        int arr[] = {10, 7, 8, 9, 1, 5};
        System.out.println(Arrays.toString(arr));
        randomQuickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));


        int[] arr2 = { 13, 4, 6, 8, 5, 20, 27, 10, 15, 25 };
        System.out.println(kth(arr2, 0, arr2.length-1, 6));
    }
}
