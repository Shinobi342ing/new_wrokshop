package week10;


/**
 * Write a description of class Nurse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Nurse extends person
{
    String shift;
    double extraAllowance;
    public Nurse(int id,String name, String shift, double allowance){
        super(id,name);
        this.shift=shift;
        this.extraAllowance=allowance;
    }
    @Override
    public double calculateSalary(){
        return super.calculateSalary()+this.extraAllowance*30;
    }
    

}