package speedStatistic;

public class SpeedStatistic {


    public static int[] getSpeedStatistic(int[] results) {

        if (results.length != 0) {
            int min = results[0];
            int max = results[0];
            for (int res : results) {
                if (res < min) {
                    min = res;
                }
                if (res > max) {
                    max = res;
                }

            }

            return new int[]{min, max};
        }
        else{
            return new int[]{0,0};
        }


    }
}
