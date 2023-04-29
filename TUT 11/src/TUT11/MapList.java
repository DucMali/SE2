package TUT11;

import java.util.*;

public class MapList {
    public static void addStudent( HashMap<String, LinkedList<String>> classes) {
        Scanner add = new Scanner(System.in);
        System.out.print("Please enter class's name: ");
        String nclass = add.nextLine().toLowerCase();
        System.out.print("Please enter student's name: ");
        String name = add.nextLine();
        if (!classes.containsKey(nclass)) {
            classes.put(nclass, new LinkedList<>());
        }
        classes.get(nclass).add(name);
    }

    public static void displayAll(HashMap<String, LinkedList<String>> classes) {
        Scanner display = new Scanner(System.in);
        System.out.print("Please enter class: ");
        String nclass = display.nextLine().toLowerCase();
        if (!classes.containsKey(nclass)) {
            System.out.println("Class not found!");
        } else {
            System.out.println("\nList of student's name: ");
            for (String i : classes.get(nclass)) {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {
        Map<String, LinkedList<String>> classes = new HashMap<>();
        int n = 0;
        while (n != 3) {
            System.out.println("[1] Add a student in a class");
            System.out.println("[2] Display all students in a class");
            System.out.println("[3] Quit ");
            System.out.println();
            System.out.print("Choose an option: ");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            if (n == 1) {
                addStudent((HashMap<String, LinkedList<String>>) classes);
            } else if (n == 2) {
                displayAll((HashMap<String, LinkedList<String>>) classes);
            } else if (n == 3) {
                System.out.println("\nQuit! ");
            }
        }
    }
}
