package w19;
import javax.swing.*;
import java.awt.*;

public class StudentDashboardUI {

    public static void main(String[] args) {
        new DashboardFrame();
    }
}

class DashboardFrame extends JFrame {

    DashboardFrame(){

        this.setTitle("Admin Dashboard");
        this.setSize(900,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
    
        JPanel header = new JPanel(new FlowLayout(FlowLayout.LEFT));
        header.setBackground(Color.LIGHT_GRAY);

        JLabel icon = new JLabel(new ImageIcon("logo.png"));
        JLabel title = new JLabel("<html><h1>Student Admin Panel</h1></html>");

        header.add(icon);
        header.add(title);

        this.add(header, BorderLayout.NORTH);

        JPanel footer = new JPanel(new FlowLayout(FlowLayout.CENTER));
        footer.setBackground(Color.LIGHT_GRAY);

        JLabel footerText = new JLabel("© 2025 Student Management System");

        footer.add(footerText);

        this.add(footer, BorderLayout.SOUTH);

        JPanel sidebar = new JPanel(new FlowLayout(FlowLayout.LEFT,10,20));
        sidebar.setPreferredSize(new Dimension(180,0));
        sidebar.setBackground(new Color(220,220,220));
    
        String[] buttons={"Add Student", "View Student", "Update Student", "Delete Student"};
       
        for( String button: buttons){
            JButton b=new JButton(button);
            b.setPreferredSize(new Dimension(150,30));
            sidebar.add(b);
        }
        
        this.add(sidebar, BorderLayout.WEST);

        JPanel form = new JPanel();
        form.setLayout(new BoxLayout(form, BoxLayout.Y_AXIS));
        
        JPanel namePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(15);
        namePanel.add(nameLabel);
        namePanel.add(nameField);
        
        JPanel agePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel ageLabel = new JLabel("Age:");
        JTextField ageField = new JTextField(5);
        agePanel.add(ageLabel);
        agePanel.add(ageField);
        
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel genderLabel = new JLabel("Gender:");
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        
        genderPanel.add(genderLabel);
        genderPanel.add(male);
        genderPanel.add(female);
        
        JPanel skillPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel skillLabel = new JLabel("Skills:");
        JCheckBox java = new JCheckBox("Java");
        JCheckBox python = new JCheckBox("Python");
        JCheckBox cpp = new JCheckBox("C++");
        
        skillPanel.add(skillLabel);
        skillPanel.add(java);
        skillPanel.add(python);
        skillPanel.add(cpp);
        
        JPanel coursePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel courseLabel = new JLabel("Course:");
        String[] courses = {"B.Tech","M.Tech","B.Sc","M.Sc"};
        JComboBox<String> courseBox = new JComboBox<>(courses);
        
        coursePanel.add(courseLabel);
        coursePanel.add(courseBox);
        
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JButton register = new JButton("Register");
        buttonPanel.add(register);
        
        form.add(Box.createVerticalStrut(10));
        form.add(namePanel);
        form.add(agePanel);
        form.add(genderPanel);
        form.add(skillPanel);
        form.add(coursePanel);
        form.add(buttonPanel);
        
        this.add(form, BorderLayout.CENTER);

        this.setVisible(true);
    }
}
