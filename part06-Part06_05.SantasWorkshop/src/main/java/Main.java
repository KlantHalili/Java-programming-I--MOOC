<<<<<<< HEAD

public class Main {

    public static void main(String[] args) {


        // use this main method to try out your classes!

    }
}
=======
public class Main {
    public static void main(String[] args) {
        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);
        Gift book1 = new Gift("Harry Potter and the Philosopher's Stone", 5);

        Package gifts = new Package();
        gifts.addGift(book);
        gifts.addGift(book1);
        System.out.println(gifts.totalWeight());
    }
}
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
