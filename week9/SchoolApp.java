package week9;


/**
 * Write a description of class SchoolApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SchoolApp
{
    public static void main(){
        //int id,String name,String cllgname,double salary
        Teacher t1=new Teacher(1,"Sita",50000,"AI",50000);
        Staff s1=new Staff(101,"Ojwti",35000,5,350);
        
        System.out.println("Annual salary of teacher is="+t1.calculateAnnualSalary());
        
        System.out.println("Salary of staff="+s1.calculateSalary());
        
        
        System.out.println("static cllg name ="+Person.collegeName);
    }
    }
    
