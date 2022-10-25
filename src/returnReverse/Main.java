package returnReverse;

import java.util.Arrays;

public class Main {
    public static String [] reverseNames(String [] names) {
        String [] result = new String[names.length] ;
        for (int i = 0; i < names.length; i++) {
            StringBuilder builder = new StringBuilder();
            builder.append(names[i]);
            builder.reverse();
            result[i] = builder.toString();
        }

        return result;
    }



    public static void main(String[] args) {

        System.out.println(Arrays.toString(reverseNames(new String[]{"Vaalya", "Kolya"})));;

    }

}
