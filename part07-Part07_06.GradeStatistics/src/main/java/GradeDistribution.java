/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Helius
 */
import java.util.ArrayList;
public class GradeDistribution {
    private ArrayList<Integer> grades;
    
    public GradeDistribution(){
        this.grades = new ArrayList<>();
    }
    
    public void grades(Statistics stats){
        for (int i: stats.getPoints()){
            grades.add(pointsToGrades(i));
        }
    }
    
    public int pointsToGrades(int point){
        if (point<50){
            return 0;
        } else if (point<60){
            return 1;
        } else if (point<70){
            return 2;
        } else if (point <80){
            return 3;
        } else if (point < 90){
            return 4;
        } else {
            return 5;
        }
    }
    public void printDistribution() {
    for (int grade = 5; grade >= 0; grade--) {
        System.out.print(grade + ": ");
        for (int g : grades) {
            if (g == grade) {
                System.out.print("*");
            }
        }
        System.out.println();
    }
}

}
