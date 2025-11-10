<<<<<<< HEAD

=======
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
<<<<<<< HEAD


        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();
=======
        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");
            String input = scan.nextLine();

>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
            if (input.equals("quit")) {
                break;
            }

<<<<<<< HEAD
        }
    }

=======
            String[] komanda = input.split(" ");
            String komanda0 = komanda[0];
            int komanda1 = Integer.valueOf(komanda[1]);

            // Ignore negative values
            if (komanda1 < 0) {
                continue;
            }

            if (komanda0.equals("add")) {
                firstContainer += komanda1;
                if (firstContainer > 100) {
                    firstContainer = 100;
                }
            }

            if (komanda0.equals("move")) {
                int amountToMove = Math.min(komanda1, firstContainer);
                firstContainer -= amountToMove;
                secondContainer += amountToMove;
                if (secondContainer > 100) {
                    secondContainer = 100;
                }
            }

            if (komanda0.equals("remove")) {
                secondContainer -= komanda1;
                if (secondContainer < 0) {
                    secondContainer = 0;
                }
            }
        }
    }
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
}
