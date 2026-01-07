package week9;


/**
 * Write a description of class SavingAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SavingAccount extends BankAccount
{
    private int InterestRate;
    public SavingAccount(int num, String name, double balance,int rate){
        super(num,name,balance);
        this.InterestRate=rate;
    }
    public double calculateInterest(){
        return super.getBalance()*InterestRate/100;
    }
}