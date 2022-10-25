package getPaymentSystem;

public class GetPaymentSystem {
    public static String getPaymentSystem(int number) {
        String paymentSystem =null;
        switch (number) {
            case 34:
            case 37:
                paymentSystem = "American Express";
                break;
            case 4:
                paymentSystem = "VISA";
                break;
            case 52:
            case 53:
            case 54:
            case 55:
                paymentSystem = "MasterCard";
                break;
            case 63:
            case 67:
                paymentSystem = "Maestro";
                break;
            default:
                paymentSystem = "unknown payment system";
        }


        return paymentSystem;
    }
}
