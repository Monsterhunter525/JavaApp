package getDivisibleNumbers;

import java.util.ArrayList;
import java.util.List;

public class DivisibleNumbers {

    public static int[] getDivisibleNumbers(int[] numbers, int divider) {

        int count = 0;
        for(int number: numbers){
            if(number % divider == 0 && number > 0){
                count++;
            }
        }
        int[] result = new int[count];

        for (int indexOfNumbers = 0, indexOfResult = 0; indexOfNumbers < numbers.length; indexOfNumbers++) {
            if (numbers[indexOfNumbers] % divider == 0 && numbers[indexOfNumbers] > 0){
                result[indexOfResult++] = numbers[indexOfNumbers];

            }
        }

        return result;
    }
//public static int[] getDivisibleNumbers(int[] numbers, int divider) {
//
//    int count = 0;
//    for(int number: numbers){
//        if(number % divider == 0 && number > 0){
//            count++;
//        }
//
//
//    }
//    int[] result = new int[count];
//    int index = 0;
//    for (int number : numbers) {
//        if (number % divider == 0 && number > 0){
//            result[index++] = number;
//        }
//    }
//
//    return result;
//}
//public static Object[] getDivisibleNumbers(int[] numbers, int divider){
//
//    List<Integer> result = new ArrayList<>();
//    for (Integer number : numbers) {
//        if (number % divider == 0 && number > 0){
//            result.add(number);
//            number.toString();
//            result.add("Vasya");
//        }
//    }
//
//    return result.toArray();
//
//}

}
