
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
<<<<<<< HEAD


=======
        int longestName = 0;
        String longestNamee = "";
        int sum = 0;
        int count = 0;
        while (true){
            String fjalia = scanner.nextLine();
            if (fjalia.equals("")){
                break;
            } else {
                String [] fjaliaa = fjalia.split(",");
                    sum = sum+Integer.valueOf(fjaliaa[1]);
                    count++;
                if (fjaliaa[0].length()>longestName){
                    longestName = fjaliaa[0].length();
                    longestNamee = fjaliaa[0];
                }
            }
        }
        double average = (double)sum/count;
        System.out.println("Longest name: "+longestNamee);
        System.out.println("Average of birth years: "+average);
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
    }
}
