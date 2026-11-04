import java.util.LinkedList;

public class Q13_LinkedListRetrieveEnds {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");

        System.out.println("First: " + animals.getFirst());
        System.out.println("Last: " + animals.getLast());
    }
}
