
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
<<<<<<< HEAD
        Scanner scan = new Scanner(System.in);

        // Write your program here 
=======
        Scanner scanner = new Scanner(System.in);

        // Write your program here 
        System.out.println("Give a number:");
        int a = scanner.nextInt();
        if ((a % 2)== 0){
            System.out.println("Number "+a+" is even.");
        } else {
            System.out.println("Number "+a+" is odd.");
        }
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
        // HINT:
        // You can find out if a number is even or odd easily using the modulo operator %
        // Try the following commands to see what they print
        // System.out.println( 1%2 );
        // System.out.println( 2%2 );
        // System.out.println( 3%2 );
        // System.out.println( 4%2 );
        // System.out.println( 5%2 );
        // System.out.println( 6%2 );
        // System.out.println( 7%2 );
        // int luku = 8
        // System.out.println( luku%2 );
        // So, by taking the modulo of a number and two you can find out if it is even or odd !
    }
}
