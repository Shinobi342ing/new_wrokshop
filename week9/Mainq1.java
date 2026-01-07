package week9;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mainq1
{
      public static void main(){
         
          car c1=new car(101,"BMW",1000000,2,"petrol");
          Bike b1=new Bike(102,"Yamaha",800000,1000);
          
          
          System.out.println("for car");
          c1.displayVehicleInfo();
          System.out.println("Tax="+c1.calculateTax());
          System.out.println("Final price="+c1.calculateFinalPrice());
          
          System.out.println("for bike");
          b1.displayVehicleInfo();
          System.out.println("Tax="+b1.calculateTax());
          System.out.println("Final price="+b1.calculateFinalPrice());
          
      }
}