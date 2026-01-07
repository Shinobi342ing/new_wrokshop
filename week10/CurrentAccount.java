package week10;


/**
 * Write a description of class CurrentAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CurrentAccount extends Account {

    public CurrentAccount(int a, String n, double b) {
        super(a, n, b);
    }

    @Override
    public double calculateInterest() {
        return this.getBalance() * 0.02;
    }
    
     public double calculateInterest(double rate) {
        return this.getBalance() * rate;
    }
}
