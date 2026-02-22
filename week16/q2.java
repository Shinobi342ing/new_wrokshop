package week16;
import java.util.Scanner;


/**
 * Write a description of class q2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q2
{
    public static void main(){
         Scanner input=new Scanner(System.in);
        System.out.println("Enter ur first string");
        String s1=input.nextLine();
        System.out.println("without any leadin and trailing whitespace="+s1.trim());
        System.out.println("only first 10 char="+s1.substring(0,10));
        System.out.println("In list of words");
        String[]s=s1.split("");
        for(String x : s){
            System.out.println(x);
        }
    }
}   