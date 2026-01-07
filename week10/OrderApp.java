package week10;


/**
 * Write a description of class OrderApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OrderApp {
    public static void main(String[] args) {
        PremiumOrder p = new PremiumOrder(101, "Suman", 10000);
        NormalOrder n=new NormalOrder(102,"Victoria",20000);
        System.out.println( n+ " Final Amount: " + n.calculateFinalAmount(1500));
        System.out.println(p + " Final Amount: " + p.calculateFinalAmount(1500));
    }
}
