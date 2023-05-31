package printerClass;

import java.util.Arrays;

public class Printer {
//    public static String print(Object message) {
//        if (message instanceof String) {
//            return message.toString();
//        }else if (message instanceof Integer) {
//            return message.toString();
//        }else if (message instanceof Double) {
//            return message.toString();
//        }else if (message instanceof String[]) {
//            return Arrays.toString((Object[]) message);
//        }else {
//            return null;
//        }
//    }

    public static String print(String message) {
        System.out.println("method number 1");
        return message;
    }
    public static String print(int num) {
        System.out.println("method number 2");
        return String.valueOf(num);
    }
    public static String print(double num) {
        System.out.println("method number 3");
        return String.valueOf(num);
    }
    public static String print(String message, int num) {
        System.out.println("method number 4");
        return message + " and " + num;
    }
    public static String print(String[] arr) {
        System.out.println("method number 5");
        return Arrays.toString(arr);
    }

}
