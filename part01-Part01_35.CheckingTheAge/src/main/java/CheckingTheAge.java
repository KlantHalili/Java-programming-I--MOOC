
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
<<<<<<< HEAD
        Scanner scan = new Scanner(System.in);

=======
        Scanner scanner = new Scanner(System.in);
        System.out.print("How old are you? ");
        int age = scanner.nextInt();
        if (age >= 0 && age <= 120){
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
    }
}
