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
import java.util.Scanner;
public class Statistics {
    private ArrayList<Integer> points;
    
    public Statistics (){
        this.points = new ArrayList<>();
    }
    
    public void addPoint(int number){
            points.add(number);
        }
    
    
    public int totalPoints(){
        int total = 0;
        for (int i: points){
            total += i;
        }
        return total;
    }
    
    public ArrayList<Integer> getPoints(){
        return this.points;
    }
    
    public String toString() {
    if (points.isEmpty()) {
        return "Point average (all): -";
    }
    return "Point average (all): " + 1.0 * totalPoints() / points.size()+"\n"
            +"Point average (passing): "+averageOfPassingGrades()+"\n"+
            "Pass percentage: "+1.0*numberOfPassing()/points.size()*100+"\n";
}
    
    public double averageOfPassingGrades(){
        int sum = 0;
        int count = 0;
        for(int i:points){
            if (i>=50){
                sum += i;
                count ++;
            }
        }
        return 1.0*sum/count;
    }
    
    public int numberOfPassing(){
        int count=0;
        for (int i:points){
            if (i>=50){
                count++;
            }
        }
        return count;
    }
}
