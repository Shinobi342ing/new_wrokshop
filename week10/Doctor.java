package week10;


/**
 * Write a description of class Doctor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Doctor extends person
{
    String specialization;
    double consultationFee;
    
    public Doctor(int id, String name,String field, double fee){
        super(id,name);
        this.specialization=field;
        this.consultationFee=fee;
    }
    @Override
    public double calculateSalary(){
        double base=super.calculateSalary();
        return this.consultationFee*30+ base;
    }
    
    public double calcluateSalary(int emergencyCases){
        double perEmergency=500;
        double emergyencyBonus=emergencyCases*perEmergency;
        return this.calculateSalary()+emergyencyBonus;
    }
    

    
    
}