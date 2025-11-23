
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
    }
    Scanner scanner = new Scanner(System.in);
    Statistics stats = new Statistics();
    GradeDistribution dist = new GradeDistribution();

    while (true) {
        System.out.println("Enter point totals, -1 stops: ");
        int point = Integer.valueOf(scanner.nextLine());
        if (point == -1) {
            break;
        } else if (point < 0 || point > 100) {
            continue;
        }
        stats.addPoint(point);
    }

    // This is the missing part:
    System.out.println(stats.toString());

    dist.grades(stats);
    System.out.println("Grade distribution:");
    dist.printDistribution();
}
}
