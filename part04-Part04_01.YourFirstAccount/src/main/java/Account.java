/* 
 * DO NOT TOUCH THIS !
 */

public class Account {

<<<<<<< HEAD
    private double balance;
=======
    double balance;
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
    private String owner;

    public Account(String owner, double balance) {
        this.balance = balance;
        this.owner = owner;
    }

    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    public void withdrawal(double amount) {
        this.balance = this.balance - amount;
    }

    public double saldo() {
        return this.balance;
    }

    @Override
    public String toString() {
        return this.owner + " balance: " + this.balance;
    }
}
