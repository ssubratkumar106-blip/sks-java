import java.util.*;

public class SentenceParser {
    public SentenceParser(String st) {
        StringTokenizer s = new StringTokenizer(st);
        System.out.println("Tokens:");
        while (s.hasMoreTokens()) {
            System.out.println(s.nextToken());
        }
    }

    public static void main(String[] args) {
        SentenceParser parser = new SentenceParser("Java is powerful and fun");
    }
}