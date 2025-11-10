
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
<<<<<<< HEAD

=======
        while (true){
        String fjalia = scanner.nextLine();
        String [] copetuar = fjalia.split(" ");
        if (fjalia.trim().isEmpty()){
                return;
        } else {
        for (int i=0; i<copetuar.length; i++){
                System.out.println(copetuar[i]);
        }
            }
        }
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df

    }
}
