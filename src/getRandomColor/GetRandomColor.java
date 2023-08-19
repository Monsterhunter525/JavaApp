package getRandomColor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class GetRandomColor implements Supplier {
    static final String[] COLORS = {"red", "green", "blue", "yellow", "pink",
            "black", "white"};

    public String get(){
        Random random = new Random();
        int randomIndex = random.nextInt(COLORS.length);
        return COLORS[randomIndex];
    }

    public static void main(String[] args) {
        GetRandomColor color = new GetRandomColor();
        List<GetRandomColor> colors = new ArrayList<>();
        colors.add(color);
        colors.forEach(x -> System.out.println(x.get()));
    }

    @FunctionalInterface
    public interface Color {
        String get();
    }
}
