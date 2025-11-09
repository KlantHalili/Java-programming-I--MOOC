
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String fjalia = scanner.nextLine();
            if (fjalia.equals("")){
                break;
            } else {
                String [] copetuar = fjalia.split(" ");
                System.out.println(copetuar[0]);
            }
        }
    }
}
