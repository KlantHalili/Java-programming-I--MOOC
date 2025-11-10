
import java.util.Scanner;

public class AVClub {

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
                for (int i=0; i<copetuar.length; i++){
                if (copetuar[i].contains("av")){
                    System.out.println(copetuar[i]);
                }
            }
            }
        }
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df

    }
}
