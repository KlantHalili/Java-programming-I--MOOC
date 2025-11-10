/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Helius
 */
public class Bird {
    private String name;
    private String latinName;
    private int observations;
    
    public Bird(String name, String latin){
        this.name = name;
        this.latinName = latin;
        this.observations = 0;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getLatin(){
        return this.latinName;
    }
    
    public int observations(){
        return this.observations;
    }
    
    public void observe(){
        this.observations ++;
    }
    
    public String toString(){
        return name + " (" +latinName+"): "+observations+" observations";
    }
}
