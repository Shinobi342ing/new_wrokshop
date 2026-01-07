package week9;


/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    protected int id;
    protected double basicSalary;
    protected String name;
    protected static String collegeName="Islington";
    public Person(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.basicSalary=salary;
    }
    double calculateAnnualSalary(){
        return this.basicSalary*12;
    }
}