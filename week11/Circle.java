package week11;


/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle extends Shape implements drawable
{
    double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public void setRadius(double r){
        this.radius=r;
    }
    public double getRadius(){
        return this.radius;
    }
    @Override
    public double calculateArea(){
        return this.radius*this.radius*3.14;
    }
    @Override
    public double calculatePerimeter(){
        return 2*3.14*(this.radius);
    }
    @Override
    public void displayShapeInfo(){
        super.displayShapeInfo();
        System.out.println("radius="+this.radius);
    }
    @Override 
    public void draw(){
        System.out.println("Drawing a Circle");
    }

}