package week10;


/**
 * Write a description of class BikeDelivery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BikeDelivery extends DeliveryPartner
{
    public BikeDelivery(int id, String name, double pay){
    super(id,name,pay);
    }
    @Override
    public double calculatePayment() {
        return super.calculatePayment() + 1000;
    }

    public double calculatePayment(int extraOrders) {
        return calculatePayment() + extraOrders * 100;
    }    
}