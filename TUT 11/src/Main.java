
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        BookManager books = new BookManager();
        books.loadFromFile();
        int n=-1;
        while(n!=0) {
            System.out.println("------------------------------------");
            System.out.println("1.Liệt kê sách");
            System.out.println("2.add a new book");
            System.out.println("3.edit book");
            System.out.println("4.delete a book");
            System.out.println("5.search books by name");
            System.out.println("6.sort books descending by price\n");
            System.out.println("0.save && exit");
            System.out.println("------------------------------------");
            System.out.print("Your option: ");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            if (n == 1) {
                books.printBooks(books.getBooks());
            } else if (n == 2) {
                Scanner scc = new Scanner(System.in);
                System.out.print("Enter book id: ");
                int id = scc.nextInt();
                scc.nextLine();
                System.out.print("Enter book name: ");
                String name = scc.nextLine();
                System.out.print("Enter book price: ");
                double price = scc.nextDouble();
                Book b = new Book(id, name, price);
                if (books.add(b) == true) {
                    books.add(b);
                    System.out.println("Added successfully.");
                } else {
                    System.out.println("Duplicated ID!");
                }
            } else if (n == 3) {
                Scanner st = new Scanner(System.in);
                System.out.print("Enter book id: ");
                int id = st.nextInt();
                st.nextLine();
                if (books.getBookById(id) == null) {
                    System.out.println("Invalid ID!");
                } else {
                    System.out.print("Enter book name: ");
                    String name = st.nextLine();
                    System.out.print("Enter book price: ");
                    double price = st.nextDouble();
                    books.getBookById(id).setName(name);
                    books.getBookById(id).setPrice(price);
                    System.out.println("Updated successfully.");
                }
            } else if (n == 4) {
                Scanner st = new Scanner(System.in);
                System.out.print("Enter book id: ");
                int id = st.nextInt();
                Book ab = new Book(id, "abc", 23);
                if (books.getBookById(id) == null) {
                    System.out.println("Duplicated ID!");

                } else {
                    books.remove(ab);
                    System.out.println("Deleted successfully.");
                }

            } else if (n == 5) {
                Scanner sccc = new Scanner(System.in);
                System.out.print("Enter keyword: ");
                String keyword = sccc.nextLine();
                books.printBooks(books.searchByName(keyword));
            } else if (n == 6) {
                System.out.println("After sorting: ");
                books.sortDescByPrice();
                books.printBooks(books.getBooks());
            } else if (n == 0) {
                books.saveToFile();
                System.out.println("Bye!");
            } else {
                System.out.println("Invalid option!");
            }
        }
    }
}
    