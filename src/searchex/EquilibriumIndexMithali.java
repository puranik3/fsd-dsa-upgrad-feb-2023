package searchex;

public class EquilibriumIndexMithali {
        static int equilibriumIndex( int[]arr ){
            for(int i = 0; i < arr.length; i++ ){
                int sum1 = 0;
                int sum2 = 0;

                for( int j = 0; j < i; j++ ){
                    sum1 += arr[j];
                }

                for( int j = i + 1; j < arr.length; j++ ){
                    sum2 += arr[j];
                }

                if( sum1 == sum2 ){
                    return i;
                }
            }

            return -1;
        }

        public static void main(String[] args) {
            int[] arr = { -7, 5, 2, 3, 1, -1 };
            System.out.println( equilibriumIndex( arr ) );

        }
}
