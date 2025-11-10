
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
<<<<<<< HEAD

        // Write your program here
=======
        System.out.println("Where to? ");
        int num1 = scanner.nextInt();  
        System.out.println("Where from? ");
        int num2 = scanner.nextInt();
        while (num2 <= num1){
            System.out.println(num2);
            num2++;
        }
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
    }
}
