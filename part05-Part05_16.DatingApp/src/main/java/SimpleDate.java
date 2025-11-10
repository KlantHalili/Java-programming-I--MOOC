
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
<<<<<<< HEAD
    
    public SimpleDate afterNumberOfDays(int days){
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        newDate.advance(days);
        return newDate;
    }
=======
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }
<<<<<<< HEAD
    
    public void advance(){
        this.day++;
        if (this.day>30){
            this.day = 1;
            this.month++;
            if (this.month >= 12){
                this.month = 1;
                this.year++;
            }
        }
    }
    
    public void advance(int howManyDays) {
    int totalDays = this.day + howManyDays;
    int addedMonths = totalDays / 30;
    this.day = totalDays % 30;

    int totalMonths = this.month + addedMonths;
    int addedYears = totalMonths / 12;
    this.month = totalMonths % 12;
    if (this.month == 0) {
        this.month = 12;
        addedYears--;
    }

    this.year += addedYears;
}

=======
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df

}
