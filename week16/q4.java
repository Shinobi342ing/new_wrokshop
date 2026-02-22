package week16;
import java.util.Scanner;


/**
 * Write a description of class q4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q4
{
    public static void main(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter ur first string");
        String s1=input.nextLine();
        System.out.println("upper case="+s1.toUpperCase());
        System.out.println("lower case="+s1.toLowerCase());
        String[] words=s1.trim().split("\\s+");
        StringBuilder sb=new StringBuilder();
        for( int i=0;i<words.length;i++){
            String first=words[i].substring(0,1).toUpperCase();
            String rest=words[i].substring(1).toLowerCase();
            sb.append(first).append(rest).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}