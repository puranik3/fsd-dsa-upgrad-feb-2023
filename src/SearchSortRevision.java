public class SearchSortRevision {
    private static int sqrt( int num ) {
        int low = 1, high = num, mid = 0;

        while( low <= high ) {
            mid = ( low + high ) / 2;

            if( mid * mid == num ) {
                return mid;
            }

            if( mid * mid > num ) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return mid;
    }

    private static int getUnitsProducedInTime( int arr[], int time ) {
        // time / arr[0] + time / arr[1] + time / arr[2]

        int result = 0;
        for( int i = 0; i < arr.length; i++ ) {
            result += time / arr[i];
        }

        return result;
    }

    private static int minTime( int[] arr, int n ) {
        // find the max manufacturing time
        int max = 0;
        for( int i = 0; i < arr.length; i++ ) {
            if( arr[i] > max ) {
                max = arr[i];
            }
        }

        int low = 1, high = n * max;

        while( low < high ) {
            int mid = ( low + high ) / 2;

            int units = getUnitsProducedInTime( arr, mid );

//            if( units == n ) {
//                return mid;
//            }

            if( units < n ) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return high;
    }

    public static void main(String[] args) {
        int num = 280;
        System.out.println( "Square root (integer part) of 280 is = " + sqrt( 280 ) );

        int[] mTimes = { 1, 3, 2 };
        int target = 11;
        System.out.println( minTime( mTimes, target ) );
    }
}
