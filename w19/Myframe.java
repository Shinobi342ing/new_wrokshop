package w19;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.*;


/**
 * Write a description of class Myframe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Myframe extends JFrame
{   
    Myframe(){
        this.setSize(420,420);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("new frame");
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        
        JPanel titlePanel=new JPanel();
        JLabel titleLabel=new JLabel("this is week 19");
        titlePanel.add(titleLabel);
        
        JPanel t1=new JPanel();
        JLabel l1=new JLabel("this is east side");
        t1.add(l1);
        
        JPanel t2=new JPanel();
        JLabel l2=new JLabel("this is west side");
        t2.add(l2);
        
        JPanel t3=new JPanel();
        JLabel l3=new JLabel("this is center side");
        t3.add(l3);
        
        String[] buttons={"add","sub","dub"};
        
        JPanel newPanel=new JPanel();
        newPanel.setLayout(new BoxLayout(newPanel,BoxLayout.X_AXIS));
        for(String button: buttons){
            JButton b=new JButton(button);
            newPanel.add(b);
            newPanel.add(Box.createHorizontalStrut(10));
        
        }
        newPanel.add(Box.createVerticalGlue());
        JPanel aPanel=new JPanel();
        add(t1,BorderLayout.EAST);
        add(t2,BorderLayout.WEST);
        add(t3,BorderLayout.CENTER);
        add(titlePanel, BorderLayout.NORTH);
        add(newPanel, BorderLayout.CENTER);
        this.setVisible(true);
    }
}