import java.util.Scanner;

public class TextUI {
    private SimpleDictionary fjalet;
    private Scanner scanner;

    public TextUI(Scanner scanner, SimpleDictionary fjale){
        this.scanner = scanner;
        this.fjalet = fjale;
    }

    public void start(){
        while (true){
            System.out.print("Command: ");
            String komanda = scanner.nextLine();

            if (komanda.equals("add")){
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                fjalet.add(word, translation);
            } else if (komanda.equals("end")){
                System.out.println("Bye bye!");
                break;
            } else if (komanda.equals("search")){
                System.out.println("To be translated: ");
                String perkthyer = scanner.nextLine();
                if (fjalet.translate(perkthyer) == (null)){
                    System.out.println("Word "+perkthyer+" was not found");
                } else {
                System.out.println(fjalet.translate(perkthyer));
                }
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}
