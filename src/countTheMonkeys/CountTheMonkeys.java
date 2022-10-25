package countTheMonkeys;

public class CountTheMonkeys {
    public static int[] countTheMonkeys(int count) {

        int[] result = new int[count];

        for(int i = 0; i < count; i++){
            result[i] = i + 1;

        }
        if(count == 0){
            return new int[]{};
        }


        return result;
    }
}
