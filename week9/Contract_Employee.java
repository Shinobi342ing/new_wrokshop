package week9;


/**
 * Write a description of class Contract_Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Contract_Employee extends Employees
{
    private int workingDays;
    public Contract_Employee(int id,String name, double salary,int day){
        super(id,name,salary);
        this.workingDays=day;
    }
    public double calculateTotalSalary(){
        return super.basicSalary*this.workingDays;
    }
}