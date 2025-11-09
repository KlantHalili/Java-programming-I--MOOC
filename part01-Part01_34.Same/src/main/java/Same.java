
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here 
        System.out.println("Enter the first string:");
        String fjalia1 = scanner.nextLine();
        System.out.println("Enter the second string:");
        String fjalia2 = scanner.nextLine();
        if (fjalia1.equals (fjalia2)){
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
