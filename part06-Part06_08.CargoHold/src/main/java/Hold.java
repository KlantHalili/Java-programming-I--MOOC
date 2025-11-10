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
public class Hold {
    private ArrayList <Suitcase> cantat;
    private int maxWeight;
    
    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.cantat = new ArrayList <>();
    }
    public void addSuitcase(Suitcase suitcase){
        int suitcasesweight = 0;
        for (int i=0; i<cantat.size(); i++){
            suitcasesweight += cantat.get(i).totalWeight();
        }
        if (suitcasesweight + suitcase.totalWeight()<=this.maxWeight){
            cantat.add(suitcase);
        }
    }
    
    public String toString(){
        int holdWeight = 0;
        for (Suitcase canta: cantat){
            holdWeight += canta.totalWeight();
        }
        return cantat.size()+" suitcases (" +holdWeight+" kg)";
    }
    
    public void printItems(){
        for (Suitcase canta : cantat) {
            canta.printItems();
        }
    }
}
