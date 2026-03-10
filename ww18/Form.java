package ww18;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Form {

    public static void main(String[] args) {
        new MyFrame();
    }
}

class MyFrame extends JFrame
{
    JTextField nameField, ageField, phoneField;
    JComboBox<String> departmentBox;

    JRadioButton male, female, other;
    ButtonGroup genderGroup;

    JCheckBox sports, music, coding;

    JButton submitButton, resetButton;

    JTable table;
    DefaultTableModel model;

    MyFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new BorderLayout());

        JPanel form = new JPanel();
        form.setLayout(new GridLayout(6,2));

        //q1
        form.add(new JLabel("Student Name"));
        nameField = new JTextField();
        form.add(nameField);

        form.add(new JLabel("Age"));
        ageField = new JTextField();
        form.add(ageField);

        form.add(new JLabel("Phone"));
        phoneField = new JTextField();
        form.add(phoneField);

        form.add(new JLabel("Department"));
        String[] dept = {"CS","IT","BBA","BIT","Math","Physics"};
        departmentBox = new JComboBox<>(dept);
        form.add(departmentBox);

        form.add(new JLabel("Gender"));
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

        form.add(genderPanel);

        form.add(new JLabel("Hobbies"));

        JPanel hobbyPanel = new JPanel();

        sports = new JCheckBox("Sports");
        music = new JCheckBox("Music");
        coding = new JCheckBox("Coding");

        hobbyPanel.add(sports);
        hobbyPanel.add(music);
        hobbyPanel.add(coding);

        form.add(hobbyPanel);

        this.add(form,BorderLayout.NORTH);

        //q4
        String[] columns = {"ID","Name","Course","Gender","Skill"};
        
        
        Object[][] data = {
                {1,"John","BSc","Male","Java"},
                {2,"Anna","BIT","Female","Python"},
                {3,"Mike","BBA","Male","C++"},
                {4,"Sara","BIT","Female","Java"},
        };
        
        table = new JTable(data, columns);
        
        table.setRowHeight(25);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        //q5
        JScrollPane scrollPane = new JScrollPane(table);
        this.add(scrollPane, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();

        submitButton = new JButton("Submit");
        resetButton = new JButton("Reset");

        //q6
        submitButton.setMnemonic('S');
        submitButton.setToolTipText("Add student");

        resetButton.setMnemonic('R');
        resetButton.setToolTipText("Reset form");

        buttonPanel.add(submitButton);
        buttonPanel.add(resetButton);

        this.add(buttonPanel,BorderLayout.SOUTH);

        
        submitButton.setEnabled(false);

        //q3
        DocumentListener listener = new DocumentListener(){
        
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                checkFields();
            }
        
            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                checkFields();
            }
        
            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                checkFields();
            }
        };
        
        nameField.getDocument().addDocumentListener(listener);
        ageField.getDocument().addDocumentListener(listener);
        phoneField.getDocument().addDocumentListener(listener);
        
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addStudent();
            }
        });
        
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetForm();
            }
        });
        
        this.setVisible(true);
    }

    //q3
    private void checkFields(){
        if(!nameField.getText().trim().isEmpty() &&
           !ageField.getText().trim().isEmpty()){
            submitButton.setEnabled(true);
        } else {
            submitButton.setEnabled(false);
        }
    }

    //q2
    private void addStudent(){

        String name = nameField.getText().trim();
        String ageText = ageField.getText();
        String phone = phoneField.getText();

        if(name.isEmpty()){
            System.out.println("name is requird");
        }

        int age;
        
            
        
        try{
            age = Integer.parseInt(ageText);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Age must be number");
            return;
        }

    
        if(age < 16 || age > 100){
            JOptionPane.showMessageDialog(this,"Invalid age");
            return;
        }

        if(!phone.matches("\\d{10}")){
            JOptionPane.showMessageDialog(this,"Phone must be 10 digits");
            return;
        }

        String gender = "";
        
        if (male.isSelected()) {
            gender = "Male";
        }
        
        if (female.isSelected()) {
            gender = "Female";
        }
        
        if (other.isSelected()) {
            gender = "Other";
        }
        
        String hobbies = "";
        
        if (sports.isSelected()) {
            hobbies += "Sports ";
        }
        
        if (music.isSelected()) {
            hobbies += "Music ";
        }
        
        if (coding.isSelected()) {
            hobbies += "Coding ";
        }
        
        model.addRow(new Object[]{name,age,phone,departmentBox.getSelectedItem(),gender,hobbies});
    }

    private void resetForm(){
        nameField.setText("");
        ageField.setText("");
        phoneField.setText("");
        genderGroup.clearSelection();
        sports.setSelected(false);
        music.setSelected(false);
        coding.setSelected(false);
    }
}