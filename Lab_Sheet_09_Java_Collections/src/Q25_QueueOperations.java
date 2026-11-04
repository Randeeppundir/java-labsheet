import java.util.LinkedList;
import java.util.Queue;

public class Q25_QueueOperations {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(100);
        queue.offer(200);
        queue.offer(300);
        System.out.println("After adding: " + queue);

        System.out.println("Peek: " + queue.peek());
        System.out.println("Removed: " + queue.poll());
        System.out.println("After removing: " + queue);
        System.out.println("Peek now: " + queue.peek());
    }
}
