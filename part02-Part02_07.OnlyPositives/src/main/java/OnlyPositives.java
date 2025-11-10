
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
<<<<<<< HEAD

=======
        while (true){
            System.out.println("Give a number: ");
            int num = scanner.nextInt();
            if (num <0 ){
                System.out.println("Unsuitable number");
            } else if (num >0) {
                System.out.println(num * num);
            } else if (num == 0) {
                break;
            }
                 
        }
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
    }
}
