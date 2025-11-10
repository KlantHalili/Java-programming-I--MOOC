
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
<<<<<<< HEAD


=======
        int greatest = 0;
        while (true){
            String personi = scanner.nextLine();
            if (personi.equals("")){
                break;
            } else {
                String [] personii = personi.split(",");
                if (Integer.valueOf(personii[1])>greatest){
                greatest = Integer.valueOf(personii[1]);
            }
            }
        }
        System.out.println("Age of the oldest: " +greatest);
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
    }
}
