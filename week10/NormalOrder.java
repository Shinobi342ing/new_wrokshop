package week10;


/**
 * Write a description of class NormalOrder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NormalOrder extends Order {

    public NormalOrder(int id, String n, double a) {
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
