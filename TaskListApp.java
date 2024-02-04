import java.util.ArrayList;
import java.util.Scanner;

public class TaskListApp {
    private static ArrayList<String> taskList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        displayMenu();
    }

    private static void displayMenu() {
        while (true) {
            System.out.println("\nTask List Application");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. List Tasks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    removeTask();
                    break;
                case 3:
                    listTasks();
                    break;
                case 4:
                    System.out.println("Exiting Task List Application. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addTask() {
        System.out.print("Enter the task: ");
        String task = scanner.nextLine();
        taskList.add(task);
        System.out.println("Task added successfully!");
    }

    private static void removeTask() {
        if (taskList.isEmpty()) {
            System.out.println("Task list is empty. No tasks to remove.");
        } else {
            System.out.println("Current tasks:");
            listTasks();
            System.out.print("Enter the task number to remove: ");
            int taskNumber = scanner.nextInt();

            if (taskNumber >= 1 && taskNumber <= taskList.size()) {
                taskList.remove(taskNumber - 1);
                System.out.println("Task removed successfully!");
            } else {
                System.out.println("Invalid task number. Please try again.");
            }
        }
    }

    private static void listTasks() {
        if (taskList.isEmpty()) {
            System.out.println("Task list is empty.");
        } else {
            System.out.println("Task List:");
            for (int i = 0; i < taskList.size(); i++) {
                System.out.println((i + 1) + ". " + taskList.get(i));
            }
        }
    }
}
