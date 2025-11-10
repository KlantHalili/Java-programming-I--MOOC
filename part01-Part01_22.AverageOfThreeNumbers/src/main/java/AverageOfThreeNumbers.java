
import java.util.Scanner;

public class AverageOfThreeNumbers {

<<<<<<< HEAD
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here

=======
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int a = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int b = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int c = Integer.valueOf(scanner.nextLine());
        double average = (double)(a+b+c)/3;
        System.out.println("The average is "+average);
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
    }
}
