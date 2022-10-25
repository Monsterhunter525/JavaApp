package markStringEnds;

public class MarkStringEnds {
    public static String[] markStringEnds(String originalString) {


        String first = originalString.substring(0, 1).toUpperCase() + originalString.substring(1);
        String second = originalString.substring(0, originalString.length() - 1) + originalString.substring(originalString.length() - 1).toUpperCase();

        return new String[]{first, second};

    }

}
