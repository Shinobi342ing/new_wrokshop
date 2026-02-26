package week17;
import javax.swing.*;
import java.awt.*;
import javax.swing.JTextField;

/**
 * Write a description of class q5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q5 extends JFrame
{
    public q5(){
        setTitle("Login");
        setSize(800,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        JPanel panel=new JPanel();
        panel.setBounds(0,0,500,300);
        
        JTextField username= new JTextField();
        username.setBounds(150,100,400,30);
        
        JButton button=new JButton("Click me");
        button.setBackground(Color.GREEN);
        button.setBounds(150,150,400,30);
        
        add(button);
        add(username);
        add(panel);
    }
    public static void main(){
        q5 n=new q5();  
        n.setVisible(true);
    }
}