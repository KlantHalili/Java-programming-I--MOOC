
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }
<<<<<<< HEAD

=======
        System.out.println("From where? ");
        int fillim = scanner.nextInt();
        System.out.println("To where? ");
        int mbarim = scanner.nextInt();
        while(fillim <= mbarim){
            System.out.println(numbers.get(fillim));
            fillim++;
        }
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
    }
}
