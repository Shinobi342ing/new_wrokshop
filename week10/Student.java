package week10;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
   private int rollNo;
   private String name;
   private double marks;
   
    public Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    
    public int getRollNo(){
        return this.rollNo;
    }
    public String getName(){
        return this.name;
    }
    public double getMarks(){
        return this.marks;
    }
    
    public void setRollNo(int no){
        this.rollNo=no;
    }
    public void setMarks(double marks){
        this.marks=marks;
    }
    public String calculateResult() {
        return marks >= 40 ? "Pass" : "Fail";
    }

    @Override
    public String toString() {
        return "name="+ name+", rollno="+rollNo;
    }
}