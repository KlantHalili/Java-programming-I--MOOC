
import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
<<<<<<< HEAD

=======
        System.out.println("Give a string: ");
        String a = String.valueOf(scanner.nextLine());
        System.out.println("Give an integer:");
        int b = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double:");
        double c = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean:");
        boolean d = Boolean.valueOf(scanner.nextLine());
        
        System.out.println("You gave the string "+a);
        System.out.println("You gave the integer "+b);
        System.out.println("You gave the double "+c);
        System.out.println("You gave the boolean "+d);
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
    }
}
