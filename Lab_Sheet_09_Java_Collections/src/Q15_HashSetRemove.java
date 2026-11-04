import java.util.HashSet;

public class Q15_HashSetRemove {
    public static void main(String[] args) {
        HashSet<String> languages = new HashSet<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");

        languages.remove("Python");
        System.out.println("After removal: " + languages);
    }
}
