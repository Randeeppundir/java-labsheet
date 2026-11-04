import java.util.LinkedHashSet;

public class Q19_LinkedHashSetOrder {
    public static void main(String[] args) {
        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.add("Aman");
        names.add("Riya");
        names.add("Karan");
        names.add("Aman"); // Duplicate ignored; original order retained

        System.out.println("Insertion order: " + names);
    }
}
