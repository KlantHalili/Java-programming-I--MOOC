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
public class Room {
    private ArrayList<Person> people;
    
    public Room(){
        this.people = new ArrayList<>();
    }
    
    public void add(Person person){
        this.people.add(person);
    }
    
    public boolean isEmpty(){
        if (people.isEmpty()){
            return true;
        }
        return false;
    }
    
    public ArrayList<Person> getPersons(){
        return this.people;
    }
    
    public Person shortest(){
        if(people.isEmpty()){
            return null;
        }
        Person shortestPerson = people.get(0);
        for (int i=0; i<people.size(); i++){
            if (people.get(i).getHeight() < shortestPerson.getHeight()){
                shortestPerson = people.get(i);
            }
        }
        return shortestPerson;
    }
    
    public Person take(){
        if(people.isEmpty()){
            return null;
        }
        Person shortestPerson = shortest();
        people.remove(shortestPerson);
        return shortestPerson;
    }
}
