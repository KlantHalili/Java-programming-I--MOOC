
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
<<<<<<< HEAD
        // Write some code in here
    }
=======
        for (int i=0; i<array.length; i++){
            printStars(array[i]);
            System.out.println("");
        }
        // Write some code in here
    }
    
    public static void printStars (int number){
        int n=0;
        while(n<number){
            System.out.print("*");
            n++;
        }
    }
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df

}
