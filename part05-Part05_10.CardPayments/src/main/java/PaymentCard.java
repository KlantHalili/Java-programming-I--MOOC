
public class PaymentCard {

    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public boolean addMoney(double increase) {
        if (increase > 0){
        this.balance += increase;
        return true;
        }
        return false;
    }

    public boolean takeMoney(double amount) {
        if (balance()>=amount){
            this.balance = this.balance - amount;
            return true;
        }
        // implement the method so that it only takes money from the card if
        // the balance is at least the amount parameter.
        // returns true if successful and false otherwise
        return false;
    }
}
