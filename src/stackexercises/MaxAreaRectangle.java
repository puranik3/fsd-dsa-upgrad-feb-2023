package stackexercises;

public class MaxAreaRectangle {
    private static int maxAreaRectangle( int[] bars ) {
        int minHeight, maxArea = 0;

        for( int start = 0; start < bars.length; start++ ) {
            maxArea = 0;
            minHeight = bars[start];

            for( int end = start; end < bars.length; end++ ) {
                if( bars[end] < minHeight ) {
                    minHeight = bars[end];
                }

                int width = end - start + 1;
                int area = minHeight * width;

                if( area > maxArea ) {
                    maxArea = area;
                }
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] bars = { 4, 5, 2, 3, 6, 4, 1, 4, 5 };

        System.out.println( maxAreaRectangle( bars ) ); // 12
    }
}
