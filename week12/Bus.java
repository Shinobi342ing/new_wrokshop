package week12;


/**
 * Write a description of class Bus here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bus
{
    String numberPlate;
    String color;
    String route;
    String customerName;
    boolean avialableStatus;
    int rate;
    
    public Bus(String numberPlate, String color, String route,String customerName, boolean availableStatus, int rate) {
        this.numberPlate = numberPlate;
        this.color = color;
        this.route = route;
        this.customerName = customerName;
        this.avialableStatus = availableStatus;
        this.rate = rate;
    }
            @Override
    public String toString() {
        return "number plate=" + numberPlate +", color=" + color +", route=" + route +", customer name=" + customerName +", available status=" + avialableStatus +", rate=" + rate;
    }

    
}