
public class Main {

    public static void main(String[] args) {
<<<<<<< HEAD
        PaymentCard petesCard = new PaymentCard(10);

        System.out.println("money " + petesCard.balance());
        boolean wasSuccessful = petesCard.takeMoney(8);
        System.out.println("successfully withdrew: " + wasSuccessful);
        System.out.println("money " + petesCard.balance());

        wasSuccessful = petesCard.takeMoney(4);
        System.out.println("successfully withdrew: " + wasSuccessful);
        System.out.println("money " + petesCard.balance());
=======
        PaymentTerminal terminal = new PaymentTerminal(); 
        PaymentCard card = new PaymentCard(10); 
        terminal.eatAffordably(card); 
        System.out.println(card.balance());
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
    }
}

