import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                System.out.println("What information will be printed?");
                String command = scanner.nextLine();

                if (bookList.size() == 0) {
                    System.out.println("The list is empty");
                } else {
                    for (int i = 0; i < bookList.size(); i++) {
                        bookList.get(i).print(command);
                    }
                }
                break;

            } else {
                System.out.println("Pages: ");
                int pages = scanner.nextInt();
                System.out.println("Year: ");
                int year = scanner.nextInt();
                scanner.nextLine(); // consume leftover newline

                bookList.add(new Book(title, pages, year));
            }
        }

        scanner.close();
    }
}
