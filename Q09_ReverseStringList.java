import java.util.ArrayList;
import java.util.Collections;

public class Q09_ReverseStringList {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Java");
        words.add("Python");
        words.add("C++");

        Collections.reverse(words);
        System.out.println("Reversed list: " + words);
    }
}
