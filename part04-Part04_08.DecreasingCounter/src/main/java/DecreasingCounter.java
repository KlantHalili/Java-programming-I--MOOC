
public class DecreasingCounter {

    private int value;  // an object variable for storing the value of the counter

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue() {
        // Do not change this code!
        System.out.println("value: " + this.value);
    }

    public void decrement() {
<<<<<<< HEAD
        if (this.value>= 1){
        this.value = this.value - 1;
        } else {
            this.value = 0;
        }
        // write the method implementation here
        // the aim is to decrement the value of the counter by one
    }
    public void reset(){
        this.value = 0;
    }
=======
        // write the method implementation here
        // the aim is to decrement the value of the counter by one
    }
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df

    // the other methods go here
}
