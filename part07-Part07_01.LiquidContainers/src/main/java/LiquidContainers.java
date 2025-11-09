import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");
            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

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
}
