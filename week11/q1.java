package week11;


/**
 * Write a description of class q1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q1
{
    public static void main(){
       
        Shape[] shapes=new Shape[3];
        
        shapes[0]=new Rectangle(10,20);
        shapes[1]=new Circle(30);
        shapes[2]=new Rectangle(50,40);
            
        for(int i=0;i<3;i++){   
           shapes[i].draw();
            shapes[i].displayShapeInfo();
        }
        
}
}