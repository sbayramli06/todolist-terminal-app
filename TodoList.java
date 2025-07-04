import java.util.ArrayList;
import java.util.Scanner;

public class TodoList{
    private ArrayList<String> tasks;
    private Scanner scanner;

    public TodoList() {
        tasks = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void run(){
        System.out.println("TODO LIST");

        while (true) {
            showMenu();
            int choice = getChoice();

            switch (choice) {
                case 1:
                    showTasks();
                    break;
                case 2:
                    addTasks();
                    break;
                case 3:
                    removeTasks();
                    break;
                case 4:
                    markTasks();
                    break;
                case 5:
                    System.out.println("Exiting todolist!");
                    return;
                default:
                    System.out.println("Enter valid number!");

            }
        }

    }

    public void showMenu(){
        System.out.println("MENU");
        System.out.println("1. Show all the tasks");
        System.out.println("2. Add tasks");
        System.out.println("3. Remove tasks");
        System.out.println("4. Mark tasks");
        System.out.println("5. Exit");
    }

    public int getChoice(){

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;

    }

    public void showTasks() {
        if (tasks.size() == 0) {
            System.out.println("No tasks pending:)");
            return;
        }

        System.out.println("ALL TASKS");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public void addTasks(){
        System.out.println("Enter your new task: ");
        String task = scanner.nextLine();

        if (task.length()>0) {
            tasks.add(task);
            System.out.println("Task added!");
        }
        else {
            System.out.println("Task cannot be empty!");
        }
    }
    public void removeTasks() {
        if (tasks.size() == 0) {
            System.out.println("No tasks to remove!");
            return;
        }

        showTasks();
        System.out.println("Enter the number of the task you want to remove: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        if (choice < 1 || choice > tasks.size()) {
    System.out.println("Invalid task number.");
    return;
}

        tasks.remove(choice - 1);
        System.out.println("Task removed!");
    }
    public void markTasks() {
        if (tasks.size() == 0) {
            System.out.println("No tasks to mark!");
            return;
        }

        showTasks();
        System.out.println("Enter the number of the task you want to mark as done: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        if (choice < 1 || choice > tasks.size()) {
    System.out.println("Invalid task number.");
    return;
}

        String task = tasks.get(choice - 1);
        tasks.set(choice - 1, task + " [you did this one)))]");
    }
    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        todoList.run();
    }

}