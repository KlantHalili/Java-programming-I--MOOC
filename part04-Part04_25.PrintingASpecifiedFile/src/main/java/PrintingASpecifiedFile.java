
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
<<<<<<< HEAD
        Scanner reader = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String input = reader.nextLine();
// in the program:

// we create a scanner for reading the file
try (Scanner scanner = new Scanner(Paths.get(input))) {

    // we read the file until all lines have been read
    while (scanner.hasNextLine()) {
        // we read one line
        String row = scanner.nextLine();
        // we print the line that we read
        System.out.println(row);
    }
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}
=======
        Scanner scanner = new Scanner(System.in);

>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
    }
}
