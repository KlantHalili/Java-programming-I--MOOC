
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");
<<<<<<< HEAD

        // toteuta listan lukujen summan laskeminen tänne
=======
        int n=0;
        int sum =0;
        while (n<list.size()){
            sum = sum + list.get(n);
            n++;
        }
        System.out.println("Sum: " +sum);
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
    }
}
