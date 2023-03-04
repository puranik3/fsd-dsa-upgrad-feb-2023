package doubtsclearingfeb;

public class WrapperClasses {
    public static void main(String[] args) {
        // int -> Integer
        // char -> Character
        // double -> Double

        // primitive data types do not have methods

        String taxStr = "2.5";
        Double taxDouble = Double.parseDouble( taxStr );

        System.out.println( 1000 * taxDouble / 100 );

        // EXERCISE: What is auto-boxing?
    }
}
