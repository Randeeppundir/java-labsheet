import java.util.ArrayList;

public class Q02_ArrayListSize {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Aman");
        names.add("Riya");
        names.add("Karan");

        System.out.println("Elements: " + names);
        System.out.println("Size: " + names.size());
    }
}
