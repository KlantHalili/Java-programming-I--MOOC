
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter usename: ");
        String nameInput = scanner.nextLine();
        System.out.println("Enter password: ");
        String passInput = scanner.nextLine();
        String username1 = "alex";
        String password1="sunshine";
        String username2="emma";
        String password2="haskell";
        if ((nameInput.equals(username1)&&passInput.equals(password1)) || (nameInput.equals(username2)&&passInput.equals(password2))){
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
