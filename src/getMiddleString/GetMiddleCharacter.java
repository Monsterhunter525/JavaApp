package getMiddleString;

public class GetMiddleCharacter {
    public static String getMiddleString(String originalString) {

        String test;
        int n = originalString.length()/2;
        if(originalString.length()%2 != 0){

            test =  String.valueOf(originalString.charAt(n));
        } else if (originalString.equals("")) {
            return "";

        } else {
            char [] str = originalString.toCharArray();
            test = str[n - 1] + String.valueOf(str[n]);

        }

        return test;


    }



    }





