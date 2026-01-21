package week11;


/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle extends Shape implements drawable
{
    private double length;
    private double breadth;
    public Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public void setLength(double l){
        this.length=l;
    }
    public void setBreadth(double b){
        this.breadth=b;
    }
    public double getLength(){
        return this.length;
    }
    public double getBreadth(){
        return this.breadth;
    }
    @Override
    public double calculateArea(){
        return this.length*this.breadth;
    }
    @Override
    public double calculatePerimeter(){
        return (this.length+this.breadth)*2;
    }
    @Override
    public void displayShapeInfo(){
        super.displayShapeInfo();
        System.out.println("length="+this.length+" breadth="+this.breadth);
    }
    @Override
    public void draw(){
        System.out.println("drawing a rectangle");
    }
  
}