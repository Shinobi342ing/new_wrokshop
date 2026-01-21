package week12;
import java.util.ArrayList;


/**
 * Write a description of class BusCompany here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BusCompany
{
    ArrayList<Bus> bus=new ArrayList<>();

    public void addbus(Bus b)
    {
        bus.add(b);
    }
    
    public void checkIndex(int index){
        if(index<0 || index>=bus.size()){
            System.out.println("you can't do that");
            
        }else{
            bus.remove(index);
        }
    }
    
    public void display(){
        for(Bus n: bus){
            System.out.println(n);
        }
    }
    
    public void checkRate(){
        for(Bus n:bus){
            if(n.rate>500){
                System.out.println("greater than 500");
                System.out.println(n);
            }
        }
    }
    
    public void checkColor(){
        for(Bus n:bus){
            if(n.color=="red" || n.color=="blue"){
                System.out.println(n);
            }
        }
    }
    
  
}