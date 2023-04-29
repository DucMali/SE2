import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Input {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("Content of data.bin file:");
        File f = new File("data.bin");
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);

        ArrayList<String> arrList = (ArrayList<String>) ois.readObject();
        for(String i: arrList){
            System.out.print(i);
        }
        ois.close();
    }
}
