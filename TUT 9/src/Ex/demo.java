package Ex;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) throws IOException {
        try {

            File input = new File("input.txt");
            input.createNewFile();
            // create a new file at current location.

            PrintWriter in = new PrintWriter(input);// write into file
            in.println("\n\nNguyen\n\nHien\n\n\nAn\n");//content of file
            in.close();//close PrintWriter

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}