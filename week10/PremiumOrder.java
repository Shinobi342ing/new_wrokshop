package week10;


/**
 * Write a description of class PremiumOrder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PremiumOrder extends Order {

    public PremiumOrder(int id, String n, double a) {
        super(id, n, a);
    }

    @Override
    public double calculateFinalAmount() {
        return super.calculateFinalAmount();
    }
    
     public double calculateFinalAmount(double discountAmount) {
        return super.calculateFinalAmount()-discountAmount;
    }
}