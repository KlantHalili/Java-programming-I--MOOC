
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
<<<<<<< HEAD
        Scanner scanner = new Scanner(System.in);

        GradeRegister register = new GradeRegister();

        UserInterface ui = new UserInterface(register, scanner);
        ui.start();
=======
        GradeRegister register = new GradeRegister();
register.addGradeBasedOnPoints(93);
register.addGradeBasedOnPoints(91);
register.addGradeBasedOnPoints(92);
register.addGradeBasedOnPoints(88);
        System.out.println(register.totalSumOfGrades());

System.out.println(register.averageOfGrades());
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
    }
}
