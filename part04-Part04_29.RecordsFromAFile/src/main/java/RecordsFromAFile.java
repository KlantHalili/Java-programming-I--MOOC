
import java.nio.file.Paths;
import java.util.Scanner;
<<<<<<< HEAD
import java.util.ArrayList;
=======
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
<<<<<<< HEAD
        ArrayList <Double> ages = new ArrayList <>();
        ArrayList <String> names = new ArrayList<>();
        System.out.println("Name of the file:");
        String input = scanner.nextLine();
        try (Scanner reader = new Scanner(Paths.get(input))){
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                
                String [] parts = line.split(", ");
                String name = parts[0];
                double age = Double.valueOf(parts[1]);
                names.add(name);
                ages.add(age);
            }
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        for (int i=0; i<ages.size(); i++){
            if (ages.get(i)==1){
                System.out.println(names.get(i)+", age: "+ages.get(i)+" year");
            } else {
                System.out.println(names.get(i)+", age: "+ages.get(i)+" years");
            }
        }
=======

>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
    }
}
