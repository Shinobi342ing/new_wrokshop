package week16;
import java.util.Scanner;


/**
 * Write a description of class q5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q5
{
    public static void main(){
         Scanner input=new Scanner(System.in);
        System.out.println("Enter ur first string");
        String s1=input.nextLine();
        String s2="toappened";
        String speical="$%^";
        String[] words=s1.trim().split("\\s+");
        StringBuilder sb=new StringBuilder();
        sb.append(s1).append(s2).append(speical).append(5);
     
        System.out.println(sb.toString().trim());
    }
}