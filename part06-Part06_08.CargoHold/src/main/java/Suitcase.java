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
public class Suitcase {
    private ArrayList <Item> items;
    private int maxWeight;
    
    public Suitcase(int weight){
        this.items = new ArrayList<>();
        this.maxWeight = weight;
    }
    
    public void addItem (Item item){
        int totalweight = 0;
        for (int i=0; i<items.size(); i++){
            totalweight += items.get(i).getWeight();
        }
        if (totalweight + item.getWeight()<=this.maxWeight){
            items.add(item);
        }
    }
    
    public String toString(){
        int totalWeight = 0;
        for (Item items: items){
            totalWeight += items.getWeight();
        }
        if (items.isEmpty()){
            return "no items (0kg)";
        } else if (items.size() == 1){
            return items.size()+" item ("+ totalWeight+" kg)";
        }
        return items.size()+" items ("+ totalWeight+" kg)";
    }
    
    public void printItems() {
    for (Item item : items) {
        System.out.println(item);
    }
}

    
    public int totalWeight(){
        int totalWeight = 0;
        for (Item items: items){
            totalWeight += items.getWeight();
        }
        return totalWeight;
    }
    
    public Item heaviestItem(){
        if (items.isEmpty()){
            return null;
        }
        Item heaviestForNow = items.get(0);
        for (Item copat: items){
            if (copat.getWeight() >= heaviestForNow.getWeight()){
                heaviestForNow = copat;
            }
        }
        return heaviestForNow;
    }
}
