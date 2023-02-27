package searchex;

public class OddOneOut {
    // XOR operator - bitwise operator (eXclusive OR)
    // 1 -> 0000 0000 0000 0000 0000 0000 0000 0001
    // 2 -> 0000 0000 0000 0000 0000 0000 0000 0010
    // 3 -> 0000 0000 0000 0000 0000 0000 0000 0011

    // true OR true -> true

    // true XOR true -> false (different from OR)
    // true XOR false -> true
    // false XOR true -> true
    // false XOR false -> false

    // 1 XOR 2
    // 1        -> 0000 0000 0000 0000 0000 0000 0000 0001
    // XOR
    // 2        -> 0000 0000 0000 0000 0000 0000 0000 0010
    // ---------------------------------------------------
    // 1 XOR 2  -> 0000 0000 0000 0000 0000 0000 0000 0011
    // 1 XOR 2 <=> 2 XOR 1

    // 1 XOR 1 -> 0000 0000 0000 0000 0000 0000 0000 0000 -> 0 (2 times same number has been XORed)
    // 0 XOR 1 -> 0000 0000 0000 0000 0000 0000 0000 0000 -> 1 (3 times)
    // 1 XOR 1 -> 0000 0000 0000 0000 0000 0000 0000 0000 -> 0 (4 times same number has been XORed)

    private static int oddOneOut( int arr[] ) {
        int result = arr[0];

        // arr[0] ^ arr[1] ^ ... ^ arr[arr.length - 1]
        for( int i = 1; i < arr.length; i++ ) {
            result = result ^ arr[i];
        }

        return result;
    }

    public static void main(String[] args) {
        // which number occurs an odd number of times
        // Answer: 4
        int arr[] = { 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4 };
        System.out.println( "The number that occurs an odd number of times is " + oddOneOut( arr ) );
    }
}
