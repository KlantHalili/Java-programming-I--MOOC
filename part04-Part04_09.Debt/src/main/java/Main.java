
public class Main {

    public static void main(String[] args) {
        // Test your Debt class here
<<<<<<< HEAD
        Debt mortgage = new Debt(120000.0, 1.01);
        mortgage.printBalance();

        mortgage.waitOneYear();
        mortgage.printBalance();

        int years = 0;

        while (years < 20) {
            mortgage.waitOneYear();
            years = years + 1;
        }

        mortgage.printBalance();
=======
        //Debt mortgage = new Debt(120000.0, 1.01);
        //mortgage.printBalance();

        //mortgage.waitOneYear();
        //mortgage.printBalance();

        //int years = 0;

        //while (years < 20) {
        //    mortgage.waitOneYear();
        //    years = years + 1;
        //}

        //mortgage.printBalance();
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
    }
}
