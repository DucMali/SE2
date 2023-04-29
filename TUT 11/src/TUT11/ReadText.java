package TUT11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ReadText{
    public static void main(String[] args) throws FileNotFoundException {
        String fullText = "";
        Scanner sc = new Scanner(new File("text.txt"));
        while(sc.hasNext()){
            fullText += sc.nextLine();
        }
        fullText=fullText.toLowerCase();
        String [] words = fullText.split(" ");
        Set<String> bin = new LinkedHashSet<>();
        for (String i:words){
            bin.add(i);
        }
        for(String j:bin){
            System.out.print(j + " ");
        }
    }
}
