
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
<<<<<<< HEAD
// in the program:

// we create a scanner for reading the file
try (Scanner scanner = new Scanner(Paths.get("data.txt"))) {

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

>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
    }
}
