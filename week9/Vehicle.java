package week9;

public class Vehicle
{
    protected int vehicleId;
    protected String brand;
    protected double BasePrice;
    public Vehicle(int vehicleId,String brandname,double price){
        this.vehicleId=vehicleId;
        this.brand=brandname;
        this.BasePrice=price;
    }
    public void displayVehicleInfo(){
        System.out.println("id="+this.vehicleId);
        System.out.println("brand="+this.brand);
        System.out.println("base price="+this.BasePrice);
    }
    public double calculateTax(){
        return this.BasePrice*0.1;
    }
}