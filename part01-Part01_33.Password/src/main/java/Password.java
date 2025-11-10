
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
<<<<<<< HEAD
        Scanner scan = new Scanner(System.in);

        // Write your program here 
=======
        Scanner scanner = new Scanner(System.in);

        // Write your program here 
        System.out.println("Password?");
        String pass = scanner.nextLine();
        if (pass.equals ("Caput Draconis")){
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
    }
}
