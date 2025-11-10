
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Name (empty will stop):");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.println("Publication year:");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            Book book = new Book(name, publicationYear);
<<<<<<< HEAD
            books.add(book);

=======
                if (!(books.contains(book))){
                    books.add(book);
                }
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
        }
        
        // NB! Don't alter the line below!
        System.out.println("Thank you! Books added: " + books.size());
    }
}
<<<<<<< HEAD
=======


>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
