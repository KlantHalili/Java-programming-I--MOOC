
import java.util.ArrayList;
import java.util.Scanner;

public class LastInList {

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
        System.out.println(list.get(list.size()-1));
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df

    }
}
