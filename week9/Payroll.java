package week9;


/**
 * Write a description of class Payroll here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Payroll
{
   public static void main(){
       //int id,String name, double salary,double HA, double DA
       PermanentEmployee pe=new PermanentEmployee(1,"Ram",15000,5000,3000);
       Contract_Employee ce=new Contract_Employee(2,"Hari",15000,6);
       
       System.out.println("For PermanentEmployee");
       pe.displayEmployee();
       System.out.println("total salary="+pe.calculateTotalSalary());
       
       System.out.println("For Contract Employee");
       ce.displayEmployee();
      System.out.println("total salary="+ce.calculateTotalSalary());
       
   }
}