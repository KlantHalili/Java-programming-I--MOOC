
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
<<<<<<< HEAD

=======
        int count = 0;
        while (true){
            System.out.println("Give a number: ");
            int num = scanner.nextInt();
            if (num == 0){
                break;
            }
            count = count +1;
        }
        System.out.println("Number of numbers: "+count);
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
    }
}
