package My_Classes.Admin;

import My_Classes.Librarian.DeleteLibrarian;
import My_Classes.Library;
import My_Classes.Librarian.ViewLibrarian;
import My_Forms.LibrarianForm;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class AdminSuccess extends JFrame {
    static AdminSuccess frame;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame = new AdminSuccess();
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
    public AdminSuccess() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 650, 550);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setBackground(Color.LIGHT_GRAY);
        setContentPane(contentPane);

        JLabel lblAdminSection = new JLabel("Admin Section");
        lblAdminSection.setFont(new Font("Tahoma", Font.PLAIN, 22));
        lblAdminSection.setForeground(Color.BLACK);

        lblAdminSection.setHorizontalAlignment(JLabel.CENTER);
        lblAdminSection.setVerticalAlignment(JLabel.CENTER);

        JButton btnNewButton = new JButton("Add Librarian");
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LibrarianForm.main(new String[]{});
                frame.dispose();
            }
        });btnNewButton.setBackground(new Color(124, 85, 227));
        btnNewButton.setForeground(Color.WHITE);
        btnNewButton.setFocusable(false);

        JButton btnViewLibrarian = new JButton("View Librarian");
        btnViewLibrarian.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                ViewLibrarian.main(new String[]{});
            }
        });
        btnViewLibrarian.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnViewLibrarian.setBackground(new Color(124, 85, 227));
        btnViewLibrarian.setForeground(Color.WHITE);
        btnViewLibrarian.setFocusable(false);

        JButton btnDeleteLibrarian = new JButton("Delete Librarian");
        btnDeleteLibrarian.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DeleteLibrarian.main(new String[]{});
                frame.dispose();
            }
        });
        btnDeleteLibrarian.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnDeleteLibrarian.setBackground(new Color(124, 85, 227));
        btnDeleteLibrarian.setForeground(Color.WHITE);
        btnDeleteLibrarian.setFocusable(false);

        JButton btnLogout = new JButton("Logout");
        btnLogout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                Library.main(new String[]{});
                frame.dispose();
            }
        });
        btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 15));
       btnLogout.setBackground(new Color(124, 85, 227));
        btnLogout.setForeground(Color.WHITE);
        btnLogout.setFocusable(false);
        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
                gl_contentPane.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addContainerGap(150, Short.MAX_VALUE)
                                .addComponent(lblAdminSection, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
                                .addGap(283))
                        .addGroup(GroupLayout.Alignment.LEADING, gl_contentPane.createSequentialGroup()
                                .addGap(164)
                                .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnDeleteLibrarian, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnViewLibrarian, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(109, Short.MAX_VALUE))
        );
        gl_contentPane.setVerticalGroup(
                gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addComponent(lblAdminSection, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                .addGap(11)
                                .addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(btnViewLibrarian, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(btnDeleteLibrarian, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(21, Short.MAX_VALUE))
        );
        contentPane.setLayout(gl_contentPane);
    }
}
