/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Helius
 */
public class Counter {
    private int numri;
    
    public Counter (int startValue){
        this.numri = startValue;
    }
    public Counter(){
        this(0);
    }
    
    public int value(){
        return this.numri;
    }
    
    public void increase(){
        this.numri++;
    }
    
    public void decrease(){
        this.numri--;
    }
    public void increase(int increaseBy){
        if (increaseBy<0){
            this.numri+=0;
        } else {
        this.numri+=increaseBy;
        }
    }
    
    public void decrease(int decreaseBy){
        if (decreaseBy>0){
        this.numri-=decreaseBy;
        }
    }
}
