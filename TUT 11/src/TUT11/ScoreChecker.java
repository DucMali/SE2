package TUT11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ScoreChecker {
    public static void main(String[] args) {
        Map<String, Double> score = new HashMap<>();
        score.put("Nguyen Van A", 8.0);
        score.put("Nguyen Thi Duc", 10.0);
        score.put("Nguyen Hong Hanh", 7.5);
        score.put("Do Manh Dat", 4.5);
        Scanner sc  = new Scanner(System.in);
        System.out.print("Please enter your full name: ");
        String name = sc.nextLine();
        if(score.containsKey(name)){
            System.out.println("Your score is: "+ score.get(name));
        }else{
            System.out.println("Score not found");
        }
    }
}
