package week16;
import java.util.Scanner;


/**
 * Write a description of class q6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q6
{
    public static void main(){
          Scanner input=new Scanner(System.in);
        System.out.println("Enter ur first string");
        String s1=input.nextLine().trim()   ;
        StringBuilder reversed=new StringBuilder();
        for( int i=s1.length()-1;i>=0;i--){
            reversed.append(s1.charAt(i));
        }
        System.out.println(reversed.toString().trim());
        if(reversed.toString().trim().equals(s1)){
            System.out.println("same");
        }else{
            System.out.println("nahhh");
        }
    }
}