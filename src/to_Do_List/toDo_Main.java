package to_Do_List;

import com.sun.security.jgss.GSSUtil;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class toDo_Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        List<String> TasksList = new LinkedList<>();
        System.out.println("-----------------TO DO LIST---------------");
        System.out.println("add <task> | remove <task> | done <task> ");
        String[] response = scan.nextLine().split(" ", 2);

        switch (response[0]){
            case "add":
                addTask();
                break;
            case "remove":
                remTask();
                break;
            case "done":
                doneTask();
                break;
            default:
                System.out.println("we cannot understand you!");
        }


    }

    static void addTask(){
        System.out.println("Task added to list");

    }
    static void remTask(){
        System.out.println("Task remove from list");

    }

    static void doneTask(){
        System.out.println("Task successfully done!");
    }
}
