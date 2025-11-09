
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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

    }
}
