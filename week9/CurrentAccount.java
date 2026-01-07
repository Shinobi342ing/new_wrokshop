package week9;


/**
 * Write a description of class CurrentAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CurrentAccount extends BankAccount
{
    private int overdraftLimit;
    public CurrentAccount(int num, String name, double balance,int limit){
        super(num,name,balance);
        this.overdraftLimit=limit;
        
    }
    public boolean withdraw(double amount){
        if(amount <= super.balance+overdraftLimit){
            super.balance=super.balance-amount;
            System.out.println("Withdraw Succesful");
            return true;
        }else{
            System.out.println("Withdraw not Succesful :( ");
            return false;
        }
    }
}