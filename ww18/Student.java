package ww18;

import java.util.ArrayList;

public class Student {

    private int id;
    private String name;
    private String gender;
    private String skill;
    private String course;

    static ArrayList<Student> students = new ArrayList<>();

    public Student(int id, String name, String gender, String skill, String course){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.skill = skill;
        this.course = course;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getGender(){
        return gender;
    }

    public String getSkill(){
        return skill;
    }

    public String getCourse(){
        return course;
    }

 
    public static void addStudent(Student student){

        for(Student s : students){
            if(s.id == student.id){
                System.out.println("ID already exists");
                return;
            }
        }

        students.add(student);
    }

 
    public static void viewStudents(){

        for(Student s : students){
            System.out.println(s.id + " " +s.name + " " +s.gender + " " +s.skill + " " +s.course);
        }
    }


    public static void deleteStudent(int id){

        for(Student s : students){

            if(s.id == id){
                students.remove(s);
            }

        }

        System.out.println("Student not found");
    }
}