

public class Agent {

    private String firstName;
    private String lastName;
    
    public Agent(String initFirstName, String initLastName) {
        this.firstName = initFirstName;
        this.lastName = initLastName;
    }
    
<<<<<<< HEAD
    public String toString(){
        return "My name is " + this.lastName + ", " +this.firstName+" "+this.lastName;
=======
    public void print() {
    System.out.println("My name is " + this.lastName + ", " + this.firstName + " " + this.lastName);
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
    }
    
}
