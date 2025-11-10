
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
<<<<<<< HEAD

    public GradeRegister() {
        this.grades = new ArrayList<>();
=======
    private ArrayList<Integer> examPoints;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.examPoints = new ArrayList<>();
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
<<<<<<< HEAD
=======
        this.examPoints.add(points);
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }
<<<<<<< HEAD
=======
    
    
    public int totalSumOfGrades(){
        int shuma = 0;
        for(int notat: grades){
            shuma += notat;
        }
        return shuma;
    }
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
<<<<<<< HEAD
=======
    
    public double averageOfGrades(){
        if (grades.isEmpty()){
            return -1;
        }
        return 1.0 * totalSumOfGrades()/grades.size();
    }
    
    public double averageOfPoints(){
        if (examPoints.isEmpty()){
            return -1;
        }
        int shumaPikeve = 0;
        for (int piket: examPoints){
            shumaPikeve += piket;
        }
        return 1.0 * shumaPikeve / examPoints.size();
    }
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
}
