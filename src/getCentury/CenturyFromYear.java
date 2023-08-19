package getCentury;

public class CenturyFromYear {
    public static int getCentury(int year) {
        int century;
        if (year % 100 == 0) {
            century = year / 100;
        } else {
            century = (year / 100) + 1;
        }
        return century;
    }
}
