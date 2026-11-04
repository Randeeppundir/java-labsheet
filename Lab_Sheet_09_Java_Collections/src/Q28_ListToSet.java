import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Q28_ListToSet {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);

        Set<Integer> set = new LinkedHashSet<>(list);
        System.out.println("Original List: " + list);
        System.out.println("Set after duplicate removal: " + set);
    }
}
