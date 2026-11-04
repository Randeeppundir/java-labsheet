import java.util.LinkedList;

public class Q11_LinkedListAddEnds {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Middle");

        names.addFirst("Beginning");
        names.addLast("End");

        System.out.println(names);
    }
}
