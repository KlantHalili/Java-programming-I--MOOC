
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
<<<<<<< HEAD
=======
        ArrayList <Integer> list = new ArrayList<>();
        while (true){
            int input = scanner.nextInt();
            if (input == 9999){
                break;
            }
            list.add(input);
        }
        
        int smallest = list.get(0);
        for (int i=0 ; i<list.size(); i++){
            if (list.get(i)<=smallest){
                smallest = list.get(i);
            }
            System.out.println("Smallest number: "+smallest);
            System.out.println("Found at index" +i);
        }
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        
    }
}
