package Ex;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Act1 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter p = new PrintWriter("hello.txt");
        p.println("Hello World!");
        p.close();
        Scanner file = new Scanner(new File("hello.txt"));
        String s = file.nextLine();
        System.out.println(s);
    }
}
