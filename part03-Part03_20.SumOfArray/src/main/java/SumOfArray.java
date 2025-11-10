
public class SumOfArray {

    public static void main(String[] args) {
        // You can try the method here
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sumOfNumbersInArray(array));
    }

    public static int sumOfNumbersInArray(int[] array) {
<<<<<<< HEAD
        // Write some code here
        return 0;
=======
        int sum =0;
        for (int i=0; i<array.length; i++){
            sum = sum + array[i];
        }// Write some code here
        return sum;
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
    }
}
