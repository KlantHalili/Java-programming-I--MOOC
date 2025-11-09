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