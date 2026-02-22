package week16;
import java.util.Scanner;


/**
 * Write a description of class q3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q3
{
    public static void main(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter ur first string");
        String s1=input.nextLine();
        System.out.println("enter specific char");
        String sepch=input.nextLine();
        System.out.println("enter index");
        int index=input.nextInt();
        System.out.println("special character of given index = "+s1.charAt(index));
        System.out.println("first occurence is at "+s1.indexOf(sepch));
        System.out.println("enter the string u want to check if it is in the string or not");
        input.nextLine();
        String c=input.nextLine();
        if(s1.contains(c)){
            System.out.println("it contains");
        }else{
            System.out.println("it does not");
        }
    }
}