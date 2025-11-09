
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Shruaj numra:");
        while (true){
            String input = scanner.nextLine();
            if (input.equals("end")){
                break;
            }
            System.out.println(Integer.valueOf(input)*Integer.valueOf(input)*Integer.valueOf(input));
        }
    }
}
