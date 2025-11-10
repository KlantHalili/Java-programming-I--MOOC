
public class HealthStation {
<<<<<<< HEAD


    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        return -1;
=======
    private int counter;


    public int weigh(Person person) {
        this.counter++;
        return person.getWeight();
    }
    
    public void feed(Person person){
        person.setWeight(person.getWeight()+1);
    }
    public int weighings(){
        return this.counter;
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
    }

}
