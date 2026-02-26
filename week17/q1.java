package week17;
import javax.swing.*;
import java.awt.*;

/**
 * Write a description of class q1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q1 extends JFrame
{
    public q1(){
        setTitle("Libary Notice");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        JPanel panel=new JPanel();
        panel.setBounds(0,0,400,300);
        JLabel label=new JLabel("Lirary Opens at 7:00AM");
        label.setFont(new Font("Arial",Font.BOLD,16));
        label.setBounds(20,100,300,30);
        add(label);
        add(panel);
    }
    public static void main(){
        q1 n=new q1();
        n.setVisible(true);
    }
}