package week17;
import javax.swing.*;
import java.awt.*;

/**
 * Write a description of class q4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q4 extends JFrame
{
    public q4(){
        setTitle("ID Card Preview");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        JPanel panel=new JPanel();
        panel.setBounds(0,0,400,300);
        panel.setBackground(new Color(173,216,230));
        panel.setForeground(Color.BLUE);
        
        String htmlText = "<html><body>"
                + "<h2>Name: Ingghang Iwaram Limbu</h2>"
                + "Module: Programming<br>"
                + "College: Islington College"
                + "</body></html>";
                
        JLabel label = new JLabel(htmlText);
        label.setVerticalAlignment(SwingConstants.CENTER);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setBounds(0,0,300,300);
        
        add(label);
        add(panel);
    }
    public static void main(){
        q4 n=new q4();  
        n.setVisible(true);
    }
}