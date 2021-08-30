import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while(true){
            System.out.println("Title:");
            String title = scanner.nextLine();
            
            if(title.isEmpty()){
                break;
            }
            
            System.out.println("Pages:");
            String pages = scanner.nextLine();
            System.out.println("Publication year:");
            String year = scanner.nextLine();
            books.add(new Book(title, pages, year));
        }
        System.out.println("");
        System.out.println("What information will be printed?");
        String toPrint = scanner.nextLine();
        if(toPrint.equals("everything")){
            for(Book book: books){
                System.out.println(book.toString());
            }
        }
        if(toPrint.equals("name")){
            for(Book book: books){
                System.out.println(book.getTitle());
            }
        }

    }
}
