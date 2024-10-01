package to_Do_List;

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

    }
}
