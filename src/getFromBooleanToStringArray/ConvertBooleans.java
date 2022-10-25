package getFromBooleanToStringArray;

public class ConvertBooleans {
    public static String[] getStringArray(boolean[] values) {

        String yes = "Yes";
        String no = "No";
        String[] result = new String[values.length];
        for (int i =0; i < values.length; i++) {
            if (values[i] == true) {
                result[i] = yes;
            }
            else {
                result[i] = no;
            }

        }

        return result;
    }
}
