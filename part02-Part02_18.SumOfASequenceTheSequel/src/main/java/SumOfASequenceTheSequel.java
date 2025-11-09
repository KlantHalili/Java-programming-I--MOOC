
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("First number? ");
        int m = scanner.nextInt();
        System.out.println("Last number?");
        int n = scanner.nextInt();
        for (int i=m; i<=n; i++){
            sum = sum + i;
        }
        System.out.println("The sum is "+sum);
    }
}
