package week12;
import java.util.*;
public class q3
{
    public static void main(){
        ArrayList<Student> students=new ArrayList<>();
        students.add(new Student("Ayush", "L1C1", "9876543210"));
        students.add(new Student("Rahul", "L1M1", "9876543211"));
        students.add(new Student("Gaurav", "L1N2", "9876543212"));
        for(Student S: students){
            System.out.println(S);
        }
        students.remove(2);
        System.out.println();
        for(Student S: students){
            System.out.println(S);
        }
                System.out.println();
        students.add(0,new Student("Avaya","L1C1","9876543213"));
        for(Student S: students){
            System.out.println(S);
        }
                System.out.println();
         for(Student S: students){
            if(S.getName()=="Ayush"){
                S.setName("Aayush");
            }
        }
        //students.get(0).setName("Aayush");
        for(Student S: students){
            System.out.println(S);
        }
    }
}