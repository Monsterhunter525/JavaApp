package getHighestAndLowestAge;

public class GetHighestAndLowestAge {
//    public static int[] getHighestAndLowestAge(int[] ages) {
//
//        int max = ages[0];
//        int min = ages[0];
//        for (int age:ages) {
//            max = Math.max(max, age);
//            min = Math.min(min, age);
//
//        }
//        return new int[]{max, min};
//    }
public static int[] getHighestAndLowestAge(int[] ages) {

    //int max = ages[0];
    int max = Integer.MIN_VALUE;
    //int min = ages[0];
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < ages.length; i++){
        if(ages[i] > max){
            max = ages[i];
        }

        if(ages[i] < min){
            min = ages[i];
        }

    }
//    for (int age : ages) {
//        if (age > max) {
//            max = age;
//
//        }
//        if (age < min) {
//            min = age;
//
//        }
//
//    }




    return new int[]{max,min};
}
}
