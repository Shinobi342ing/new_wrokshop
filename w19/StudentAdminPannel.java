package w19;
import javax.swing.*;
import java.awt.*;
import javax.swing.JPanel;


/**
 * Write a description of class StudentAdminPannel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentAdminPannel extends JFrame
{   
    StudentAdminPannel(){
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
        newPanel.setLayout(new BoxLayout(newPanel,BoxLayout.Y_AXIS));
        for(String button: buttons){
            JButton b=new JButton(button);
            newPanel.add(b);
            newPanel.add(Box.createVerticalStrut(10));
        
        }
        
        JPanel formPanel=new JPanel();
        formPanel.setLayout(new BoxLayout(formPanel,BoxLayout.Y_AXIS));
        JPanel row1=new JPanel();
        row1.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel nameLabels=new JLabel("Name: ");
        JTextField nameField=new JTextField(10);
        formPanel.add(row1);
        row1.add(nameLabels);
        row1.add(nameField);
        newPanel.add(Box.createVerticalGlue());
        JPanel aPanel=new JPanel();
        add(t1,BorderLayout.EAST);
        
       
        add(titlePanel, BorderLayout.NORTH);
        add(formPanel, BorderLayout.CENTER);
        add(newPanel, BorderLayout.WEST);
        this.setVisible(true); 
    }
    public static void main(String []args){
        new StudentAdminPannel();
    }
}