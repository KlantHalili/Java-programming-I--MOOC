
import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int luku = Integer.valueOf(scanner.nextLine());
            if (luku == -1) {
                break;
            }

            numbers.add(luku);
        }
<<<<<<< HEAD
=======
        int n = 0;
        while (n<numbers.size()){
            System.out.println(numbers.get(n));
            n++;
        }
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df

    }
}
