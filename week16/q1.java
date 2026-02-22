package week16;
import java.util.Scanner;


/**
 * Write a description of class q1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q1
{
    public static void main(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter ur first string");
        String s1=input.nextLine();
        System.out.println("Enter ur second string");
        String s2=input.nextLine();
        String combined=s1.concat(s2);
          System.out.println("Combined string "+combined);
        System.out.println("Enter 3rd string");
        String s3=input.nextLine();
        System.out.println(s3.equals(combined));
    }
}