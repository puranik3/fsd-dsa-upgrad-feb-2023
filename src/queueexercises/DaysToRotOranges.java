package queueexercises;

import java.util.Arrays;

public class DaysToRotOranges {
    private static boolean isValid( int oranges[][], int row, int col ) {
        return row >= 0 && row < oranges.length && col >= 0 && col < oranges[row].length;
    }

    private static int daysToRotOranges( int[][] oranges ) {
        int rottenNo = 2; // which number represents rotten orange

        // set the rotten oranges for the next day
            boolean done = true; // to indicate that at least 1 orange becomes rotten on a day

            for (int r = 0; r < oranges.length; r++) {
                for (int c = 0; c < oranges[r].length; c++) {
                    int curOrange = oranges[r][c];

                    if (curOrange == rottenNo) {
                        // if top is fresh, mark it as rotten
                        if (isValid(oranges, r - 1, c) && oranges[r - 1][c] == 1) {
                            oranges[r - 1][c] = rottenNo + 1;
                            done = false;
                        }

                        // if bottom is fresh, mark it as rotten
                        if (isValid(oranges, r + 1, c) && oranges[r + 1][c] == 1) {
                            oranges[r + 1][c] = rottenNo + 1;
                            done = false;
                        }

                        // if left is fresh, mark it as rotten
                        if (isValid(oranges, r, c - 1) && oranges[r][c - 1] == 1) {
                            oranges[r][c - 1] = rottenNo + 1;
                            done = false;
                        }

                        // if right is fresh, mark it as rotten
                        if (isValid(oranges, r, c + 1) && oranges[r][c + 1] == 1) {
                            oranges[r][c + 1] = rottenNo + 1;
                            done = false;
                        }
                    }
                }
            }

            return 1;
    }

    public static void main(String[] args) {
        int[][] oranges = {
                {2, 1, 0, 2, 1},
                {1, 0, 1, 2, 1},
                {1, 0, 0, 2, 1}
        };

        System.out.println( daysToRotOranges( oranges ) ); // 2 is expected

        for( int r = 0; r < oranges.length; r++ ) {
            System.out.println(Arrays.toString( oranges[r] ) );
        }
    }
}
