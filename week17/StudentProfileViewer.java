package week17;
import javax.swing.*;
import java.awt.*;

/**
 * Write a description of class StudentProfileViewer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentProfileViewer extends JFrame
{
    public StudentProfileViewer(){
        setTitle("Student Profile");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        JPanel panel=new JPanel();
        panel.setBounds(0,0,400,300);
        panel.setBackground(new Color(173,216,230));
        panel.setForeground(Color.BLUE);
        JLabel label=new JLabel("This is a Student Profile Viewer");
        label.setFont(new Font("Arial",Font.BOLD,16));
        label.setBounds(0,0,300,30);
        add(label);
        add(panel);
        
    }
    public static void main(){
        SwingUtilities.invokeLater(()->{ //EDT to prevent bugs/freezes
                StudentProfileViewer window = new StudentProfileViewer();
                window.setVisible(true);
        });
    }
}