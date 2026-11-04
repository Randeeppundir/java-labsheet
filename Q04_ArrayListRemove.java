import java.util.ArrayList;

public class Q04_ArrayListRemove {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Aman");
        names.add("Riya");
        names.add("Karan");
        names.add("Neha");

        names.remove(1);          // Remove by index
        names.remove("Karan");    // Remove by value

        System.out.println("After removal: " + names);
    }
}
