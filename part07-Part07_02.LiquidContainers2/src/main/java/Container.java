/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Helius
 */
public class Container {
    private int liters;
    
    public Container(){
        this.liters = 0;
    }
    
    public int contains(){
        return this.liters;
    }
    
    public void add(int amount){
        if (amount>0){
            if (this.liters + amount <= 100){
                this.liters += amount;
            } else {
                this.liters = 100;
            }
        }
    }
    
    public void remove (int amount){
        if (amount > 0){
            if (this.liters - amount >=0){
                this.liters -= amount;
            } else {
            this.liters = 0;
            }
        }
    }
    
    public String toString(){
        return this.liters+"/100";
    }
    
}
