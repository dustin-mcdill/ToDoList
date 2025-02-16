// Main.java
import java.util.*;

public class ToDoListApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList taskList = new ToDoList();

        while (true) {
            System.out.println("Welcome to the To-Do-List App!");
            System.out.println("\n1. Add Task\n2. Complete Task\n3. Show Tasks\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task name: ");
                    String description = scanner.nextLine();
                    taskList.addTask(description);
                    break;
                case 2:
                    taskList.showTasks();
                    System.out.print("Enter task number to mark it as completed: ");
                    int taskNumber = scanner.nextInt();
                    taskList.taskComplete(taskNumber - 1);
                    break;
                case 3:
                    taskList.showTasks();
                    break;
                case 4:
                    System.out.println("Exiting the Task App");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Choose an option from 1 to 4.");
            }
        }
    }
}