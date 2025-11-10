
public class Program {

    public static void main(String[] args) {
        // This is simply an empty main method where you are
        // free to experiment with your Book class.
        // An example that you can use for testing:


        Book b = new Book("J. K. Rowling", "Harry Potter and the Sorcerer's Stone", 223);
        Book a = new Book("Klanti","Java",500);
        System.out.println(b);
        System.out.println(a);
        System.out.println(a.getAuthor());
        System.out.println(b.getPages());
        System.out.println("Total number of pages: "+(a.getPages()+b.getPages()));

    }
}
