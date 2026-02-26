package week17;
import javax.swing.*;
import java.awt.*;

/**
 * Write a description of class MainLauncher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainLauncher
{
    public static void main(){
        
        Student s1=new Student(1,"ram","computing");
        Student s2=new Student(2,"sohpia","ai");
        SwingUtilities.invokeLater(()->{ //EDT to prevent bugs/freezes
             IDCardWindow  window1 = new IDCardWindow(s1);
             IDCardWindow  window2 = new IDCardWindow(s2);
            window1.setVisible(true);
            window2.setVisible(true);
        });
    }
}