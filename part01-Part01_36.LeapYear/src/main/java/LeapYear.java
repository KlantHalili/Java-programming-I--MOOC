
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
<<<<<<< HEAD
        Scanner scan = new Scanner(System.in);

=======
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Give a year: ");
        int year = scanner.nextInt();

        // Check leap year conditions
        boolean isLeapYear = false;

        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                isLeapYear = true;
            }
        }

        // Output result
        if (isLeapYear) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }

        scanner.close();
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
    }
}
