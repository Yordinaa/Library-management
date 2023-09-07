package My_Forms;


import My_Classes.IssueBookDao;
import My_Classes.student.StudentSuccess;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class IssueBookForm extends JFrame {
    public static IssueBookForm frame;
    private JPanel contentPane;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    IssueBookForm.frame = new IssueBookForm();
                    IssueBookForm.frame.setVisible(true);
                } catch (Exception var2) {
                    var2.printStackTrace();
                }

            }
        });
    }

    public IssueBookForm() {
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 550, 500);
        this.contentPane = new JPanel();
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        contentPane.setBackground(new Color(51, 35, 85));

        JLabel lblNewLabel = new JLabel("Issue Book ");
        lblNewLabel.setFont(new Font("Tahoma", 0, 18));
        lblNewLabel.setForeground(Color.white);

        JLabel lblBookName = new JLabel("Book Callno:");
        lblBookName.setForeground(Color.white);
        this.textField_1 = new JTextField();
        this.textField_1.setColumns(10);
        this.textField_2 = new JTextField();
        this.textField_2.setColumns(10);
        this.textField_3 = new JTextField();
        this.textField_3.setColumns(10);
        this.textField_4 = new JTextField();
        this.textField_4.setColumns(10);
        JLabel lblStudentId = new JLabel("Student Id:");
        lblStudentId.setForeground(Color.white);
        JLabel lblStudentName = new JLabel("Student Name:");
        lblStudentName.setForeground(Color.white);
        JLabel lblStudentContact = new JLabel("Student Contact:");
        lblStudentContact.setForeground(Color.white);

        JButton btnIssueBook = new JButton("Issue Book");
        btnIssueBook.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String bookcallno = IssueBookForm.this.textField_1.getText();
                int studentid = Integer.parseInt(IssueBookForm.this.textField_2.getText());
                String studentname = IssueBookForm.this.textField_3.getText();
                String studentcontact = IssueBookForm.this.textField_4.getText();
                if (IssueBookDao.checkBook(bookcallno)) {
                    int i = IssueBookDao.save(bookcallno, studentid, studentname, studentcontact);
                    if (i > 0) {
                        JOptionPane.showMessageDialog(IssueBookForm.this, "Book issued successfully!");
                        StudentSuccess.main(new String[0]);
                        frame.dispose();
                    } else {
                        JOptionPane.showMessageDialog(IssueBookForm.this, "Sorry, unable to issue!");
                    }
                } else {
                    JOptionPane.showMessageDialog(IssueBookForm.this, "Sorry, Callno doesn't exist!");
                }

            }
        });btnIssueBook.setBackground(new Color(124, 85, 227));
        btnIssueBook.setForeground(Color.white);

        JButton btnBack = new JButton("Back");
        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                StudentSuccess.main(new String[0]);
               frame.dispose();
            }
        });btnBack.setBackground(new Color(124, 85, 227));
        btnBack.setForeground(Color.white);
        JLabel lblNewLabel_1 = new JLabel("Note: Please check Student ID Carefully before issuing book!");
        lblNewLabel_1.setFont(new Font("Tahoma", 0, 13));
        lblNewLabel_1.setForeground(Color.RED);
        GroupLayout gl_contentPane = new GroupLayout(this.contentPane);
        gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_contentPane.createSequentialGroup().addContainerGap(10, 32767)
                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                        .addComponent(lblBookName)
                                        .addComponent(lblStudentId)
                                        .addComponent(lblStudentName, -2, 108, -2)
                                        .addComponent(lblStudentContact, -2, 100, -2))
                                .addGap(10)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                        .addComponent(this.textField_2, -2, 172, -2)
                                        .addComponent(this.textField_1, -2, 172, -2)
                                        .addComponent(this.textField_3, -2, 172, -2)
                                        .addComponent(this.textField_4, -2, 172, -2))
                                .addGap(48))
                        .addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
                                .addGap(50)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
                                        .addComponent(lblNewLabel_1)

                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                .addComponent(btnIssueBook, -2, 100, -2)
                                                .addGap(88)
                                                .addComponent(btnBack)))
                                .addGap(100))))
                .addGroup(gl_contentPane.createSequentialGroup().addGap(216).addComponent(lblNewLabel)
                        .addContainerGap(225, 32767)));
        gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
                .addGroup(gl_contentPane.createSequentialGroup()
                        .addGap(37)
                        .addComponent(lblNewLabel)
                        .addGap(23)
                        .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                .addComponent(lblBookName)
                                //.addGap(43)
                                .addComponent(this.textField_1, -2, -1, -2))
                        .addGap(28)
                        .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                .addComponent(lblStudentId).addComponent(this.textField_2, -2, -1, -2))
                        .addGap(28)
                        .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblStudentName)
                                .addComponent(this.textField_3, -2, -1, -2))
                        .addGap(26).addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                .addComponent(lblStudentContact)
                                .addComponent(this.textField_4, -2, -1, -2))
                        .addGap(55)
                        .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                .addComponent(btnIssueBook, -2, 31, -2)
                                .addComponent(btnBack,-2, 31, -2))
                                .addGap(38)
                        .addComponent(lblNewLabel_1)
                        .addGap(25)));
        this.contentPane.setLayout(gl_contentPane);
    }
}
