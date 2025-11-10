
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
<<<<<<< HEAD

=======
        System.out.print("Name: ");
        while (true){
            String person  = scanner.nextLine();
            if(person.equals("")){
                break;
            } else {
                Item item = new Item (String.valueOf(person));
                items.add(item);
            }
        }
        System.out.println(items);
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
    }
}
