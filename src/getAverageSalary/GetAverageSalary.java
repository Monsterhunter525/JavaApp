package getAverageSalary;

public class GetAverageSalary {
    public static double getAverageSalary(double[] salaries) {
        double result = 0;
        double sum = 0;
        if (salaries.length > 0) {
            for (double salary : salaries) {
                sum += salary;
            }
            result = sum / salaries.length;
        }
        return result;
    }
}
