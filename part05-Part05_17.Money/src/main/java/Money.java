
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money decreaser(Money decreaser){
        Money tempMoney;
        if (decreaser.cents<this.cents){
            tempMoney = new Money(decreaser.euros - 1, decreaser.cents+100);
        } else {
            tempMoney = new Money(decreaser.euros, decreaser.cents);
        }
        return tempMoney;
    }
    
    public Money plus(Money addition){
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
        return newMoney;
    }
    
    public boolean lessThan(Money compared){
    if (this.euros < compared.euros){
        return true;
    } else if (this.euros == compared.euros){
        return this.cents < compared.cents;
    }
    return false;
}

    
    public Money minus(Money decreaser) {
    int totalThis = this.euros * 100 + this.cents;
    int totalDecreaser = decreaser.euros * 100 + decreaser.cents;

    if (totalDecreaser > totalThis) {
        return new Money(0, 0);
    }

    int difference = totalThis - totalDecreaser;
    return new Money(difference / 100, difference % 100);
}



}
