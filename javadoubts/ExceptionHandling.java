package javadoubts;

class ExceptionHandling {
    private static ArrayList<String> items;
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
            System.out.println( "Item is not in the store" );
            System.exit( 0 );
        }
    }

    public static void main(String[] args) {
        buy( "Eggs" );
    }
}