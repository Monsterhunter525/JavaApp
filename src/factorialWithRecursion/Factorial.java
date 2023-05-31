package factorialWithRecursion;

public class Factorial {
    public int getFactorial(int number) {
        if (number == 0) {
            return 1;
        } else {
            return number * getFactorial(number - 1);
        }
    }
}
