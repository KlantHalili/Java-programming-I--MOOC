

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);

    }
    public static void printFromNumberToOne (int number){
        int n = 1;
        while (number >= 1){
            System.out.println(number);
            number --;
        }
    }

}
