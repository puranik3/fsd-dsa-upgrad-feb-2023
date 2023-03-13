package javadoubts;

import java.util.ArrayList;

class ExceptionHandling {
    private static ArrayList<String> items = new ArrayList<>();
    static
    {
        items.add( "Eggs" );
        items.add( "Milk" );
        items.add( "Bread" );
    }

    private static String buy( String item ) {
        if( items.contains( item ) ) {
            return item;
        } else {
            // we are "handling" the error scenario
            throw new RuntimeException( item + " is not in the shop" );
//            System.out.println( "Item is not in the store" );
//            System.exit( 0 ); // stop the program
//            return "";
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println(buy("Eggs")); // Eggs
            System.out.println(buy("Biscuits")); // stops the program
            System.out.println(buy("Bread")); // will not execute!
        } catch( Exception e ) {
            System.out.println(buy("Milk")); // stops the program
        }
    }
}