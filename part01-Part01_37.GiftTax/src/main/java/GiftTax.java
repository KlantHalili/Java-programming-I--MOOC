
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
<<<<<<< HEAD
        Scanner scan = new Scanner(System.in);

=======
        Scanner scanner = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int value = Integer.valueOf(scanner.nextLine());
        double tax = 0;
        
        if (value < 5000){
            System.out.println("No Tax!");
        } else if (value < 25000){
            tax = ((value - 5000)*0.08 + 100);
            System.out.println("Tax: " +tax);
        } else if (value < 55000){
            tax = ((value - 25000)*0.1 + 1700);
            System.out.println("Tax: " +tax);
        } else if (value < 200000){
            tax = ((value - 55000)*0.12 + 4700);
            System.out.println("Tax: " +tax);
        } else if (value < 1000000){
            tax = ((value - 200000)*0.15 + 22100);
            System.out.println("Tax: " +tax);
        } else if (value >= 1000000){
            tax = ((value - 1000000)*0.17 + 142100);
            System.out.println("Tax: " +tax);
        }
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
    }
}
