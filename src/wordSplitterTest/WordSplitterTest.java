package wordSplitterTest;

import java.util.Arrays;

public class WordSplitterTest {
    public static void main(String[] args) {
        WordSplitter wordSplitter = new WordSplitter();

        String[] words = wordSplitter.split("Hello    world");

        System.out.println(Arrays.toString(words));
    }
}
class WordSplitter {
    public String[] split(String phrase) {
        phrase = phrase.replaceAll("\\s+", ",");
        return  phrase.toLowerCase().split(",");
    }
}
