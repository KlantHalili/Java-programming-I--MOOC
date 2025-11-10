import java.util.Scanner;

public class UserInterface {
    private JokeManager shakate;
    private Scanner scanner;

    public UserInterface(JokeManager shakate, Scanner scanner) {
        this.shakate = shakate;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Commands:\n" +
                               "1 - add a joke\n" +
                               "2 - draw a joke\n" +
                               "3 - list jokes\n" +
                               "X - stop");
            String input = scanner.nextLine();

            if (input.equals("X")) {
                break;
            } else if (input.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                shakate.addJoke(joke);
            } else if (input.equals("2")) {
                System.out.println("Drawing a joke:");
                System.out.println(shakate.drawJoke());
            } else if (input.equals("3")) {
                System.out.println("Printing the jokes:");
                shakate.printJokes();
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}
