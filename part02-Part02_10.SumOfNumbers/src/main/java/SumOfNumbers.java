
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
<<<<<<< HEAD

=======
        int sum = 0;
        while (true){
            System.out.println("Give a number: ");
            int num = scanner.nextInt();
            if (num == 0){
                break;
            }
            sum = sum + num;
        }
        System.out.println("Sum of the numbers: "+sum);
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
    }
}
