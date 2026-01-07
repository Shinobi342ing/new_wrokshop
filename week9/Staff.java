package week9;


/**
 * Write a description of class Staff here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Staff extends Person
{
    private int workingHours;
    private int ratePerHour;
    //int id,String name,String cllgname,double salary
    public Staff(int id,String name,double salary,int hour,int rate){
        super(id,name,salary);
        this.workingHours=hour;
        this.ratePerHour=rate;
    }
    double calculateSalary(){
        return this.workingHours*this.ratePerHour;
    }
}