package week10;


/**
 * Write a description of class SavingsAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SavingsAccount extends Account {

    public SavingsAccount(int a, String n, double b) {
        super(a, n, b);
    }

    @Override
    public double calculateInterest() {
        return super.calculateInterest();
    }

    public double calculateInterest(double rate) {
        return this.getBalance() * rate;
    }
}
