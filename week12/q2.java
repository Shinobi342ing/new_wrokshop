package week12;
import java.util.*;


/**
 * Write a description of class q2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q2
{
    public static void main(){
        ArrayList<Integer> numbers=new ArrayList<>();
        ArrayList<String> names=new ArrayList<>();
        numbers.add(5);
        numbers.add(25);
        numbers.add(50);
        names.add("Sita");
        names.add("Ayush");
        names.add("ING");
        names.add("Ojswii");
        names.add("sophia");
        System.out.println("using iterartor");
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
        Iterator<Integer> it2 = numbers.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }

        System.out.println("using for each loop");
        for(int num:numbers){
            System.out.println(num);
        }
        for(String n:names){
            System.out.println(n);
        }
        System.out.println("Size of numbers="+numbers.size());        
        numbers.remove(2);
        System.out.println("Size of numbers="+numbers.size());
        numbers.clear();
        System.out.println("Size of names="+names.size());
        System.out.println("3rd element="+names.get(2)+" 5th element="+names.get(4));
        
    }
}