
import java.nio.file.Paths;
import java.util.Scanner;
<<<<<<< HEAD
import java.util.ArrayList;
=======
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
<<<<<<< HEAD
        ArrayList <Integer> numrat = new ArrayList<>();
=======
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
<<<<<<< HEAD
        try (Scanner reader = new Scanner(Paths.get(file))){
            while (reader.hasNextLine()){
                int n = Integer.valueOf(reader.nextLine());
                if ((n>= lowerBound) && (n<=upperBound)){
                numrat.add(n);
                }
            }
        }
        catch (Exception e) {
            System.out.println("Reading the file " + file+ "failed.");
        } 
        System.out.println("Numbers: " +numrat.size());
=======

>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
    }

}
