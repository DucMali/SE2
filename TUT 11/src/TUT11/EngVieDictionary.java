package TUT11;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class EngVieDictionary {
    public static void main(String[] args) {
        Map <String, String> dict = new HashMap<>();
        dict.put("chicken", "con ga");
        dict.put("apple","qua tao");
        dict.put("you","ban");
        dict.put("computer","may tine");
        dict.put("teacher","thay,co");
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Please enter an English word: ");
            String eword = sc.nextLine();
            if(dict.containsKey(eword)){
                System.out.println("Meaning in Vietnamese: "+ dict.get(eword));
            }else {
                System.out.println("Meaning not found");
            }
            System.out.print("Would you like to continue?(1: yes, 2: no): ");
            int choice = sc.nextInt();
            sc.nextLine();// store "Enter" after choose number 1 or 2
            if(choice != 1) break;
        }
    }
}
