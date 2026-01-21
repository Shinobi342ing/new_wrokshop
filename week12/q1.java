package week12;
import java.util.*;


/**
 * Write a description of class q1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q1
{
    public static void main(){
        ArrayList<String> name=new ArrayList<>();
        name.add("ram");
        name.add("saish");
        name.add("ing");
        for(int i=0;i<name.size();i++){
            System.out.println(name.get(i));
        }
        
         ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        int sum=0;
        for (int num : numbers) {
            System.out.println(num);
            sum+=num;
        }
        System.out.println("sum="+sum);
    
    }
}