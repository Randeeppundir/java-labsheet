import java.util.LinkedList;

public class Q12_LinkedListRemoveEnds {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        numbers.removeFirst();
        numbers.removeLast();

        System.out.println("After removing first and last: " + numbers);
    }
}
