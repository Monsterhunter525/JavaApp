package toBinaryString;

public class ToBinaryString {
    public static String toBinaryString(int value) {
        String result = "";

        if (value == 0){
            return "0";
        }

        while (value != 0) {

            //result = ((value % 2) == 0 ? "0" : "1") + result;     // works only with non negative integers
            //value = value / 2;                                    //

            result = ((value & 1) == 0 ? "0" : "1") + result;
            value = value >>> 1;

        }
        return result;
    }
}
