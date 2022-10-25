package createDailyPlan;

public class DailyPlanner {
    public static String createDailyPlan(String[] plans){
        int count = 1;
        StringBuilder result = new StringBuilder("My plans:");

        if (plans.length != 0){
            result.append("\n");
        }

        for (int i = 0; i < plans.length; i++) {
            String p = plans[i];
            result.append(count).append(".) ").append(p).append(";");
            if(i != plans.length - 1){
                result.append("\n");
            }
            count++;


        }

        return result.toString();

    }
}
