import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
<<<<<<< HEAD
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

=======
        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter programs (leave name empty to stop):");

        while (true) {
            System.out.print("Name: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.print("Duration: ");
            int duration = scanner.nextInt();
            scanner.nextLine(); // consume leftover newline

            programs.add(new TelevisionProgram(name, duration));
        }

        System.out.print("Program's maximum duration? ");
        int max = scanner.nextInt();

        System.out.println("\nPrograms with duration at most " + max + " minutes:");
        for (TelevisionProgram program : programs) {
            if (program.getDuration() <= max) {
                System.out.println(program);
            }
        }
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
    }
}
