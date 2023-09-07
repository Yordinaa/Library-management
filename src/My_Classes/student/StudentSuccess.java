package My_Classes.student;
import My_Classes.Library;
import My_Classes.ReturnBook;
import My_Classes.ViewBooks;
import My_Classes.ViewIssuedBooks;
import My_Forms.IssueBookForm;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentSuccess extends JFrame {
    static StudentSuccess frame;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame = new StudentSuccess();
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
    public StudentSuccess() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 650, 500);
        contentPane = new JPanel();
        contentPane.setForeground(Color.GRAY);
        contentPane.setBackground(Color.LIGHT_GRAY);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setBackground(Color.LIGHT_GRAY);
        JLabel lblStudentSection = new JLabel("Student Section");
        lblStudentSection .setFont(new Font("Tahoma", Font.PLAIN, 22));
        lblStudentSection .setHorizontalAlignment(JLabel.CENTER);
        lblStudentSection .setVerticalAlignment(JLabel.CENTER);



        JButton btnViewBooks = new JButton("View Books");
        btnViewBooks.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                ViewBooks.main(new String[]{});
            }
        });
        btnViewBooks.setFont(new Font("Tahoma", Font.PLAIN, 13));
        btnViewBooks.setForeground(Color.white);
        btnViewBooks.setBackground(new Color(124, 85, 227));
        btnViewBooks.setFocusable(false);

        JButton btnIssueBook = new JButton("Issue Book");
        btnIssueBook.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                IssueBookForm.main(new String[]{});
                frame.dispose();
            }
        });
        btnIssueBook.setFont(new Font("Tahoma", Font.PLAIN, 13));
        btnIssueBook.setForeground(Color.white);
        btnIssueBook.setBackground(new Color(124, 85, 227));
        btnIssueBook.setFocusable(false);

        JButton btnViewIssuedBooks = new JButton("View Issued Books");
        btnViewIssuedBooks.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ViewIssuedBooks.main(new String[]{});
            }
        });
        btnViewIssuedBooks.setFont(new Font("Tahoma", Font.PLAIN, 13));
        btnViewIssuedBooks.setForeground(Color.white);
        btnViewIssuedBooks.setBackground(new Color(124, 85, 227));
        btnViewIssuedBooks.setFocusable(false);



        JButton btnReturnBook = new JButton("Return Book");
        btnReturnBook.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReturnBook.main(new String[]{});
                frame.dispose();
            }
        });btnReturnBook.setForeground(Color.white);
        btnReturnBook.setBackground(new Color(124, 85, 227));
        btnReturnBook.setFont(new Font("Tahoma", Font.PLAIN, 13));
        btnReturnBook.setFocusable(false);
        JButton btnLogout = new JButton("Logout");
        btnLogout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Library.main(new String[]{});
                frame.dispose();
            }
        });
        btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 13));
        btnLogout.setForeground(Color.white);
        btnLogout.setBackground(new Color(124, 85, 227));
        btnLogout.setFocusable(false);

        JButton btnBack = new JButton("Back");
        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                StudentSuccess.main(new String[0]);
                frame.dispose();
            }
        });btnBack.setFocusable(false);





        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
                gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
                                .addContainerGap(81, Short.MAX_VALUE)
                                .addComponent(lblStudentSection )
                                .addGap(297))
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addGap(142)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                        .addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnReturnBook, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnViewIssuedBooks, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
                                         .addComponent(btnIssueBook, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnViewBooks, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
                                )
                                .addContainerGap(101, Short.MAX_VALUE))
        );
        gl_contentPane.setVerticalGroup(
                gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblStudentSection )
                                 .addGap(18)
                                .addComponent(btnViewBooks, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                 .addGap(18)
                                .addComponent(btnIssueBook, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(btnViewIssuedBooks, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(btnReturnBook, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)

                                .addContainerGap(16, Short.MAX_VALUE))
        );
        contentPane.setLayout(gl_contentPane);
    }

}
