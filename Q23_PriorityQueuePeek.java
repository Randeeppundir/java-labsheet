import java.util.PriorityQueue;

public class Q23_PriorityQueuePeek {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("Mango");
        queue.add("Apple");
        queue.add("Banana");

        System.out.println("Head element: " + queue.peek());
        System.out.println("Queue after peek: " + queue);
    }
}
