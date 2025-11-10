
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        System.out.println("");
<<<<<<< HEAD

        // implement finding the greatest number in the list here
    }
=======
        int greatest = 0;
        for (int i=0 ; i<list.size(); i++){
        // implement finding the greatest number in the list here
        if (list.get(i)>greatest){
            greatest = list.get(i);
        }
    }
        System.out.println("The greatest number: " +greatest);
}
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
}
