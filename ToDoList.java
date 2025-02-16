// TaskList.java
import java.util.*;

public class ToDoList {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(String description) {
        if (description.isEmpty()) {
            System.out.println("You cant complete an empty task! Please enter again.");
            return;
        }
        tasks.add(new Task(description));
        System.out.println("Task added, get to work!");
    }

    public void taskComplete(int index) {
        if (index < 0 || index >= tasks.size()) {
            System.out.println("Invalid task number.");
            return;
        }
        tasks.get(index).markComplete();
        System.out.println("Task marked as complete. Excellent job!");
    }

    public void showTasks() {
        if (tasks.isEmpty()) {
            System.out.println("There are no tasks. You can now go lay on the sofa.");
            return;
        }
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + 1 + ". " + tasks.get(i));
        }
    }
}