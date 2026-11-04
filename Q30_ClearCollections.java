import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Q30_ClearCollections {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);

        Queue<Integer> queue = new LinkedList<>();
        queue.add(100);
        queue.add(200);

        list.clear();
        set.clear();
        queue.clear();

        System.out.println("List after clear: " + list);
        System.out.println("Set after clear: " + set);
        System.out.println("Queue after clear: " + queue);
    }
}
