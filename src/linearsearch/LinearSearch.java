package linearsearch;

public class LinearSearch {
    private static int linearSearch( int arr[], int key ) {
        // loop through the numbers in arr (for loop)
            // we compare the current element in the for loop (arr[i]) with the key
                // if it is equal, we return the current index, i

        // return -1
    }

    public static void main(String[] args) {
        int arr[] = { 4, 1, 8, 9, 3, 10, 12, 5 };

        int idx;

        idx = linearSearch( arr, 10 ); // 5
        linearSearch( arr, 13 ); // -1 (means key is not an item in the array)
    }
}
