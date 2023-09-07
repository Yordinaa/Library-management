package My_Classes.Librarian;

import My_Classes.Librarian.LibrarianSuccess;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DeleteBooks extends JFrame {
    static DeleteBooks frame;
    private JPanel contentPane;
    private JTextField callNoTextField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame = new DeleteBooks();
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
    public DeleteBooks() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 550, 500);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        JLabel lblEnterCallNO = new JLabel("Enter Book callno:");
        lblEnterCallNO.setSize(200,150);
        JTextField callNoTextField = new JTextField(20);
        callNoTextField.setColumns(10);
        callNoTextField.setSize(200,150);

        JButton btnDelete = new JButton("Delete");
        btnDelete.setBackground(Color.RED);
        btnDelete.setForeground(Color.white);
        btnDelete.setSize(200,150);
        btnDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String callNo = callNoTextField.getText();
                int result = BookDao.deleteBookByCallNo(callNo);

                    if( result==0){
                        JOptionPane.showMessageDialog(DeleteBooks.this,"Record deleted successfully!");
                    }else{
                        JOptionPane.showMessageDialog(DeleteBooks.this,"Unable to delete. We have the book!");
                    }
                }

        });
        btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 13));

        JButton btnNewButton = new JButton("Back");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LibrarianSuccess.main(new String[]{});
                frame.dispose();
            }
        });
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
                gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addGap(29)
                                .addComponent(lblEnterCallNO)
                                .addGap(25)
                                .addComponent(callNoTextField, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(107, Short.MAX_VALUE))
                        .addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
                                .addContainerGap(175, Short.MAX_VALUE)
                                .addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
                                .addGap(140))
                        .addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
                                .addContainerGap(322, Short.MAX_VALUE)
                                .addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        gl_contentPane.setVerticalGroup(
                gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addGap(19)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                        .addComponent(callNoTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblEnterCallNO))
                                .addGap(33)
                                .addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                .addGap(43)
                                .addComponent(btnNewButton)
                                .addContainerGap(78, Short.MAX_VALUE))
        );
        contentPane.setLayout(gl_contentPane);
    }
}
