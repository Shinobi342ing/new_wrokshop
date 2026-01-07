package week10;


/**
 * Write a description of class person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class person
{
   private int id;
   private String name;
   public person(int id, String name){
       this.id=id;
       this.name=name;
   }
   
   public int getId(){
       return this.id;
   }
   public String getName(){
       return this.name;
   }
   
   public void setId(int id){
      this.id=id; 
   }
   
   public void setName(String name){
       this.name=name;
   }
   
   public double calculateSalary(){
    return 50000;
   }
   
   @Override 
   public String toString(){
       return "Persons name="+name+", id="+id;
   }
   
}