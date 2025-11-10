
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
<<<<<<< HEAD


        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();
=======
        Container kontenjeri1 = new Container();
        Container kontenjeri2 = new Container();

        while (true) {
            System.out.println("First: " + kontenjeri1);
            System.out.println("Second: " + kontenjeri2);

            String input = scan.nextLine();

>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
            if (input.equals("quit")) {
                break;
            }

<<<<<<< HEAD
=======
            String[] komanda = input.split(" ");
            String komanda0 = komanda[0];
            int komanda1 = Integer.valueOf(komanda[1]);

            // Ignore negative values
            if (komanda1 < 0) {
                continue;
            }

            if (komanda0.equals("add")) {
                kontenjeri1.add(komanda1);
            }

            if (komanda0.equals("move")) {
                if (kontenjeri1.contains() >= komanda1){
                kontenjeri2.add(komanda1);
                kontenjeri1.remove(komanda1);
                } else {
                    kontenjeri2.add(kontenjeri1.contains());
                    kontenjeri1.remove(kontenjeri1.contains());
                }
            }

            if (komanda0.equals("remove")) {
                kontenjeri2.remove(komanda1);
            }
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
        }
    }

}
