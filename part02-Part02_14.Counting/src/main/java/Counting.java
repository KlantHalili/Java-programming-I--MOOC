
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fillim = 0;
        int num = scanner.nextInt();
        while (fillim <= num){
            System.out.println(fillim);
            fillim ++;
        }
    }
}
