package speedStatistic;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(SpeedStatistic.getSpeedStatistic(new int[]{1, 2, -3, 5, -200})));
    }
}
