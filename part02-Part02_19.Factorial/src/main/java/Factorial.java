
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int n = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i<=n; i++){
            if (n ==0){
                factorial = 1;
            } else {
                factorial = factorial * i;
            }
        }
        System.out.println("Factorial: "+factorial);
    }
}
