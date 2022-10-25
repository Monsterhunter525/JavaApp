package removeOddChars;

public class RemoveOddChars {

    public static String removeOddChars(String originalString) {

        char[] chars = originalString.toCharArray();
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < chars.length; i++){
            if ((i+1) % 2 != 0) {
                str.append(chars[i]);

            }

        }
        return str.toString();

    }
}
