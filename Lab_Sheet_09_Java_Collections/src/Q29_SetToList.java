import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Q29_SetToList {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("C++");

        List<String> list = new ArrayList<>(set);
        for (String item : list) {
            System.out.println(item);
        }
    }
}
