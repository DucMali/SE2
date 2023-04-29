import java.io.*;
import java.util.Scanner;

public class Consolepr {
    public static void main(String[] args) throws IOException {
        int n=0;
        while(n!=5){
            System.out.println("[1] Add item");
            System.out.println("[2] Item list");
            System.out.println("[3] Edit an item");
            System.out.println("[4] Remove an item\n[5] Quit ");
            System.out.print("Choose an option: ");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            if(n==1){
                System.out.println("\nAdding a new line... \n");
            }else if(n==2){
                System.out.println("\nListing all items... \n");
            }else if(n==3){
                System.out.println("\nAn item that you want to edit... \n");
            }else if(n==4){
                System.out.println("\nAn item that you want to remove... \n");
            }else if(n==5){
                System.out.println("\nGoodbye! ");
            }
        }
    }


}
    1 Think big and Grow rich                            10.95
    2 The 7 habits of highly effective people            15.97
    3 How to win friends and influence people            14.95

            1 Think big and Grow rich                            10.95
            2 The 7 habits of highly effective people            15.97
            3 How to win friends and influence people            14.95

