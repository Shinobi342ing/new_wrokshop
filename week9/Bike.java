package week9;


/**
 * Write a description of class scooter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bike extends Vehicle
{   
   private int engineCapacity;
   public Bike(int Id,String brandname,double price,int cc){
       super(Id,brandname,price);
       this.engineCapacity=cc;
   }
   public double calculateFinalPrice(){
       return super.calculateTax()+super.BasePrice;
   }
}