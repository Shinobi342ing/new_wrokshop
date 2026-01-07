package week10;


/**
 * Write a description of class Account here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Account
{
    private int accountNo;
    private String holderName;
    private double balance;
    
    public Account(int no, String name, double balance){
        this.accountNo=no;
        this.holderName=name;
        this.balance=balance;
    }
    
    public void setBalance(double balance){
        this.balance=balance;
    }
    public double getBalance(){
        return this.balance;
    }
    
    @Override 
    public String toString(){
        return "account number"+this.accountNo+"name="+this.holderName+"balance="+this.balance;
    }
     public double calculateInterest() {
        return balance;
    }

}