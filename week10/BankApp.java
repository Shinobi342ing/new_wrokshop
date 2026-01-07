package week10;


/**
 * Write a description of class BankApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankApp
{
   public static void main(){
       SavingsAccount s=new SavingsAccount(101,"Ram",50000);
       CurrentAccount c=new CurrentAccount(102,"hari",60000);
       System.out.println(s);
        System.out.println(c);
    }
}