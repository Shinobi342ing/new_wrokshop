package week17;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    private int studentId;
    private String name;
    private String course;
     public Student(int studentId, String name, String course) {
        this.studentId = studentId;
        this.name = name;
        this.course = course;
    }
    
    public int getStudentId(){
    return this.studentId;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getCourse(){
        return this.course;
    }
    public String getFormattedDetails() {
        return "<html><center> <h2>Student ID Card</h2> ID: " + studentId + "<br>"
                + "Name: " + name + "<br>"
                + "Course: " + course
                + "</center></html>";
    }
}