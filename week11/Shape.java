package week11;


/**
 * Write a description of class Shape here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
abstract class Shape implements drawable
{
    abstract double calculateArea();
    abstract double calculatePerimeter();
    public void displayShapeInfo(){
           System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    };
}