package week9;


/**
 * Write a description of class Employees here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employees
{
    protected int employeeId;
    protected String name;
    protected double basicSalary;
    public Employees(int id,String name, double salary){
        this.employeeId=id;
        this.name=name;
        this.basicSalary=salary;
    }
    public double calculateBonus(){
        return 0.1*this.basicSalary;
    }
    public void displayEmployee(){
        System.out.println("Id="+this.employeeId);
        System.out.println("name="+this.name);
        System.out.println("salray="+this.basicSalary);
        
    }
}