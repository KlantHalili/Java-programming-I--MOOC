
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

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
        System.out.println("Search for? ");
        String kerkimi = scanner.nextLine();
        int n = 0;
        boolean gjetur = false;
        while (n<list.size()){
            if (list.get(n).equals(kerkimi)){
                gjetur = true;
            }
            n++;
        }
            if (gjetur == true){
                System.out.println(kerkimi+" was found!");
            }   else {
                System.out.println(kerkimi+ "was not found!");
            }
    }
}

