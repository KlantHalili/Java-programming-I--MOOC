
import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
<<<<<<< HEAD
        Scanner scan = new Scanner(System.in);

        // Write your program here
=======
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        int a = Integer.valueOf(scanner.nextLine());
        if (a > 0){
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
    }
}
