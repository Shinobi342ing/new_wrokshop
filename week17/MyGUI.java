/*package week17;


import javax.swing.*;
import java.awt.*;

public class MyGUI extends JFrame{
    public MyGUI(){
        setTitle("tuto");
        setSize(400,500);
        JPanel panel=new JPanel();
        panel.setBackground(Color.CYAN);
        panel.setBorder(BorderFactory.createTitledBorder("User info"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JLabel label=new JLabel("Username:");
        label.setBounds(10,30,100,30);
        
        JTextField name=new JTextField();
        name.setBounds(80,30,100,30);
        
        JButton button=new JButton("click me");
        button.setBounds(10,80,100,30);
        button.setForeground(Color.RED);
        button.setBackground(new Color(255,200,0));
        add(name);
        add(label);
        add(button);
        add(panel);
    }
    public static void main(String[] args) {
        
        // Create window
        MyGUI wd=new MyGUI();
        JFrame frame = new JFrame("new gui");
        
        frame.setTitle("tutorial class");
        
        JLabel label=new JLabel("enter your name"); 
        label.setBounds(0,0,300,10);
        JTextField name= new JTextField();
        name.setBounds(0,0,300,30);
        JButton button = new JButton("click me");
        
        // Add button to window
        //frame.add(button);
        frame.add(name);
        frame.add(label);
        // Set size
        frame.setSize(400, 400);
        
        // Make visible
        wd.setVisible(true);
        //frame.setVisible(true);
        frame.setLocationRelativeTo(null); // centers the gui
        // Close program when window closes
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
*/