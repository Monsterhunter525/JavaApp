package sumAfterNumber;

public class SumAfterNumber {

    public static int getSum(int[] values, int startValue) {

//        final int notFound = -1;
//        int sum = notFound;
//        for (int value : values) {
//            if (value == startValue && sum == notFound) {
//                sum = 0;
//            }else if(sum != notFound){
//                sum = sum + value;
//            }
//        }
//        if (sum == notFound) {
//            return 0;
//        }
//        return sum;

//        int sum = 0;
//        for (int i = 0; i < values.length; i++){
//            if(values[i] != startValue){
//                values[i] = 0;
//            }
//            if(values[i] == startValue){
//                values[i] = 0;
//                break;
//            }
//        }
//        for(int value:values){
//            sum = sum + value;
//        }
//
//
//    return sum;

//        int sum = 0;
//        int startIndex = -1;
//        boolean found = false;
//        for(int i = 0; i < values.length; i++){
//            if(values[i] == startValue && found == false){
//                startIndex = i;
//                found = true;
//            } else if (found == true) {
//                sum = sum + values[i];
//
//            }
//        }
//        if(found == true){
//            for(int i = startIndex + 1; i < values.length; i++){
//                sum = sum + values[i];
//            }
//        }
//
//
//
//        return sum;

        int sum = 0;
        boolean found = false;
        for (int value : values) {
            if (value == startValue && !found) {
                found = true;
            } else if (found) {
                sum = sum + value;
            }
        }
        return sum;
    }
}
