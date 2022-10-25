package getDrinks;

public class GetDrinks {
    public static int getDrinks(int guestNumber) {
        int drinks =0;

        for (int i = 1;i <= guestNumber; i++) {

            drinks += i;



        }
        return drinks;


    }
}
