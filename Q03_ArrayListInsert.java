import java.util.ArrayList;

public class Q03_ArrayListInsert {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");

        fruits.add(1, "Orange");
        System.out.println(fruits);
    }
}
