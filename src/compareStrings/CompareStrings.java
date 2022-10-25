package compareStrings;

public class CompareStrings {
    public static boolean compareStrings(String firstString, String secondString) {

        if(firstString == null && secondString == null){
            return true;

        }
        else if(firstString == null || secondString == null){
            return false;
        }

        else{

            return firstString.equals(secondString);
        }

    }
}
