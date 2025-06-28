import java.util.ArrayList;
import java.util.Scanner;

public class TodoList{
    private ArrayList<String> tasks;
    private Scanner scanner;

    public TodoList() {
        tasks = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void Run(){
        System.out.println("TODO LIST");

    }

    public void showMenu(){
        System.out.println("1. Show all the tasks");
        System.out.println("2. Add tasks");
        System.out.println("3. Remove tasks");
        System.out.println("4. Mark tasks");
        System.out.ptinyln("5. Exit");
    }
}