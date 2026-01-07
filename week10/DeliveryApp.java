package week10;


/**
 * Write a description of class DeliveryApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeliveryApp {
    public static void main(String[] args) {
        BikeDelivery b = new BikeDelivery(101, "Hari", 8000);
        CarDelivery c = new CarDelivery(102, "Shyam", 10000);

        System.out.println(b);
        System.out.println(c);
    }
}
