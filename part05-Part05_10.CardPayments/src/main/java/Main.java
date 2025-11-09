
public class Main {

    public static void main(String[] args) {
        PaymentTerminal terminal = new PaymentTerminal(); 
        PaymentCard card = new PaymentCard(10); 
        terminal.eatAffordably(card); 
        System.out.println(card.balance());
    }
}

