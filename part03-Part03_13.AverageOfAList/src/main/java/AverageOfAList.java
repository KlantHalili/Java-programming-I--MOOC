
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
<<<<<<< HEAD

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
=======
        ArrayList <Integer> list = new ArrayList<>();
        while (true){
            int number = scanner.nextInt();
            if (number == -1){
                break;
            }
            list.add(number);
            
        }
        int n=0;
        int sum =0;
        while (n<list.size()){
            sum = sum + list.get(n);
            n++;
        }
        double average = (1.0*sum/n);
        System.out.println("Average: "+average);
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
    }
}
