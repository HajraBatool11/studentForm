import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class sform implements ActionListener {
    JButton b = new JButton("Submit");
    JTextField t = new JTextField();
    JTextField t2 = new JTextField();
    JTextField t3 = new JTextField();
    JTextField t4 = new JTextField();
    JTextField t5 = new JTextField();
    JFrame f = new JFrame();
    ButtonGroup gb = new ButtonGroup();
    
    JPanel p = new JPanel();
    JRadioButton rb = new JRadioButton("Male");
    JRadioButton rb2 = new JRadioButton("Female");
    String[] semester = {"Semester", "1st", "2nd", "3rd"};
    JComboBox<String> c = new JComboBox<>(semester);
    JLabel l = new JLabel("Student Form");
    JLabel l1 = new JLabel("Name");
    JLabel l2 = new JLabel("Father Name");
    JLabel l3 = new JLabel("Department");
    JLabel l4 = new JLabel("Email");
    JLabel l5 = new JLabel("Contact");

    sform() {
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 450);
        p.add(c);
        gb.add(rb);
        gb.add(rb2);

        l.setFont(new Font("Serif", Font.BOLD, 30));

        p.setLayout(null);
        p.setBounds(0, 0, 500, 450);

        l.setBounds(200, 10, 200, 30);
        l1.setBounds(50, 50, 100, 30);
        t.setBounds(150, 50, 300, 30);
        l2.setBounds(50, 100, 100, 30);
        t2.setBounds(150, 100, 300, 30);
        l3.setBounds(50, 150, 100, 30);
        t3.setBounds(150, 150, 300, 30);
        l4.setBounds(50, 200, 100, 30);
        t4.setBounds(150, 200, 300, 30);
        l5.setBounds(50, 250, 100, 30);
        t5.setBounds(150, 250, 300, 30);
        c.setBounds(150, 300, 300, 30);
        rb.setBounds(150, 350, 70, 30);
        rb2.setBounds(230, 350, 90, 30);
        b.setBounds(200, 400, 100, 30);

        p.add(l);
        p.add(l1);
        p.add(t);
        p.add(l2);
        p.add(t2);
        p.add(l3);
        p.add(t3);
        p.add(l4);
        p.add(t4);
        p.add(l5);
        p.add(t5);
        p.add(c);
        p.add(rb);
        p.add(rb2);
        p.add(b);

        b.addActionListener(this);

        f.add(p);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b) {
            if (t.getText().isEmpty() || t2.getText().isEmpty() || t3.getText().isEmpty()
                || t4.getText().isEmpty() || t5.getText().isEmpty()) {
                JOptionPane.showMessageDialog(p, "Please fill in all the text fields.", "Alert",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                String name = t.getText();
                String FatherName = t2.getText();
                String contact = t3.getText();
                String email = t4.getText();
                String department = t5.getText();
                String semester = (String) c.getSelectedItem();
                String gender = "";
                if (rb.isSelected()) {
                    gender = "Male";
                } else if (rb2.isSelected()) {
                    gender = "Female";
                }

                JOptionPane.showMessageDialog(p,
                        "Name: " + name + "\nFather Name: " + FatherName + "\nContact Number: " + contact
                                + "\nEmail: " + email + "\nDepartment: " + department + "\nSemester: " + semester
                                + "\nGender: " + gender,
                        "Saved Information", JOptionPane.INFORMATION_MESSAGE);
                        System.out.println("you have successfully done your task.");
            }
        }
    }

    public static void main(String[] args) {
        new sform();
    }
}
