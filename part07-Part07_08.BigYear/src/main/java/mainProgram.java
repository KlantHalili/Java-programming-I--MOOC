
import java.util.Scanner;
<<<<<<< HEAD

=======
import java.util.ArrayList;
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

<<<<<<< HEAD
        Scanner scan = new Scanner(System.in);

=======
        Scanner scanner = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<>();
        while (true){
            System.out.println("?");
            String input = scanner.nextLine();
            if (input.equals("Add")){
                System.out.println("Name: ");
                String name = scanner.nextLine();
                System.out.println("Name in Latin: ");
                String latin = scanner.nextLine();
                birds.add(new Bird(name, latin));
            } else if (input.equals("Observation")){
                System.out.println("Bird?");
                String birdInput = scanner.nextLine();
                for (Bird zogu: birds){
                    if(!(zogu.getName().contains(birdInput))){
                        System.out.println("Not a bird!");
                    } else {
                        zogu.observe();
                    }
                }
            }else if (input.equals("Observation")) {
                System.out.println("Bird?");
                String birdInput = scanner.nextLine();
                boolean found = false;

                for (Bird zogu : birds) {
                    if (zogu.getName().equals(birdInput)) {
                        zogu.observe();
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Not a bird!");
                }
            } else if (input.equals("All")){
                for (Bird zogu: birds){
                    System.out.println(zogu);
                }
            } else if (input.equals("One")){
                System.out.println("Bird?");
                String zoguInput = scanner.nextLine();
                for (Bird zogu: birds){
                    if(zogu.getName().equals(zoguInput)){
                        System.out.println(zogu);
                    }
                }
            } else if (input.equals("Quit")){
                break;
            } else {System.out.println("Please give a valid command");
            continue;
            }
        }
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
    }

}
