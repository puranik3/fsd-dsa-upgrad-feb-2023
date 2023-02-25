package binarysearch;

public class BinarySearchIterative {
    private static int binarySearchWorker( int arr[], int key, int low, int high ) {
        // as long as the portion of the array we are searching within has some item(s)...
        while( low <= high ) {
            // find out the mid index
            int mid = low + ( high - low ) / 2; // ( low + high ) / 2

            if( arr[mid] == key ) {
                return mid;
            }

            // they ke must be in the right side of the array
            if( arr[mid] < key ) {
                // for the next iteration of the while loop, we reset low
                low = mid + 1;
                // high = high; // no change is needed for high
            }

            if( arr[mid] > key ) {
                high = mid - 1;
                // low = low;
            }
        }

        // if we have run out of items in the array, the key is not present in the array, and we indicate by returning -1 for index
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
