
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
<<<<<<< HEAD
        Scanner scan = new Scanner(System.in);

=======
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give points [0-100]:");
        int a = Integer.valueOf(scanner.nextLine());
        if (a < 0){
            System.out.println("Grade: impossible!");
        } else if (a <= 49){
            System.out.println("Grade: failed");
        } else if (a <= 59) {
            System.out.println("Grade: 1");
        } else if (a <= 69) {
            System.out.println("Grade: 2");
        } else if (a <= 79) {
            System.out.println("Grade: 3");
        } else if (a <= 89) {
            System.out.println("Grade: 4");
        } else if (a <= 100) {
            System.out.println("Grade: 5");
        } else {
            System.out.println("incredible!");
        }
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
    }
}
