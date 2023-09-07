package My_Classes;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;

public class MyFrame extends JFrame {
    static MyFrame frame;
    private JPanel contentPane;
    private BufferedImage image;
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame= new MyFrame();
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
    public MyFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 650, 550);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(15, 5, 5, 5));
        contentPane.setBackground(new Color(51, 35, 85));
        ;
        setContentPane(contentPane);


        // Create a JPanel
        JPanel panel = new JPanel(new BorderLayout());

        // Create a new ImageIcon object
        ImageIcon background = new ImageIcon("C:\\xampp\\htdocs\\LibraryManagementSystem - Copy\\src\\My_Images\\home_library_image.jpg");
        background.getImage();
        setVisible(true);
        // Create a new JLabel and set its ImageIcon

        JLabel label = new JLabel(background);

        label.setBounds(0, 0, 10, 10);


        // Add the JLabel to the JPanel
        panel.add(label);

        // Add the JPanel to the JFrame
        add(panel);

        // Show the JFrame
        setVisible(true);

        JButton btnNewButton = new JButton("open");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Library.main(new String[]{});
                frame.dispose();
            }
        });
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
        btnNewButton.setBackground(new Color(124, 85, 227));
        btnNewButton.setFocusable(false);
        GroupLayout gl_contentPane = new GroupLayout(panel);
        gl_contentPane.setHorizontalGroup(
                gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addGap(40))
                        .addGroup(GroupLayout.Alignment.TRAILING, gl_contentPane.createSequentialGroup()
                                .addContainerGap(42, Short.MAX_VALUE)
                                .addComponent(label, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE)
                                .addGap(40))
                        .addGroup(GroupLayout.Alignment.TRAILING, gl_contentPane.createSequentialGroup()
                                .addContainerGap(42, Short.MAX_VALUE)

                                .addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE,110,GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        gl_contentPane.setVerticalGroup(
                gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()

                                .addGap(43)
                                .addComponent(label)
                                .addGap(43)
                                .addComponent(btnNewButton)
                                .addContainerGap(18, Short.MAX_VALUE))
        );
        panel.setLayout(gl_contentPane);
    }}