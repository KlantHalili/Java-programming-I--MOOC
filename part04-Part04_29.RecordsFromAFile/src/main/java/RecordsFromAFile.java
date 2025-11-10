
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
    }
}
