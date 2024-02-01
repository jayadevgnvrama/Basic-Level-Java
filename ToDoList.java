/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ToDoList;

/**
 *
 * @author Dell
 */
import java.util.*;

public class ToDoList {
    private static ArrayList<String> tasks = new ArrayList<String>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("1. Add task");
            System.out.println("2. Complete task");
            System.out.println("3. Edit task");
            System.out.println("4. View tasks");
            System.out.println("5. Exit");
            System.out.println();
            System.out.print("Enter your choice: ");

            try {
                choice = in.nextInt();

                switch (choice) {
                    case 1:
                        addTask();
                        break;
                    case 2:
                        completeTask();
                        break;
                    case 3:
                        editTask();
                        break;
                    case 4:
                        viewTasks();
                        break;
                    case 5:
                        exit();
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                in.nextLine();
            }
        }
    }

    private static void addTask() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter task: ");
        tasks.add(in.nextLine());
        System.out.println();
    }

    private static void completeTask() {
        Scanner in = new Scanner(System.in);
        int taskNum;

        viewTasks();
        try {
            taskNum = in.nextInt();
            if (taskNum <= 0 || taskNum > tasks.size()) {
                throw new IndexOutOfBoundsException();
            }
            tasks.remove(taskNum - 1);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            in.nextLine();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid task number. Please try again.");
        }
    }
    private static void editTask() {
        Scanner in = new Scanner(System.in);
        int taskNum;
        String newTask;
        viewTasks();
        
        System.out.print("Enter task number to edit: ");
        try {
            taskNum = in.nextInt();
            if (taskNum <= 0 || taskNum > tasks.size()) {
                throw new IndexOutOfBoundsException();
            }
            in.nextLine();
            System.out.print("Enter new task description: ");
            newTask = in.nextLine();
            tasks.set(taskNum-1, newTask);
            System.out.println();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            in.nextLine();
            System.out.println();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid task number. Please try again.");
        }
    }
    
    private static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to display");
        } else {
            System.out.println();
            System.out.println("----- Tasks available -----");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
            System.out.println("---------------------------");
            System.out.println();
        }
    }

    private static void exit() {
        System.out.println("Exiting program");
        System.exit(0);
    }
}