
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int greatest = 0;
        String emri = "";
        while (true){
            String personi = scanner.nextLine();
            if (personi.equals("")){
                break;
            } else {
                String [] personii = personi.split(",");
                if (Integer.valueOf(personii[1])>greatest){
                greatest = Integer.valueOf(personii[1]);
                emri = personii[0];
            }
            }
        }
        System.out.println("Name of the oldest: "+emri);
    }
}
