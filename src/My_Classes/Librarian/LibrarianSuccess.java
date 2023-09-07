package My_Classes.Librarian;
import My_Classes.*;
import My_Classes.student.DeleteStudent;
import My_Classes.student.ViewStudent;
import My_Forms.BooksForm;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LibrarianSuccess extends JFrame {
    public static LibrarianSuccess frame;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame = new LibrarianSuccess();
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
    public LibrarianSuccess() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 650, 550);
        contentPane = new JPanel();
        contentPane.setForeground(Color.black);
        contentPane.setBackground(Color.LIGHT_GRAY);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        JLabel lblLibrarianSection = new JLabel("Librarian Section");
        lblLibrarianSection.setFont(new Font("Tahoma", Font.PLAIN, 22));
        lblLibrarianSection.setHorizontalAlignment(JLabel.CENTER);
        lblLibrarianSection.setVerticalAlignment(JLabel.CENTER);

        JButton btnNewButton = new JButton("Add Books");
        btnNewButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                BooksForm.main(new String[]{});
                frame.dispose();

            }
        });btnNewButton.setFocusable(false);
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
        btnNewButton.setForeground(Color.WHITE);
        btnNewButton.setBackground(new Color(124, 85, 227));

        JButton btnViewBooks = new JButton("View Books");
        btnViewBooks.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                ViewBooks.main(new String[]{});
            }
        });
        btnViewBooks.setFont(new Font("Tahoma", Font.PLAIN, 13));
        btnViewBooks.setForeground(Color.WHITE);
        btnViewBooks.setBackground(new Color(124, 85, 227));
        btnViewBooks.setFocusable(false);

        JButton btnDeleteBooks = new JButton("Delete Books");
        btnDeleteBooks.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DeleteBooks.main(new String[]{});
                frame.dispose();
            }
        });
        btnDeleteBooks.setFont(new Font("Tahoma", Font.PLAIN, 13));
        btnDeleteBooks.setForeground(Color.WHITE);
        btnDeleteBooks.setBackground(new Color(124, 85, 227));
        btnDeleteBooks.setFocusable(false);


        JButton btnAddStudent = new JButton("Add student");
        btnAddStudent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                StudentForm.main(new String[]{});
                frame.dispose();
            }
        });
       btnAddStudent.setFont(new Font("Tahoma", Font.PLAIN, 13));
        btnAddStudent.setForeground(Color.WHITE);
        btnAddStudent.setBackground(new Color(124, 85, 227));
        btnAddStudent.setFocusable(false);

        JButton btnViewStudents = new JButton("View students");
        btnViewStudents.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                ViewStudent.main(new String[]{});
            }
        });
        btnViewStudents.setFont(new Font("Tahoma", Font.PLAIN, 13));
        btnViewStudents.setForeground(Color.WHITE);
        btnViewStudents.setBackground(new Color(124, 85, 227));
        btnViewStudents.setFocusable(false);


        JButton btnDeleteStudent = new JButton("Delete Student");
        btnDeleteStudent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DeleteStudent.main(new String[]{});
                frame.dispose();
            }
        });
        btnDeleteStudent.setFont(new Font("Tahoma", Font.PLAIN, 13));
        btnDeleteStudent.setForeground(Color.WHITE);
        btnDeleteStudent.setBackground(new Color(124, 85, 227));
        btnDeleteStudent.setFocusable(false);


        JButton btnViewIssuedBooks = new JButton("View Issued Books");
        btnViewIssuedBooks.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ViewIssuedBooks.main(new String[]{});
            }
        });
        btnViewIssuedBooks.setFont(new Font("Tahoma", Font.PLAIN, 13));
        btnViewIssuedBooks.setForeground(Color.WHITE);
        btnViewIssuedBooks.setBackground(new Color(124, 85, 227));
        btnViewIssuedBooks.setFocusable(false);

        JButton btnLogout = new JButton("Logout");
        btnLogout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Library.main(new String[]{});
                frame.dispose();
            }
        });
        btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 13));
        btnLogout.setForeground(Color.WHITE);
        btnLogout.setBackground(new Color(124, 85, 227));
        btnLogout.setFocusable(false);

        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
                gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
                                .addContainerGap(150, Short.MAX_VALUE)
                                .addComponent(lblLibrarianSection,GroupLayout.PREFERRED_SIZE,191,GroupLayout.PREFERRED_SIZE)
                                .addGap(273))
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addGap(164)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                        .addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)

                                        .addComponent(btnViewIssuedBooks, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnAddStudent, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnViewStudents, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnDeleteStudent, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnDeleteBooks, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)

                                        .addComponent(btnViewBooks, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(101, Short.MAX_VALUE))
        );
        gl_contentPane.setVerticalGroup(
                gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblLibrarianSection)
                                .addGap(18)
                                .addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(btnViewBooks, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(btnDeleteBooks, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(btnAddStudent, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(btnViewStudents, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)

                                .addGap(18)
                                .addComponent(btnDeleteStudent, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                 .addGap(18)
                                .addComponent(btnViewIssuedBooks, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(16, Short.MAX_VALUE))
        );
        contentPane.setLayout(gl_contentPane);
    }

}
