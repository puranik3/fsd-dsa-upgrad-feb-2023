public class EnhancedSwitchCaseExample {
    public static void main(String[] args) {
        int discount;
        String plan = "Pro";

        discount = switch( plan ) {
            case "Premium" -> { yield 20; }
            case "Pro" -> { yield 10; }
            case "Free" -> { yield 5; }
            default -> { yield 0; }
        };

        System.out.println( discount );
    }
}
