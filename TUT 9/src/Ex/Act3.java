package Ex;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Act3{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("marry.txt"));
        PrintWriter p = new PrintWriter("marry2.txt");
        int n=1;
        while(sc.hasNext()){// check whether it has next element or not
            String s = sc.nextLine(); // save this element is s
            p.println(n + ". "+ s);
            n++;
        }
        p.close();//flush and close the connection to the file
    }
}




