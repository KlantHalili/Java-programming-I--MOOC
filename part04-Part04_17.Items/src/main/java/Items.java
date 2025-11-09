
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
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
    }
}
