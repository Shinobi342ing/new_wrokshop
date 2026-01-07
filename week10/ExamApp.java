package week10;


/**
 * Write a description of class ExamApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ExamApp
{
   public static void main(){
       ScienceStudent s = new ScienceStudent(1, "Aman", 38);
       ManagementStudent m=new ManagementStudent(2,"Ojaswi",20);
       System.out.println(s + " Result: " + s.calculateResult(5));
         System.out.println(m + " Result: " + m.calculateResult(5)); 
   }
}