
import java.util.ArrayList;
import java.util.Scanner;

public class ListSize {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
<<<<<<< HEAD
=======
        int n=0;
        for (int i=0; i<list.size(); i++){
            n++;
        }
        System.out.println("In total: " +n);
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df

    }
}
