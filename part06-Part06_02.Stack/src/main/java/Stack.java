/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KlantHalili
 */
import java.util.ArrayList;
public class Stack {
    ArrayList <String> Stack;
    
    public Stack(){
        this.Stack = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        if(Stack.isEmpty()){
            return true;
        }
        return false;
    }
    
    public void add(String value){
        Stack.add(value);
    }
    
    public ArrayList<String> values(){
        return this.Stack;
    }
    
    public String take(){
        String vlerafunit = Stack.get(Stack.size()-1);
        Stack.remove(Stack.get(Stack.size()-1));
        return vlerafunit;
    }
}
