
public class PaymentCard {

    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

<<<<<<< HEAD
    public void addMoney(double increase) {
        this.balance += increase;
=======
    public boolean addMoney(double increase) {
        if (increase > 0){
        this.balance += increase;
        return true;
        }
        return false;
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
    }

    public boolean takeMoney(double amount) {
        if (balance()>=amount){
<<<<<<< HEAD
            this.balance = balance()-amount;
=======
            this.balance = this.balance - amount;
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
            return true;
        }
        // implement the method so that it only takes money from the card if
        // the balance is at least the amount parameter.
        // returns true if successful and false otherwise
        return false;
    }
}
