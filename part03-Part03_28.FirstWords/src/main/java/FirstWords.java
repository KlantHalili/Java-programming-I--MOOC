
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
<<<<<<< HEAD


=======
        while (true){
            String fjalia = scanner.nextLine();
            if (fjalia.equals("")){
                break;
            } else {
                String [] copetuar = fjalia.split(" ");
                System.out.println(copetuar[0]);
            }
        }
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
    }
}
