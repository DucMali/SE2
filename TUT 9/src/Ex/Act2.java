package Ex;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Act2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("input.txt"));
        PrintWriter p = new PrintWriter("output.txt");
        while (sc.hasNext()) {
            String s = sc.nextLine();
            if(!s.isEmpty()){ // filter empty line.
                p.println(s);// add into this empty line
            }
        }
        p.close();
    }
}