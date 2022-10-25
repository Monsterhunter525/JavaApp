package getOccurrenceCount;

public class GetOccurrenceCount {
    public static int getOccurrenceCount(String[] colors, String targetColor) {
        int count = 0;
        for(String color: colors){
            if(color.equals(targetColor)){
                count += 1;
            }


        }



        return count;


    }

}
