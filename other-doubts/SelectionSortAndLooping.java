package doubtsclearingfeb;
public class SelectionSortAndLooping {
    // ascending order sort
    private static void sort( int arr[] ) {
        // Select the 1st lowest
        // go through the entire array and pick up the lowest and put it in the first place
    }

//    *
//    * *
//    * * *
//    * * * *
    private static void printStars() {
        for( int i = 1; i <= 4; i++ ) {
            String str = "";

            for( int j = 1; j <= i; j++ ) {
                str = str + "* ";
            }

            System.out.println( str );
        }
    }

    public static void main(String[] args) {
        int[] arr = { 10, 30, 50, 20, 5, 15, 35, 25 };
//        sort( arr );
        printStars();
    }
}

// Fibonacci
// 0, 1, 1, 2, 3, 5, 8, ....
// Write a function that generates the first 20 Fibonacci number


// Print this
//1
//1 3
//1 3 5
//1 3 5 7
//.
//.
//.
// 1 3 5 7 ..... 99