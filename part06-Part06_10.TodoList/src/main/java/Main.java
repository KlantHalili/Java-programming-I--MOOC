
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
<<<<<<< HEAD

        // Here you can try out the combined functionality of your classes
        TodoList list = new TodoList();
        Scanner scanner = new Scanner(System.in);

        UserInterface ui = new UserInterface(list, scanner);
        ui.start();
=======
        TodoList list = new TodoList();
list.add("read the course material");
list.add("watch the latest fool us");
list.add("take it easy");
list.print();
list.remove(2);
list.print();
list.add("buy raisins");
list.print();
list.remove(1);
list.remove(1);
list.print();
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df

    }
}
