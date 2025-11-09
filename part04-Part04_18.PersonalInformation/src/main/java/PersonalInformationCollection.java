
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("First name: ");
            String emri = scanner.nextLine();
            if (emri.equals("")){
                break;
            }
            System.out.println("Last name: ");
            String mbiemri = scanner.nextLine();
            System.out.println("Identification number: ");
            String identifikimi = scanner.nextLine();
            infoCollection.add(new PersonalInformation(emri, mbiemri, identifikimi));
            
        }
        for (PersonalInformation info : infoCollection) {
         System.out.println(info.getFirstName() + " " + info.getLastName());
}


    }
}
