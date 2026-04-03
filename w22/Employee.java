package w22;
import java.util.*;
import java.util.ArrayList;

public class Employee {

    private String empId, name, employmentType, department;
    private double salary;
    private ArrayList<String> benefits= new ArrayList<>();

    public Employee(String name, double salary, String employmentType, ArrayList<String> benefits, String department) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.employmentType = employmentType;
        this.benefits = benefits;
        this.department = department;
    }
    
    public String getEmploymentType(){
        return this.employmentType;
    }
    
    public ArrayList getBenefits(){
        return this.benefits;
    }
    
    public String getDepartment(){
        return this.department;
    }
    @Override
    public String toString() 
    {
        return "Name: " + name+  " Salary: " + salary+ " Type: " + employmentType+ " Benefits: " + benefits + " Department: " + department;
    }
    }
