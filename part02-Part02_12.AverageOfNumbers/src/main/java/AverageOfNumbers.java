
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
<<<<<<< HEAD

=======
        int count = 0;
        int sum = 0;
        while (true){
            System.out.println("Give a number: ");
            int num = scanner.nextInt();
            if (num == 0){
                break;
            }
            count ++;
            sum += num;
        }
        double average = (double)sum/count;
        System.out.println("Average of the numbers: "+average);
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
    }
}
