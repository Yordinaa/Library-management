package My_Classes.Admin;

import My_Classes.Library;

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
import javax.swing.JPasswordField;

public class AdminLogin extends JFrame {
    static AdminLogin frame;
    private JPanel contentPane;
    private JTextField textField;
    private JPasswordField passwordField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame = new AdminLogin();
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
    public AdminLogin() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setBackground(new Color(51, 35, 85));

        setContentPane(contentPane);

        JLabel lblAdminLoginForm = new JLabel("Admin Login Form");
        lblAdminLoginForm.setForeground(Color.white);
        lblAdminLoginForm.setFont(new Font("Tahoma", Font.PLAIN, 19));

        JLabel lblEnterName = new JLabel("Enter Name:");
        lblEnterName.setForeground(Color.WHITE);

        JLabel lblEnterPassword = new JLabel("Enter Password:");
        lblEnterPassword.setForeground(Color.WHITE);
        textField = new JTextField();
        textField.setColumns(10);

        JButton btnLogin = new JButton("Login");
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name=textField.getText();
                String password=String.valueOf(passwordField.getPassword());
                if(name.equals("admin")&&password.equals("admin123")){
                    AdminSuccess.main(new String[]{});
                    frame.dispose();
                }else{
                    JOptionPane.showMessageDialog(AdminLogin.this, "Sorry, Username or Password Error","Login Error!", JOptionPane.ERROR_MESSAGE);
                    textField.setText("");
                    passwordField.setText("");
                }
            }

        }); btnLogin.setFocusable(false);
        JButton btnLogout = new JButton("Back");
        btnLogout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Library.main(new String[]{});
                frame.dispose();
            }
        });btnLogout.setFocusable(false);
        passwordField = new JPasswordField();
        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
                gl_contentPane.createParallelGroup(Alignment.TRAILING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                .addGap(144)
                                                .addComponent(lblAdminLoginForm))
                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                .addGap(19)
                                                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                                        .addComponent(lblEnterName)
                                                        .addComponent(lblEnterPassword))
                                                .addGap(35)
                                                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
                                                        .addComponent(passwordField)
                                                        .addComponent(textField, GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))))

                                .addContainerGap(107, Short.MAX_VALUE))
                        .addGap(154)
                        .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)


                                .addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                .addGap(222))
        );
        gl_contentPane.setVerticalGroup(
                gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addComponent(lblAdminLoginForm)
                                .addGap(26)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblEnterName)
                                        .addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(28)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblEnterPassword)
                                        .addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(28)
                                .addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(190, Short.MAX_VALUE))

        );
        contentPane.setLayout(gl_contentPane);
    }
}

