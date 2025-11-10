
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
<<<<<<< HEAD

=======
        int sum = 0;
        System.out.println("First number? ");
        int m = scanner.nextInt();
        System.out.println("Last number?");
        int n = scanner.nextInt();
        for (int i=m; i<=n; i++){
            sum = sum + i;
        }
        System.out.println("The sum is "+sum);
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
    }
}
