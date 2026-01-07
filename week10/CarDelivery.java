package week10;


/**
 * Write a description of class CarDelivery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CarDelivery extends DeliveryPartner {

    public CarDelivery(int id, String name, double pay) {
        super(id, name, pay);
    }

    @Override
    public double calculatePayment() {
        return super.calculatePayment() + 3000;
    }

    public double calculatePayment(int extraOrders) {
        return calculatePayment() + extraOrders * 200;
    }
}