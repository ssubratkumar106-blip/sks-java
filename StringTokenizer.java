import java.util.*;

public class M {
    public static void main(String a[]) {
        StringTokenizer st = new StringTokenizer("Hello ram You are ");
        System.out.println("Total tokens: " + st.countTokens());

        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        // Recreate tokenizer to use Enumeration methods
        StringTokenizer st2 = new StringTokenizer("Hello ram");
        while(st2.hasMoreElements()) {
            System.out.println(st2.nextElement());
        }
    }
}