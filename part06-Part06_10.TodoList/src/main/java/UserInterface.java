/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Helius
 */
import java.util.Scanner;
public class UserInterface {
    private Scanner scanner;
    private TodoList itenerari;
    
    public UserInterface(TodoList itenerari, Scanner scanner){
        this.itenerari = itenerari;
        this.scanner = scanner;
    }
    
    public void start(){
        while (true){
            System.out.println("Command: ");
            String komanda = scanner.nextLine();
            if (komanda.equals("stop")){
                break;
            } else if (komanda.equals("add")){
                System.out.println("To add: ");
                String adding = scanner.nextLine();
                itenerari.add(adding);
            } else if (komanda.equals("list")){
                itenerari.print();
            } else if (komanda.equals("remove")){
                System.out.println("Which one to be removed?");
                int id = scanner.nextInt();
                itenerari.remove(id);
            }
        }
    }
    
}
