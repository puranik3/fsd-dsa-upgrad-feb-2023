package doubtsclearingfeb;

public class EnumerationExample {
    enum Category {
        Clothing,
        Electronics,
    };

    public static void main(String[] args) {
        Category category = Category.Electronics;

//        if( category == Category.Clothing ) {
//            System.out.println( "Discount of 10%" );
//        }

        int discount = 0;

        switch( category ) {
            case Clothing:
                discount = 10;
                break;
            case Electronics:
                discount = 20;
                break;
        }

        System.out.println( discount );
    }
}
