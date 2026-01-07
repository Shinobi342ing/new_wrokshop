package week9;


/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    protected int accountNumber;
    protected String accountholderName;
    protected double balance;
    public BankAccount(int num, String name, double balance){
        this.accountNumber=num;
        this.accountholderName=name;
        this.balance=balance;
    }
    public void deposit(double amount){
        this.balance+=amount;
    }
    public double getBalance(){
        return this.balance;
    }
    public void display(){
        System.out.println("number="+ this.accountNumber);
        System.out.println("account holder name="+this.accountholderName);
        System.out.println("balance="+this.balance);

    }
}