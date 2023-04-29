import java.io.*;
import java.util.ArrayList;

public class Output {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        list.add("Meow Meow Meow Meow Meow\n");
        list.add("I hate all of you\n");
        list.add("But I love Hanoi University\n");

        File f = new File("data.bin");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(list);
        oos.close();
    }
}
