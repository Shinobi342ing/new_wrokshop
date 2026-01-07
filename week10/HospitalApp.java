package week10;


/**
 * Write a description of class HospitalAPp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HospitalApp
{
    public static void main(){
  Doctor d1=new Doctor(1,"ram","eye",50000);
  Nurse n1=new Nurse(2,"sophia","night",30000);
  System.out.println(d1);
  System.out.println(n1);
}
}