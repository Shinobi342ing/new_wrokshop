package week9;


/**
 * Write a description of class Teacher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Teacher extends Person
{
    private String subject;
    private double bonus;
    public Teacher(int id,String name,double salary,String subject, double bonus){
        super(id,name,salary);
        this.subject=subject;
        this.bonus=bonus;
    }
    @Override
    double calculateAnnualSalary(){
        return super.calculateAnnualSalary()+this.bonus;
    }
}