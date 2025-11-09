
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan (Apartment compared){
        if (this.squares > compared.squares){
            return true;
                    }
        return false;
    }
    
    public int priceDifference (Apartment compared){
        int thisAp = this.princePerSquare * this.squares;
        int calledAp = compared.princePerSquare * compared.squares;
        int difference = calledAp - thisAp;
        if (difference < 0){
            difference = difference * (-1);
        }
        return difference;
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        int thisAp = this.princePerSquare * this.squares;
        int calledAp = compared.princePerSquare * compared.squares;
        if (thisAp > calledAp){
            return true;
        }
        return false;
        
    }

}
