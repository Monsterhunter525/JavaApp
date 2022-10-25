package makeAbbs;



public class MakeAbbr {
    public static String makeAbbr(String fullName) {

        String[] words  = fullName.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(word.charAt(0));
        }



        return result.toString().toUpperCase();

    }
}
