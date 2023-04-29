import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class BookManager {
    public ArrayList<Book> books;

    public BookManager() {
        this.books = new ArrayList<>();
    }

    public ArrayList<Book> getBooks() {
        return this.books;
    }

    /**
     * update this.books by reading books from file books.txt
     */
    public void loadFromFile() throws FileNotFoundException {
        System.out.println("Loading books...");
        Scanner sc = new Scanner (new File("books.txt"));
        while(sc.hasNext()){
            String s = sc.nextLine();
            String id= s.substring(4,5);
            String price= s.substring(57,62);
            String name= s.substring(6,45);
            Book b = new Book(Integer.parseInt(id),name,Double.parseDouble(price));
            this.books.add(b);

        }
    }

    /**
     * print books (one/line) in required format
     */
    public void printBooks(ArrayList<Book> books) {
        if(books.isEmpty()){
            System.out.println("(empty)");
        }else{
            System.out.format("%-5s %-45s %-10s\n","ID","Name","Price");
            for(Book i: books){
                System.out.format("%5d %-45s %10.2f\n",i.id,i.name,i.price);
            }
        }


    }

    /**
     * if book.id is not duplicated, add book to this.books
     * return whether added or not
     */
    public boolean add(Book book) {
        for(Book i: books){
            if(i.id==book.id){
                return false;
            }
        }this.books.add(book);
        return true;
    }

    /**
     * return book specified by id, null if not found
     */
    public Book getBookById(int id) {
        for(Book b: books){
            if(b.id == id){
                return b;
            }
        }
        return null;
    }

    /**
     * remove book from this.books
     */
    public void remove(Book book) {
        for (Book b: this.books){
            if(b.id == book.id) {
                this.books.remove(b);
                break;
            }


        }
    }

    /**
     * update this.books to be sorted by price from high -> low
     * @return
     */
    public void sortDescByPrice() {
        for(int i=0;i<this.books.size() -1;i++){
            int p = i;
            for(int j=i+1;j<this.books.size();j++){
                Book book = this.books.get(j);
                Book book1 = this.books.get(p);
                if(book.price > book1.price){
                    p=j;
                }
            }
            Book b = this.books.get(p);
            this.books.set(p,this.books.get(i));
            this.books.set(i,b);
        }
    }

    /**
     * return all books having name contains keyword (case in-sensitive)
     */
    public ArrayList<Book> searchByName(String keyword) {
        ArrayList<Book> matches = new ArrayList<>();
        for(Book b: books){
            if(b.name.contains(keyword)){
                matches.add(b);
            }
        }

        return matches;
    }

    /**
     * write this.books to file books.txt in required format
     */
    public void saveToFile() throws FileNotFoundException {
        System.out.println("Saving to file...");
        PrintWriter pw= new PrintWriter("books.txt");
        for(Book i: this.books){
            String s = String.format("%5d %-45s %10.2f",i.id,i.name,i.price);
            pw.println(s);
        }
        pw.close();
    }
}
