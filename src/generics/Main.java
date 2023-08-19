package generics;

public class Main {
    public static void main(String[] args) {
        Pair <Integer, String> pair = new Pair<>(1, "hello");
        Pair <Integer, String> pair2 = new Pair<>(1, "hello");
        Pair <Integer, String> pair3 = null;
        System.out.println(pair.hashCode());
        System.out.println(pair2.hashCode());

        System.out.println(pair.equals(pair2));
        System.out.println(pair3.equals(pair2));
    }
}
