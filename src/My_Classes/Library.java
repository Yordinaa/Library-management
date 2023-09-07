package My_Classes;

import My_Classes.student.StudentLogin;
import My_Classes.Admin.AdminLogin;
import My_Classes.Librarian.LibrarianLogin;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;

public class Library extends JFrame {
    static Library frame;
    private JPanel contentPane;
private BufferedImage image;
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame= new Library();
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
    public Library() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 550);
        contentPane = new JPanel();
        //contentPane.setBorder(new EmptyBorder(35, 55, 5, 5));
        contentPane.setBackground(new Color(51, 35, 85));
        ;
        setContentPane(contentPane);

        JLabel lblLibraryManagement = new JLabel("  Library Management System");
        lblLibraryManagement.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblLibraryManagement.setForeground(Color.white);
        lblLibraryManagement.setBackground(Color.darkGray);
        lblLibraryManagement.setHorizontalAlignment(SwingConstants.CENTER);
        lblLibraryManagement.setVerticalAlignment(SwingConstants.CENTER);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add( lblLibraryManagement, BorderLayout.CENTER);

        JButton btnAdminLogin = new JButton("Admin Login");
        btnAdminLogin.setForeground(Color.black);
        btnAdminLogin.setBackground(Color.WHITE);
        btnAdminLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AdminLogin.main(new String[]{});
                frame.dispose();
            }
        });
        btnAdminLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnAdminLogin.setFocusable(false);

        JButton btnStudentLogin = new JButton(" Student Login");
        btnStudentLogin.setForeground(Color.black);
        btnStudentLogin.setBackground(Color.WHITE);
       btnStudentLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnStudentLogin.setFocusable(false);
        btnStudentLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                StudentLogin.main(new String[]{});
            }
        });
        btnAdminLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));

        JButton btnLibrarianLogin = new JButton(" Librarian Login");
        btnLibrarianLogin.setForeground(Color.black);
        btnLibrarianLogin.setBackground(Color.WHITE);
        btnLibrarianLogin.setFocusable(false);
        btnLibrarianLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                LibrarianLogin.main(new String[]{});
            }
        });
        btnLibrarianLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
        JButton btnLogout = new JButton("Exit");
        btnLogout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MyFrame.main(new String[]{});
                frame.dispose();
            }
        });
        btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 13));
        btnLogout.setForeground(Color.black);
        btnLogout.setBackground(Color.lightGray);
        btnLogout.setFocusable(false);

        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
                gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                .addGap(104)
                                                .addComponent(lblLibraryManagement))
                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                .addGap(140)
                                                .addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
                                                        .addComponent(btnLibrarianLogin, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                                                        .addComponent(btnAdminLogin, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                                        .addComponent(btnStudentLogin, Alignment.LEADING,GroupLayout.DEFAULT_SIZE,135,Short.MAX_VALUE)
                                                        .addComponent(btnLogout, Alignment.LEADING))))

                                .addContainerGap(95, Short.MAX_VALUE))
        );
        gl_contentPane.setVerticalGroup(
                gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblLibraryManagement)
                                .addGap(32)
                                .addComponent(btnAdminLogin, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                .addComponent(btnLibrarianLogin, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                .addComponent(btnStudentLogin, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                .addGap(100)
                                .addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)

                                .addContainerGap(70, Short.MAX_VALUE))
        );
        contentPane.setLayout(gl_contentPane);
    }
}
