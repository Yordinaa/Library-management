package My_Classes;
import My_Classes.Librarian.LibrarianSuccess;
import My_Classes.student.StudentDao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;

public class StudentForm extends JFrame {
    static StudentForm frame;


    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;



    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame = new StudentForm();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public StudentForm() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 404);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setBackground(new Color(51, 35, 85));

        JLabel lblAddStudents = new JLabel("Add Students");
        lblAddStudents .setForeground(Color.white);
        lblAddStudents .setFont(new Font("Tahoma", Font.PLAIN, 18));

        JLabel lblName = new JLabel("name:");
          lblName.setForeground(Color.WHITE);
        JLabel lblEmail= new JLabel("email");
        lblEmail.setForeground(Color.WHITE);
        JLabel lblPassword = new JLabel("password:");

        lblPassword.setForeground(Color.WHITE);

        textField = new JTextField();
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setColumns(10);

        textField_2 = new JTextField();
        textField_2.setColumns(10);





        JButton btnAddStudents = new JButton("Add students");
       btnAddStudents.addActionListener(new ActionListener() {
           // private int issued;

            public void actionPerformed(ActionEvent e) {
                String name=textField.getText();
                String email=textField_1.getText();
                String password=textField_2.getText();

                int i= StudentDao.save(name, email, password);
                if(i>0){
                    JOptionPane.showMessageDialog(StudentForm.this,"student added successfully!");
                    LibrarianSuccess.main(new String[]{});
                    frame.dispose();

                }else{
                    JOptionPane.showMessageDialog(StudentForm.this,"Sorry, unable to save!");
                }
            }
        });btnAddStudents.setBackground(new Color(124, 85, 227));
        JButton btnBack = new JButton("Back");
        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LibrarianSuccess.main(new String[0]);
                LibrarianSuccess.frame.dispose();
            }
        });btnBack.setBackground(new Color(124, 85, 227));
        //JButton btnBack = new JButton("Back");
        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
                gl_contentPane.createParallelGroup(Alignment.TRAILING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                .addGap(150)
                                                .addComponent(lblAddStudents))
                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                .addGap(18)
                                                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
                                                        .addComponent(lblName, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)

                                                        .addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblPassword, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                                                        )
                                                .addGap(47)
                                                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                                         .addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(textField, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(125, Short.MAX_VALUE))
                        .addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
                                .addGap(161)
                                .addComponent(btnAddStudents, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(162, Short.MAX_VALUE))
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addContainerGap(359, Short.MAX_VALUE)
                                .addComponent(btnBack)
                                .addContainerGap())
        );
        gl_contentPane.setVerticalGroup(
                gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addComponent(lblAddStudents)
                                .addGap(18)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblName)
                                        .addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblEmail)
                                        .addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblPassword)
                                        .addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                      .addGap(30)
                                .addComponent(btnAddStudents, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(btnBack)
                                .addContainerGap(53, Short.MAX_VALUE))
        );
        contentPane.setLayout(gl_contentPane);
    }

}
