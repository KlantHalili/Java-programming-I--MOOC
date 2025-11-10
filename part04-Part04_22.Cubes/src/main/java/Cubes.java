
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
<<<<<<< HEAD

=======
        System.out.println("Shruaj numra:");
        while (true){
            String input = scanner.nextLine();
            if (input.equals("end")){
                break;
            }
            System.out.println(Integer.valueOf(input)*Integer.valueOf(input)*Integer.valueOf(input));
        }
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
    }
}
