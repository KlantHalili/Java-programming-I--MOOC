
import java.util.ArrayList;
<<<<<<< HEAD
=======
import java.util.Scanner;
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df

public class PrintInRange {

    public static void main(String[] args) {
<<<<<<< HEAD
        // Try your method here
    }
=======
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true){
            int n = scanner.nextInt();
            if (n == -1){
                break;
            }
            list.add(n);
        }
        printNumbersInRange(list, 0, 5);
        // Try your method here
    }
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){
        for (Integer value : numbers){
            if (value <= upperLimit && value >=lowerLimit){
                System.out.println(value);
            }
        }
    }
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
    
}
