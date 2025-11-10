
public class Statistics {
<<<<<<< HEAD
    private int number;
    private int count;
    
    public Statistics (){
        this.number = 0;
        this.count = 0;
    }
    
    public void addNumber(int number){
            this.number = this.number + number;
            count++;
    }
    
    public int getCount(){
        return count;
    }
    
    public int sum(){
        int sum = 0;
        if (count == 0){
            return 0;
        } else {
            sum = sum+this.number;
        }
        return sum;
    }
    
    public double average(){
        double average = 0;
        if (count == 0){
            return 0;
        } else {
            average = (double)sum() / count;
        }
        return average;
    }
=======
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
}
