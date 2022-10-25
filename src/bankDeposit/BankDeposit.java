package bankDeposit;

public class BankDeposit {
    public static int calculateProfit(double amount, double percent) {
        double result;
        //percent = percent / 100;
        result = (amount * percent) ;

        return (int) result;

    }
}
