
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
<<<<<<< HEAD
        //write some code here

        return -1;
=======
        int greatest = number1;
        if (number2> greatest){
            greatest = number2;
        }
        if (number3 > greatest){
            greatest = number3;
        }
        return greatest;
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
