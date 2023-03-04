package searchex;

public class SearchExercises {
    /**
     * Given an array of n elements, how do you print the frequencies of  elements without using extra space.
     * Assume all elements are positive, editable and less than or equal to n.
     *
     * @param arr An array of integers where all elements are positive, editable and less than n.
     */
    public static void findFrequency(int[] arr) {
        // Step 1
        for (int i = 0; i < arr.length; i++) {
            // The array item now represents the index where it should be noted
            arr[i]--;
        }

        // Step 2
        for (int i = 0; i < arr.length; i++) {
            // arr[i] % arr.length gives the actual number whose frequency is to be noted - this is also the index at which it is to be noted (due to Step 1)!
            arr[arr[i] % arr.length] += arr.length; // any number >= arr.length may be added (say x)
        }

        // Step 3
        for (int i = 0; i < arr.length; i++) {
            // The actual number is i + 1 (1 more than current index) - this is to reverse the effect of Step 1
            // The frequency is the number of times arr.length (or x in Step 2) has been added - arr[i] / arr.length (or arr[i] / x)
            int frequency = arr[i] / arr.length;

            if( frequency != 0 ) {
                System.out.println( i + 1 + " : " + frequency + " time(s)" );
            }
        }
    }

    /**
     * The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
     *
     * @param arr An array of integers
     */
    public static int findEquilibriumIndex(int[] arr) {
        int n = arr.length;
        int mid = n / 2; // any mid can be chosen. You may choose ( n - 1 ) / 2 as well
        int leftSum = 0, rightSum = 0;

        for (int i = 0; i < mid; i++) {
            leftSum += arr[i];
        }

        for (int i = n - 1; i > mid; i--) {
            rightSum += arr[i];
        }

        if (rightSum > leftSum) {
            while (rightSum > leftSum && mid < n - 1) {
                // considering arr[mid + 1] as the prospective equilibrium index...
                rightSum -= arr[mid + 1];
                leftSum += arr[mid];
                mid++;
            }
        } else {
            while (leftSum > rightSum && mid > 0) {
                // considering arr[mid - 1] as the prospective equilibrium index...
                rightSum += arr[mid];
                leftSum -= arr[mid - 1];
                mid--;
            }
        }

        if (rightSum == leftSum) {
            return mid;
        }

        return -1;
    }

    /**
     * Given an array of n positive numbers.
     * All numbers occur an even number of times except 1 which occurs an odd number of times.
     * Find that number in O(n) time and O(1) space.
     *
     * @param
     */

    public static int oddCountNum(int[] arr) {
        int result = 0x0;

        for (int i = 0; i < arr.length; i++) {
            // ^ - bitwise exclusive OR (XOR)
            // XOR is commutative. A number that occurs an even number of times will invert the bits in result an even number of times, leaving result unaffected.
            // Thus the bits in the number that occurs an odd number of times will be the only ones left turned on in the end
            result = result ^ arr[i];
        }

        return result;
    }


    /**
     * Find the Rotation Count in Rotated Sorted array
     * Consider an array of distinct numbers sorted in increasing order.
     * The array has been rotated (clockwise) k number of times. Given such an array, find the value of k.
     */
    public static int rotationCount(int[] arr, int start, int end) {
        if (start > end) {
            return 0; // no rotations - hence rotation count is 0
        }

        if ( start == end ) {
            return start;
        }

        int mid = ( start + end ) / 2;

        if (mid < end && arr[mid + 1] < arr[mid])
            return (mid + 1);

        if (mid > start && arr[mid] < arr[mid - 1])
            return mid;

        if (arr[end] > arr[mid])
            return rotationCount(arr, start, mid - 1);

        return rotationCount(arr, mid + 1, end);
    }


    public static void main(String[] args) {
        int arr1[] = {3, 2, 1, 2, 3, 5, 6, 5, 4, 3, 5, 3};
        findFrequency(arr1);

        int arr2[] = {50, 10, 65, 5, 15, 20, 30, 25, 35};
        System.out.println("\nAn equilibrium index for arr2 is = " + findEquilibriumIndex(arr2));

        int arr3[] = {1, 2, 3, 2, 3, 1, 3};
        System.out.println("\nThe number that occurs an odd number of times is = " + oddCountNum(arr3));

        int arr4[] = {15, 18, 2, 3, 6, 12};
        System.out.println("\nNumber of rotations (clockwise) = " + rotationCount(arr4, 0 , arr4.length - 1));
    }
}
