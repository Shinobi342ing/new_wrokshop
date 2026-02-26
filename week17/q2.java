package week17;
import javax.swing.*;
import java.awt.*;

/**
 * Write a description of class q2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q2 extends JFrame
{
    public q2(){
        setTitle("College Event Annoucemnet");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        JPanel panel=new JPanel();
        panel.setBounds(0,0,400,300);
        panel.setBackground(new Color(173,216,230));
        panel.setForeground(Color.BLUE);

        setResizable(false);    
        JLabel label=new JLabel("Welcome to Orientation Day");
        label.setFont(new Font("Arial",Font.BOLD,16));
        label.setBounds(20,10,300,30);
        
        add(label);
        add(panel);
    }
    public static void main(){
        q2 n=new q2();
        n.setVisible(true);
    }
}