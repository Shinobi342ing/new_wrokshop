package week17;
import javax.swing.*;
import java.awt.*;


/**
 * Write a description of class IDCardWindow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IDCardWindow extends JFrame
{
    public IDCardWindow(Student students){
        setSize(450,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        JPanel panel=new JPanel();
        panel.setBounds(0,0,450,300);
        panel.setBackground(new Color(173,216,230));
        panel.setForeground(Color.BLUE);
        
        int id=students.getStudentId();
        String name=students.getName();
        String course=students.getCourse();
        
        JLabel label=new JLabel("Name="+name+" id="+id+" course="+course);
        label.setFont(new Font("Arial",Font.BOLD,16));
        label.setBounds(20,10,400,30);
        
        add(label);
        add(panel);
    }
}