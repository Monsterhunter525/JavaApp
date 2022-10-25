package detectWerewolfs;

public class DetectWerewolf {
    public static boolean isWerewolf(String target) {

        String begin;
        StringBuilder end = new StringBuilder(target.substring(target.length() / 2));

        if (target.length() % 2 == 0) {
            begin = target.substring(0, target.length() / 2);

        } else {
            begin = target.substring(0, target.length() / 2 + 1);

        }

        return begin.equalsIgnoreCase(end.reverse().toString());

    }
}