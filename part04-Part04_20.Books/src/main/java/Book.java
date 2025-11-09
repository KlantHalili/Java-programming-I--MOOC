/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Helius
 */
public class Book {
    private String title;
    private int pages;
    private int year;
    
    public Book (String name, int pages, int year){
        this.title = name;
        this.pages = pages;
        this.year = year;
    }
     
    public void print(String command) {
    if (command.equals("everything")) {
        System.out.println(this.title + ", " + this.pages + " pages, " + this.year);
    } else if (command.equals("name")) {
        System.out.println(this.title);
    } else if (command.equals("pages")) {
        System.out.println(this.pages);
    } else if (command.equals("year")) {
        System.out.println(this.year);
    } else {
        System.out.println("Enter a valid thing to search for...");
    }
}

}
