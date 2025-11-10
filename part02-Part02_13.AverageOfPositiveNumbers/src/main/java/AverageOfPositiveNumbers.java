
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
<<<<<<< HEAD

=======
        int count = 0;
        int sum = 0;
        while (true){
            int num = scanner.nextInt();
            if (num == 0){
                System.out.println("Cannot calculate the average");
                break;
            } else if ( num >0){
                count ++;
                sum += num;
            } else {
                System.out.println("Cannot calculate the average");
            }
        }
        double average = (double) sum / count;
        System.out.println(average);
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
    }
}
