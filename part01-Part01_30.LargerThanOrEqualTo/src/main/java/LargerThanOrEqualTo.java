
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
<<<<<<< HEAD
        Scanner scan = new Scanner(System.in);

=======
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int a = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int b = Integer.valueOf(scanner.nextLine());
        if (a > b){
            System.out.println("Greater number is: "+a);
        } else if (a < b){
            System.out.println("Greater number is: "+b);
        } else if (a==b) {
            System.out.println("The numbers are equal!");
        }
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
    }
}
