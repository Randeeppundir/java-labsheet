import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Q20_CompareSets {
    public static void main(String[] args) {
        int[] values = {40, 10, 30, 20};

        HashSet<Integer> hashSet = new HashSet<>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int value : values) {
            hashSet.add(value);
            linkedHashSet.add(value);
            treeSet.add(value);
        }

        System.out.println("HashSet (no guaranteed order): " + hashSet);
        System.out.println("LinkedHashSet (insertion order): " + linkedHashSet);
        System.out.println("TreeSet (sorted order): " + treeSet);
    }
}
