import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TodoApp {

    public static void main(String[] args) {
        JFrame frame = new JFrame("To-Do Task Manager");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        DefaultListModel<String> taskModel = new DefaultListModel<>();
        JList<String> taskList = new JList<>(taskModel);

        JScrollPane scrollPane = new JScrollPane(taskList);

        JTextField taskField = new JTextField();

        JButton addButton = new JButton("Add Task");
        JButton deleteButton = new JButton("Delete Task");
        JButton completeButton = new JButton("Mark Completed");

        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.add(taskField, BorderLayout.CENTER);
        topPanel.add(addButton, BorderLayout.EAST);

        JPanel bottomPanel = new JPanel();
        bottomPanel.add(deleteButton);
        bottomPanel.add(completeButton);

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        // Add Task
        addButton.addActionListener(e -> {
            String task = taskField.getText().trim();
            if (!task.isEmpty()) {
                taskModel.addElement(task);
                taskField.setText("");
            }
        });

        // Delete Task
        deleteButton.addActionListener(e -> {
            int selected = taskList.getSelectedIndex();
            if (selected != -1) {
                taskModel.remove(selected);
            }
        });

        // Mark Completed
        completeButton.addActionListener(e -> {
            int selected = taskList.getSelectedIndex();
            if (selected != -1) {
                String task = taskModel.get(selected);
                taskModel.set(selected, "✔ " + task);
            }
        });

        frame.setVisible(true);
    }
}