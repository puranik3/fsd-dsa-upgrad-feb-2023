package binarysearch;

public class BinarySearch {
    private static int binarySearchWorker( int arr[], int key, int low, int high ) {
        // this is the base case where recursion will stop
        // since low > high -> no numbers in the array (empty array)
        // this means the key is NOT present in arr[]
        if( low > high ) {
            return -1;
        }

        // find out the mid index
        int mid = low + ( high - low ) / 2; // ( low + high ) / 2

        if( arr[mid] == key ) {
            return mid;
        }

        // they key must be in the right side of the array
        if( arr[mid] < key ) {
            return binarySearchWorker( arr, key, mid + 1, high );
        }

        if( arr[mid] > key ) {
            return binarySearchWorker( arr, key, low, mid - 1 );
        }

        // just to satisfy Java compiler
        return -1;
    }

    private static int binarySearch( int arr[], int key ) {
        return binarySearchWorker( arr, key, 0, arr.length - 1 );
    }

    public static void main(String[] args) {
        // This cannot be searched using binary search
        // int arr[] = { 4, 1, 8, 9, 3, 10, 12, 5 };

        int arr[] = { 1, 3, 4, 5, 8, 9, 10, 12 };

        int idx;

        idx = binarySearch( arr, 10 ); // 5
        if( idx == -1 ) {
            System.out.println( "Number 10 is not present" );
        } else {
            System.out.println("position of 10 = " + idx); // 6
        }

        idx = binarySearch( arr, 13 ); // -1 (means key is not an item in the array)

        if( idx == -1 ) {
            System.out.println( "Number 13 is not present" ); // -1
        } else {
            System.out.println("position of 13 = " + idx);
        }
    }
}
