package week9;


/**
 * Write a description of class BankApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankApp
{
    public static void main(){
        //int num, String name, double balance,int rate
        SavingAccount SA=new SavingAccount(1,"Ram",80000,5);
        CurrentAccount CA=new CurrentAccount(2,"Ram",30000,10000);
        
        System.out.println("for saving account");
        System.out.println("Balance="+SA.getBalance());
        
        System.out.println("for current account");
        System.out.println("Balance="+CA.getBalance());
        CA.deposit(5000);
        CA.withdraw(200000);
        System.out.println("after withdraw");
        System.out.println("Balance="+CA.getBalance());
    }
}