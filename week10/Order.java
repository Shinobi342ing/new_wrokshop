package week10;


/**
 * Write a description of class Order here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Order
{
    private int orderId;
    private String customerName;
    private double amount;
    public Order(int id, String name,double amount){
        this.orderId=id;
        this.customerName=name;
        this.amount=amount;
    }
    @Override
    public String toString(){
        return "order ID="+this.orderId+"customer name="+this.customerName+",amount="+this.amount;
        
    }
    
     public double calculateFinalAmount() {
        return amount;
    }
}