package prefixpostfixexercises.exercises;

public class Celebrity {
    private static boolean knows( int[][] party, int a, int b ) {
        return party[a][b] == 1;
    }

    private static int getCelebrity( int[][] party ) {
        for( int col = 0; col < party.length; col++ ) {
            boolean isCelebrity = true;

            for( int row = 0; row < party.length; row++ ) {
                if( col == row ) {
                    continue;
                }

                if( knows( party, row, col ) == false ) {
                    isCelebrity = false;
                    break;
                }
            }

            if( isCelebrity == true ) {
                return col;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int party[][] = {
            {0, 0, 1, 0},
            {0, 0, 1, 0},
            {0, 0, 0, 0},
            {0, 0, 1, 0}
        };

        System.out.println( getCelebrity( party ) ); // 2
    }
}
