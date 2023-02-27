package searchex;

public class EquilibriumIndex {
    private static int getEquilibriumIndex( int arr[] ) {
        // find mid
        int mid = arr.length / 2;

        // calculate lSum, rSum
        int lSum = 0, rSum = 0;

        for( int i = 0; i < mid; i++ ) {
            lSum += arr[i];
        }

        for( int i = mid + 1; i < arr.length; i++ ) {
            rSum += arr[i];
        }

        // if equal then return mid
        if( lSum == rSum ) {
            return mid;
        }

        if( lSum > rSum ) {
            while (lSum > rSum && mid > 0) {
                lSum = lSum - arr[mid - 1]; // remove the last number in the current left side array
                rSum = rSum + arr[mid];
                mid--; // new mid is to left of current mid
            }
        } else { // rSum > lSum
            while(rSum > lSum && mid < arr.length - 1) {
                lSum = lSum + arr[mid];
                rSum = rSum - arr[mid + 1];
                mid++;
            }
        }

        if( lSum == rSum ) {
            return mid;
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 50, 10, 65, 5, 15, 20, 30, 25, 35 };
        int eqIdx = getEquilibriumIndex( arr );
        System.out.println( "Equilibrium index is " + eqIdx );
    }
}
