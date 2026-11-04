import java.util.ArrayList;

public class Q06_ArrayListForEach {
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<>();
        values.add(5);
        values.add(10);
        values.add(15);

        for (int value : values) {
            System.out.println(value);
        }
    }
}
