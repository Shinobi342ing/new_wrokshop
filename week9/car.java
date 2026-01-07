package week9;


/**
 * Write a description of class car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class car extends Vehicle
{
    private int numberOfDoors;
    private String FuelType;
    
    public car(int Id,String brandname,double price, int doors, String type){
       super(Id,brandname,price);
       this.numberOfDoors=doors;
       this.FuelType=type;
    }
    public void cardetails(){
       super.displayVehicleInfo();
    }
    public double calculateFinalPrice(){
        return super.calculateTax()+super.BasePrice+super.BasePrice*0.05;
    }
}