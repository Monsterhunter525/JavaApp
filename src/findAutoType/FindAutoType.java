package findAutoType;

import java.util.function.Function;

public class FindAutoType implements Function<Integer,AutoType> {
    private static final int WEIGHT_THRESHOLD = 1500;

    public static void main(String[] args) {
        printAutoType(1300, new FindAutoType());
    }

    private static void printAutoType(Integer weight, FindAutoType autoTypeFinder) {
        AutoType autoType = autoTypeFinder.apply(weight);
        System.out.println("Weight: " + weight + " = " + autoType);
    }

    @Override
    public AutoType apply(Integer weight) {
        return weight < WEIGHT_THRESHOLD ? AutoType.CAR : AutoType.TRUCK;
    }
}
