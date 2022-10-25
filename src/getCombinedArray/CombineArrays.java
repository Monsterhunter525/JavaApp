package getCombinedArray;

public class CombineArrays {
    public static int[] getCombinedArray(int[] firstArray, int[] secondArray) {

//        int[] lastArray = new int[firstArray.length + secondArray.length];
//        int box = 0;
//        for(int i = 0; i < firstArray.length; i++){
//            lastArray[box] = firstArray[i];
//            box++;
//        }
//        for(int i = 0; i < secondArray.length; i++){
//            lastArray[box] = secondArray[i];
//            box++;
//        }
//        return lastArray;


        int[] lastArray = new int[firstArray.length + secondArray.length];
        int box = 0;
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++) {
                if (i == 0) {
                    lastArray[box] = firstArray[j];
                } else  {
                    lastArray[box] = secondArray[j];
                }
                box++;
            }
        }

        return lastArray;



    }
}
