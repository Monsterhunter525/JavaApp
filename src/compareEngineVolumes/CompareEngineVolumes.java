package compareEngineVolumes;

public class CompareEngineVolumes {

    public static void main(String[] args) {
        Integer firstEnginePower = 0;
        Integer secondEnginePower = 200;
        CompareEngineVolumes compareEngineVolumes = new CompareEngineVolumes();
        int actual = compareEngineVolumes.apply(firstEnginePower, secondEnginePower);
        System.out.println(actual);
        new Calculator() {
            @Override
            public Integer calculate(Integer firstEnginePower, Integer secondEnginePower) {
                return firstEnginePower - secondEnginePower;
            }
        };
    }

    private int apply(Integer firstEnginePower, Integer secondEnginePower) {
        return firstEnginePower - secondEnginePower;
    }

    @FunctionalInterface
    public interface Calculator {
        Integer calculate(Integer firstEnginePower, Integer secondEnginePower);
    }
}
