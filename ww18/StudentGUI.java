package ww18;

import javax.swing.*;
import java.awt.*;

public class StudentGUI {

    public static void main(String[] args) {
        new MyFrame();
    }
}

class MyFrame extends JFrame {

    JTextField idField, nameField;
    JComboBox<String> courseBox;

    JRadioButton male, female, other;
    ButtonGroup genderGroup;

    JCheckBox java, python, cpp;

    JButton submitBtn, resetBtn, searchBtn, deleteBtn;

    JTable table;

    MyFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700,500);
        this.setLayout(new BorderLayout());

        JPanel formPanel = new JPanel(new GridLayout(5,2));

        formPanel.add(new JLabel("Student ID"));
        idField = new JTextField();
        formPanel.add(idField);

        formPanel.add(new JLabel("Student Name"));
        nameField = new JTextField();
        formPanel.add(nameField);

        formPanel.add(new JLabel("Course"));
        String[] courses = {"BSc","BBA","BIT"};
        courseBox = new JComboBox<>(courses);
        formPanel.add(courseBox);

        formPanel.add(new JLabel("Gender"));
        JPanel genderPanel = new JPanel();

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        other = new JRadioButton("Other");

        genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        genderGroup.add(other);

        genderPanel.add(male);
        genderPanel.add(female);
        genderPanel.add(other);

        formPanel.add(genderPanel);

        formPanel.add(new JLabel("Skills"));
        JPanel skillPanel = new JPanel();

        java = new JCheckBox("Java");
        python = new JCheckBox("Python");
        cpp = new JCheckBox("C++");

        skillPanel.add(java);
        skillPanel.add(python);
        skillPanel.add(cpp);

        formPanel.add(skillPanel);

        this.add(formPanel, BorderLayout.NORTH);

        String[] columns = {"ID","Name","Course","Gender","Skills"};

        Object[][] data = {};

        table = new JTable(data, columns);

        JScrollPane scrollPane = new JScrollPane(table);

        this.add(scrollPane, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();

        submitBtn = new JButton("Submit");
        resetBtn = new JButton("Reset");
        searchBtn = new JButton("Search");
        deleteBtn = new JButton("Delete");

        buttonPanel.add(submitBtn);
        buttonPanel.add(resetBtn);
        buttonPanel.add(searchBtn);
        buttonPanel.add(deleteBtn);

        this.add(buttonPanel, BorderLayout.SOUTH);

        this.setVisible(true);
    }
}