import java.util.HashSet;

public class Q14_HashSetDuplicates {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10); // Duplicate is ignored
        numbers.add(30);
        numbers.add(20);

        System.out.println("HashSet: " + numbers);
        System.out.println("Size (duplicates not counted): " + numbers.size());
    }
}
