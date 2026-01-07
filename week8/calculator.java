package week8;
import java.util.Scanner;

public class calculator
{
    public void dispalyInfo(){
        System.out.println("Weclome to Calculator");
    }
    
    public void add(int a,int b)//formal parameter
    {
        System.out.println(a+b);
    }
    
    public int getnum(){
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        return a;
    }
    
    public int multi(int a,int b){
        return a*b;
    }
    
    public static int square(int a){
        return a*a;
    }
}