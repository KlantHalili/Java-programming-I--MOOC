
import java.util.ArrayList;
import java.util.Scanner;

public class SecondPlusThird {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            
            numbers.add(number);
        }
<<<<<<< HEAD

        System.out.println(luvut.get(0));
=======
        int sum = numbers.get(1) + numbers.get(2);

        System.out.println(sum);
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
    }
}
