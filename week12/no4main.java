package week12;


/**
 * Write a description of class no4main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class no4main
{
    public static void main(){
        BusCompany b=new BusCompany();
        b.addbus(new Bus("100","red","12","Ram",true,800));
        b.addbus(new Bus("100","yellow","12","Ram",true,700));
        
        System.out.println("all bus");
        b.display();
        System.out.println();
        System.out.println("rate checking");
        b.checkRate();
        System.out.println();
        System.out.println("color checking");
        b.checkColor();
        
        b.checkIndex(0);
         System.out.println("all bus");
        b.display();
    }
}