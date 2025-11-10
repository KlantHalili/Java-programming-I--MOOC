
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
<<<<<<< HEAD
        ArrayList<Item> list = new ArrayList();

        //loop to ask for input until an empty string is entered
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            if(id.isEmpty()){
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            
            //constructs an Archive object based on the input
            Item item = new Item(id, name);
            
            //checks if the ID of the input already exists on our Archive list, 
            //if it doesn't it adds it to the list
            if(!(list.contains(item))){
                list.add(item);
            } 
        }
        
        //Prints out each item based on the toString method 
        System.out.println("==Items==");
        for(Item item : list){
            System.out.println(item);
        }

    }
}
=======


    }
}
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
