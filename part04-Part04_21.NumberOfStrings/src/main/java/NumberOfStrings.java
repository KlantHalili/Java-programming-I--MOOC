
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
<<<<<<< HEAD

=======
        System.out.println("Shkruaj stringa: ");
        int count = 0;
        while (true){
            String input = scanner.nextLine();
            if (input.equals("end")){
                break;
            }
            count++;
        }
        System.out.println(count);
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
    }
}
