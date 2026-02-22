package week16;
import java.util.Scanner;


/**
 * Write a description of class q7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q7
{
    public static boolean isValidPhone(String phone){
        if(phone.matches("\\d{10}")){ // one \ for escape 2nd \ for regdx
            if(phone.matches("9[78]\\d{8}")){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
        }
       
    
    public static void main(){
          Scanner input=new Scanner(System.in);
        System.out.println("Enter ur phone");
        String s1=input.nextLine();
        System.out.println(isValidPhone(s1.trim()));
    }
}