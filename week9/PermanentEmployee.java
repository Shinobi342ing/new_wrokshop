package week9;


/**
 * Write a description of class PermanentEmployee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PermanentEmployee extends Employees
{
    private double HouseRentAllowance;
    private double DearnessAllowance;
    public PermanentEmployee(int id,String name, double salary,double HA, double DA){
        super(id,name,salary);
        this.HouseRentAllowance=HA;
        this.DearnessAllowance=DA;
    }
    public double calculateTotalSalary(){
        return super.basicSalary+this.HouseRentAllowance+this.DearnessAllowance+super.calculateBonus();
    }
}