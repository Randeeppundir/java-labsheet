import java.util.Stack;

class Task {
    private final int taskId;
    private final String description;

    public Task(int taskId, String description) {
        this.taskId = taskId;
        this.description = description;
    }

    public void display() {
        System.out.println("Task ID: " + taskId + ", Description: " + description);
    }
}

public class Q08_TaskStack {
    private final Stack<Task> tasks = new Stack<>();

    public void pushTask(Task task) {
        tasks.push(task);
        System.out.println("Task added.");
    }

    public void popCompletedTask() {
        if (tasks.empty()) {
            System.out.println("No tasks to complete.");
        } else {
            System.out.println("Completed task:");
            tasks.pop().display();
        }
    }

    public void displayRemainingTasks() {
        System.out.println("Remaining tasks (top to bottom):");
        for (int i = tasks.size() - 1; i >= 0; i--) {
            tasks.get(i).display();
        }
    }

    public static void main(String[] args) {
        Q08_TaskStack manager = new Q08_TaskStack();
        manager.pushTask(new Task(1, "Prepare assignment"));
        manager.pushTask(new Task(2, "Study Java collections"));
        manager.pushTask(new Task(3, "Submit practical file"));

        manager.displayRemainingTasks();
        System.out.println();
        manager.popCompletedTask();
        manager.displayRemainingTasks();
    }
}
