
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
<<<<<<< HEAD
=======
    
    public boolean equals (Object compared){
        if (this == compared){
            return true;
        }
        if (!(compared instanceof Book)){
            return false;
        }
        
        Book comparedBook = (Book) compared;
        
        if (this.name.equals(comparedBook.name) &&
            this.publicationYear == comparedBook.publicationYear){
            return true;
        }
        return false;
    }
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df

}
