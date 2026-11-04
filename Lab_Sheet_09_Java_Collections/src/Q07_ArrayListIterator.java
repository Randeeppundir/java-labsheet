import java.util.ArrayList;
import java.util.Iterator;

public class Q07_ArrayListIterator {
    public static void main(String[] args) {
        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("Java");
        subjects.add("Python");
        subjects.add("DBMS");

        Iterator<String> iterator = subjects.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
