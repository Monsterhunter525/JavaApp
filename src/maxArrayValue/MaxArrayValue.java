package maxArrayValue;


public class MaxArrayValue {
    public static int getMaxNumber(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++)
            max = max > numbers[i] ? max : numbers[i];
        return max;
    }
}

