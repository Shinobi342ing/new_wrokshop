package week8;


public class student
{
    String name;
    int id;
    
    public student(String name){
        this.name=name;
    }
    
    public student(String name,int id){
        this.name=name;
        this.id=id;
    }
    
    public student(int id){
        this.id=id;
    }
    
    public void display(){
        System.out.println(this.name+" "+this.id);
    }
    
}